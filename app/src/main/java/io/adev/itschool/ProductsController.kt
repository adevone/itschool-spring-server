package io.adev.itschool

import io.adev.itschool.data.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArrayList

data class Category(
    val name: String,
    val products: List<Product>
)

data class Product(
    val id: String,
    val name: String,
    val price: Money,
    val discountPercent: Int,
    val description: String,
    val imageUrl: String,
    val attributes: List<Attribute>
) {
    data class Attribute(
        val name: String,
        val value: String
    )
}

typealias Money = Double

private val productsListByAuthorCategory = mapOf(
        "Sukharev" to SukharevAntonDataset().getData(),
        "Kolyvanov" to KolyvanovArtemDataset().getData(),
        "Bondarenko" to BondarenkoYuryDataset().getData(),
        "Rakipov" to RakipovIlyaDataset().getData()
)

val productListsByAuthor = ConcurrentHashMap(
    mapOf(
        "default" to CopyOnWriteArrayList(
            mutableListOf(
                Product(
                    id = "1",
                    name = "Mrkvkv",
                    price = 123.5,
                    discountPercent = 15,
                    description = "Морковка немытая",
                    imageUrl = "https://i.pinimg.com/originals/3e/50/d3/3e50d3c1231de7f7105e017a2ee85874.jpg",
                    attributes = listOf(
                        Product.Attribute(
                            name = "Качество",
                            value = "Наивысшее"
                        ),
                        Product.Attribute(
                            name = "Производитель",
                            value = "The Grandma Inc."
                        )
                    )
                ),
                Product(
                    id = "2",
                    name = "Kotoshkv",
                    price = 312.7,
                    discountPercent = 25,
                    description = "Картошка белая",
                    imageUrl = "https://memepedia.ru/wp-content/uploads/2019/07/chilipizdrik-14-360x270.jpg",
                    attributes = listOf(
                        Product.Attribute(
                            name = "Качество",
                            value = "Наивысшайшее"
                        ),
                        Product.Attribute(
                            name = "Производитель",
                            value = "The Grandma Inc."
                        )
                    )
                )
            )
        ),
        "Zinevich" to CopyOnWriteArrayList(
            ZinevichYanDataset().getData().map { it.product }.toMutableList()
        )
    )
)

val productListWithCategoryAndPhoto = ConcurrentHashMap(
    mapOf(
        "Zinevich" to ZinevichYanDataset().getData()
    )
)

@RestController
class ProductsController {

    @GetMapping("products/all/{author}")
    fun all(@PathVariable author: String): List<Product> {
        return productListsByAuthor[author] ?: throw NoAuthorException(author)
    }

    @GetMapping("products/allWithCategories/{author}/")
    fun allWithCategories(@PathVariable author: String): List<Category> {
        return productsListByAuthorCategory[author] ?: throw NoAuthorException(author)
    }

    @PostMapping("products/all/{author}/")
    fun addProduct(@PathVariable author: String, @RequestBody product: Product) {
        if (productListsByAuthor.containsKey(author)) {
            productListsByAuthor[author]!!.add(product)
        } else {
            productListsByAuthor[author] = CopyOnWriteArrayList<Product>().apply { add(product) }
        }
    }

    @GetMapping("products/hints/{author}/{query}/{maxSize}")
    fun getHints(@PathVariable author: String, @PathVariable query: String, @PathVariable maxSize: Int): List<String> {
        val itemsByAuthor = productListsByAuthor[author] ?: throw NoAuthorException(author)

        return itemsByAuthor.mapNotNull {
            if (it.name.toLowerCase().contains(query.toLowerCase()))
                it.name
            else
                null
        }.take(maxSize)
    }

    @GetMapping("products/withCategoryAndPhoto/all/{author}")
    fun getWithCategoryAndPhoto(@PathVariable author: String): List<ProductAnswer>{
        val items = productListWithCategoryAndPhoto[author] ?: throw NoAuthorException(author)

        return items.map { it.mapToProductAnswer() }
    }

    @GetMapping("products/withCategoryAndPhoto/all/{author}/{id}")
    fun getByIdWithCategoryAndPhoto(@PathVariable author: String, @PathVariable id: String): ProductAnswer?{
        val items = productListWithCategoryAndPhoto[author] ?: throw NoAuthorException(author)


        return items.firstOrNull { it.product.id == id }?.mapToProductAnswer()
    }

    @GetMapping("products/all/{author}/{id}")
    fun getById(@PathVariable author: String, @PathVariable id: String): Product {
        val itemsByAuthor = productListsByAuthor[author] ?: throw NoAuthorException(author)

        return itemsByAuthor.firstOrNull { it.id == id }
            ?: throw NotFoundedException(id, "Product not founded $id")
    }

    @ExceptionHandler(NotFoundedException::class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun handleException(e: NotFoundedException): NotFoundedException.Response {
        return e.toResponse()
    }
}

open class NotFoundedException(
    private val notFounded: String,
    private val errorMessage: String
) : RuntimeException(errorMessage) {

    data class Response(
        val name: String,
        val message: String
    )

    fun toResponse() = Response(notFounded, errorMessage)
}

class NoAuthorException(
    name: String
) : NotFoundedException(name, "Author not found $name")