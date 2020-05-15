package io.adev.itschool

data class ProductWithCategoryAndPhoto(
        val product: Product,
        val category: SubCategory,
        val otherPhotos: List<String> = listOf()
) {
    fun mapToProductAnswer(): ProductAnswer{
        return ProductAnswer(
                product.id,
                product.name,
                product.price,
                product.discountPercent,
                product.description,
                product.imageUrl,
                product.attributes,
                category,
                otherPhotos
        )
    }
}

data class ProductAnswer(
    val id: String,
    val name: String,
    val price: Money,
    val discountPercent: Int,
    val description: String,
    val imageUrl: String,
    val attributes: List<Product.Attribute>,
    val category: SubCategory,
    val otherPhotos: List<String>
)

data class SubCategory(
        val name: String,
        val mainCategory: MainCategory
)

data class MainCategory(
        val name: String
){
    constructor() : this("")
}