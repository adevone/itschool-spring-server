package io.adev.itschool

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

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

private val productListsByAuthor = mutableMapOf(
    "default" to mutableListOf(
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
            price = 500.2,
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
)

@RestController
class ProductsController {

    @GetMapping("products/all/{author}")
    fun all(@PathVariable author: String): List<Product> {
        return productListsByAuthor[author] ?: throw NotFoundException(author, "Author not found $author")
    }

    @GetMapping("products/all/{author}/{id}")
    fun byId(@PathVariable author: String, @PathVariable id: String): Product{
        val products = all(author)

        return products.firstOrNull { it.id == id } ?: throw NotFoundException(id, "Product with id=$id not found")
    }

    @PostMapping("products/all/{author}/")
    fun addProduct(@PathVariable author: String, @RequestBody product: Product){
        if(productListsByAuthor.containsKey(author)){
            productListsByAuthor[author]?.add(product)
        }
        else{
            productListsByAuthor[author] = mutableListOf(product)
        }
    }

    @GetMapping("/products/hints/{author}/{query}/{maxSize}")
    fun getHints(@PathVariable author: String, @PathVariable query: String, @PathVariable maxSize: Int): List<String> {
        if(productListsByAuthor.containsKey(author)){
            return productListsByAuthor[author]?.filter { it.name.contains(query) }?.map { it.name }?.take(maxSize) ?: listOf()
        }
        else{
            throw NotFoundException(author, "Author not found $author")
        }
    }

    @ExceptionHandler(NotFoundException::class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun handleException(e: NotFoundException): NotFoundException.Response {
        return e.toResponse()
    }
}

class NotFoundException(
    private val notFounded: String,
    private val errorMessage: String
) : RuntimeException(errorMessage) {

    data class Response(
        val name: String,
        val message: String
    )

    fun toResponse() = Response(notFounded, errorMessage)
}