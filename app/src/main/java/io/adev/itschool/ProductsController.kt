package io.adev.itschool

import io.adev.itschool.data.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArrayList

data class Category(
    val name: String,
    val products: CopyOnWriteArrayList<Product>
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

val productsListByAuthorCategory = mapOf(
    "Sukharev" to SukharevAntonDataset(),
    "Kolyvanov" to KolyvanovArtemDataset(),
    "Bondarenko" to BondarenkoYuryDataset(),
    "Rakipov" to RakipovIlyaDataset(),
    "Kireev" to KireevVildanDataset(),
    "Shumilin" to ShumilinPavelDataset()
)

val productListWithCategoryAndPhoto = ConcurrentHashMap(
    mapOf(
        "Zinevich" to ZinevichYanDataset().getData()
    )
)

val productListsByAuthor: ConcurrentHashMap<String, CopyOnWriteArrayList<Product>> = ConcurrentHashMap(
    mapOf(
        "default" to CopyOnWriteArrayList(DefaultDataset().getData())
    ) + productListWithCategoryAndPhoto
        .map { (author, productsWithProto) ->
            author to CopyOnWriteArrayList(productsWithProto.map { it.product })
        }
        .toMap() + productsListByAuthorCategory
        .map { (author, categories) ->
            author to CopyOnWriteArrayList(categories.data.flatMap { it.products })
        }
        .toMap()
)

@RestController
class ProductsController {

    @GetMapping("products/all/{author}")
    fun all(@PathVariable author: String): List<Product> {
        return productListsByAuthor[author] ?: throw NoAuthorException(author)
    }

    @GetMapping("products/allWithCategories/{author}/")
    fun allWithCategories(@PathVariable author: String): List<Category> {
        return productsListByAuthorCategory[author]?.data ?: throw NoAuthorException(author)
    }

    @PostMapping("products/all/{author}/")
    fun addProduct(@PathVariable author: String, @RequestBody product: Product) {
        if (productListsByAuthor.containsKey(author)) {
            productListsByAuthor[author]!!.add(product)
        } else {
            productListsByAuthor[author] = CopyOnWriteArrayList(listOf(product))
        }
    }

    @PostMapping("products/allWithCategories/{author}/{category}")
    fun addProductToCategory(@PathVariable author: String, @PathVariable category: String, @RequestBody product: Product) {
        val dataset = productsListByAuthorCategory[author] ?: throw NoAuthorException(author)

        if (dataset.hasCategory(category)) {
            dataset.addProduct(category, product)
        } else {
            dataset.createCategory(category, CopyOnWriteArrayList(listOf(product)))
        }
    }

    @GetMapping("products/allWithCategories/{author}/{category}")
    fun getCategory(@PathVariable author: String, @PathVariable category: String): Category {
        val dataset = productsListByAuthorCategory[author] ?: throw NoAuthorException(author)

        return dataset.getCategory(category) ?: throw NotFoundedException(category, "There is no such $category")
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
    fun getWithCategoryAndPhoto(@PathVariable author: String): List<ProductAnswer> {
        val items = productListWithCategoryAndPhoto[author] ?: throw NoAuthorException(author)

        return items.map { it.mapToProductAnswer() }
    }

    @GetMapping("products/withCategoryAndPhoto/all/{author}/{id}")
    fun getByIdWithCategoryAndPhoto(@PathVariable author: String, @PathVariable id: String): ProductAnswer? {
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