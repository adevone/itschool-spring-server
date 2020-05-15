package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product
import java.util.concurrent.CopyOnWriteArrayList

abstract class BaseDataset {
    fun getCategoryNames(): List<String> {
        return data.map { it.name }
    }

    fun getCategory(category: String): Category? {
        return data.firstOrNull {
            it.name == category
        }
    }

    fun addProduct(category: String, product: Product) {
        data.firstOrNull {
            it.name == category
        }?.products?.add(product) ?: data.add(Category(category, CopyOnWriteArrayList(listOf((product)))))
    }

    abstract var data: CopyOnWriteArrayList<Category>

    fun hasCategory(category: String): Boolean {
        val categoryNames = getCategoryNames()

        return categoryNames.contains(category)
    }

    fun createCategory(category: String, products: CopyOnWriteArrayList<Product>) {
        data.add(
            Category(
                name = category,
                products = products
            )
        )
    }
}