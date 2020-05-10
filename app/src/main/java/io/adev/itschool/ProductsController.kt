package io.adev.itschool

import io.adev.itschool.data.KolyvanovArtemDataset
import io.adev.itschool.data.SukharevAntonDataset
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

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
        "Kolyvanov" to KolyvanovArtemDataset().getData()
)


private val productListsByAuthor = mapOf(
    "default" to listOf(
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
            id = "1",
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

    @ExceptionHandler(NoAuthorException::class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun handleException(e: NoAuthorException): NoAuthorException.Response {
        return e.toResponse()
    }
}

class NoAuthorException(
    private val name: String
) : RuntimeException("no author with name=$name") {

    data class Response(
        val name: String,
        val message: String
    )

    fun toResponse() = Response(name, message!!)
}