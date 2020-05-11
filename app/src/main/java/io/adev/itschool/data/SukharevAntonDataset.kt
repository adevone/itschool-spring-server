package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product

class SukharevAntonDataset {
    fun getData(): List<Category> {
        return listOf(
            Category(
                "Sample",
                listOf(
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
                    )
                )
            )
        )
    }
}