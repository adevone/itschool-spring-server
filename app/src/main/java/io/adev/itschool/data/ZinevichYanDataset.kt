package io.adev.itschool.data

import io.adev.itschool.MainCategory
import io.adev.itschool.Product
import io.adev.itschool.SubCategory
import java.util.concurrent.CopyOnWriteArrayList

private val electro6StringsCategory = SubCategory("6 струн", MainCategory("Электрогитара"))

class ZinevichYanDataset {
  fun getData(): CopyOnWriteArrayList<Product> = CopyOnWriteArrayList(
      listOf(
          Product(
              "1",
              "James Hatfield Guitar",
              200000.0,
              30,
              "Games Hatfield's Guitar",
              "https://www.dhresource.com/0x0/f2/albu/g10/M00/F6/08/rBVaVlwrLiKAYMJ4AAGy0mCaXtI325.jpg",
              listOf(
                  Product.Attribute("Производитель", "Gibson"),
                  Product.Attribute("Количество струн", "6")
              )
          ).also { it.category = electro6StringsCategory},
          Product(
              "2",
              "Fender stratocaster",
              30000.0,
              10,
              "Guitar's classic",
              "https://www.thomann.de/pics/bdb/465367/14127517_800.jpg",
              listOf(
                  Product.Attribute("Производитель", "Fender"),
                  Product.Attribute("Количество струн", "6")
              )
          ).also { it.category = electro6StringsCategory }
      )
  )
}