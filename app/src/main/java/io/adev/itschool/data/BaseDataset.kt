package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product

abstract class BaseDataset {
    fun getCategoryNames(): List<String> {
        return data.map{ it.name }
    }

    fun addProduct(category: String, product: Product) {
        data.firstOrNull {
            it.name == category
        }?.products?.add(product) ?: data.add(Category(category, mutableListOf(product)))
    }

    abstract var data: MutableList<Category>

    fun hasCategory(category: String): Boolean {
        val categoryNames = getCategoryNames()

        return categoryNames.contains(category)
    }

    fun createCategory(category: String, products: MutableList<Product>) {
        data.add(
            Category(
                name = category,
                products = products
            )
        )
    }
}