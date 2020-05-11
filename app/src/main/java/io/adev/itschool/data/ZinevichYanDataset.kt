package io.adev.itschool.data

import io.adev.itschool.MainCategory
import io.adev.itschool.Product
import io.adev.itschool.SubCategory
import java.util.concurrent.CopyOnWriteArrayList


class ZinevichYanDataset {
  private val electroGuitar = MainCategory("Электрогитара")

  private val electro6StringsCategory = SubCategory("6 струн", electroGuitar)
  private val lesPaulElectric = SubCategory("Les Paul", electroGuitar)
  private val customElectric = SubCategory("Custom", electroGuitar)
  private val stratocasterElectric = SubCategory("Stratocaster", electroGuitar)

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
          ).also {
            it.category = customElectric
            it.otherPhotos.addAll(listOf(
                "https://media.sweetwater.com/api/i/q-82__ha-34fd339e0d10c4f7__hmac-290a17714581e472e8decfd7c75c9350ea0634c5/images/items/750/SNAKEBYTESW-large.jpg",
                "https://www.thomann.de/pics/bdb/486724/14886665_800.jpg",
                "https://cdn.shopify.com/s/files/1/0288/1498/products/esp-ltd-electric-guitar-esp-ltd-left-handed-james-hetfield-snakebyte-electric-guitar-white-4582588907556.jpg?v=1575932484"
            ))
          },
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
          ).also {
            it.category = stratocasterElectric
            it.otherPhotos.addAll(listOf(
                "https://media.sweetwater.com/api/i/q-82__ha-57ef4b7beeae831c__hmac-d039b90cdd26176f2b48d4e55351a630c6f2932e/images/items/750/StratAPEHHR3B-large.jpg",
                "https://images.reverb.com/image/upload/s--7-6xLykN--/v1567010395/dkmqc2qbusekuvkjasdq.jpg",
                "https://d1aeri3ty3izns.cloudfront.net/media/36/366987/1200/preview.jpg",
                "https://images-na.ssl-images-amazon.com/images/I/615cA5XD%2BOL._AC_SY879_.jpg"
            ))
          },
          Product(
              "3",
              "Gibson Les Paul",
              300000.0,
              10,
              "С 1983 г., Gibson доказывал, что меньше, не значит хуже, тем более когда речь идет о популярной модели Les Paul Studio. Первоначально модель была разработанадля студийных музыкантов, но ее приняли всем сердцем разные гитаристы.\n" +
                  "Все элементы легендарного Les Paul Standard по-прежнему присутствуют, в том числе звук, основанный на сочетании клена, красного дерева и двух настоящих «Гибсоновких» датчиков.\n" +
                  "Отказавшись от использования окантовки корпуса и грифа, и применяя изящный золотой логотип вместо инкрустации - Gibson Les Paul Studio выигрывает в цене, что многие гитаристы находят интересным в течении трех десятилетий.",
              "https://www.musik-produktiv.com/pic-010109188xl/gibson-les-paul-standard-heritage-cherry-sunburst-10109188.jpg",
              listOf(
                  Product.Attribute("Производитель", "Gibson"),
                  Product.Attribute("Количество струн", "6"),
                  Product.Attribute("Корпус", "красное дерево, полый."),
                  Product.Attribute("Гриф", "красное дерево, 22 лада, 50's профиль."),
                  Product.Attribute("Накладка грифа", "палисандр, трапециевидные отметки ладов"),
                  Product.Attribute("Мензура", "24,75\""),
                  Product.Attribute("Бридж", "Tune-O-Matic"),
                  Product.Attribute("Звукосниматели", "490R / 498T"),
                  Product.Attribute("Регулировки", "2 х громкость, 2 тона, 3-поз.переключатель"),
                  Product.Attribute("Фурнитура", "хром")
              )
          ).also {
            it.category = lesPaulElectric
            it.otherPhotos.addAll(listOf(
                "https://cdn.webshopapp.com/shops/179375/files/265346378/683x1024x2/gibson-gibson-les-paul-leos-59-reissue-kalamazoo-c.jpg",
                "https://static.keymusic.com/products/260492/XL/gibson-custom-shop-1959-les-paul-standard-washed-cherry-figured-vos.jpg",
                "https://www.bigtone.in.th/wp-content/uploads/2019/11/GS-STD50-LP-HCB-02.jpg"
            ))
          },
          Product(
              "4",
              "Epiphone Les Paul",
              40000.0,
              0,
              "Судьбы компании Epiphone и виртуозного музыканта-новатора Леса Пола (Les Paul) пересеклись в начале 40-х годов прошлого века. Лес работал до поздной ночи на фабрике Epiphone на 14-ой стрит в Нью Йорке. Именно тогда родилась первая цельнокорпусная электрогитара, известная в мире как \"Бревно\" (The Log). Весь следующий год Лес Пол провёл бок-о-бок с мастерами Epiphone обсуждая идеи новой гитары. \"Epiphone всегда делали хорошие гитары,\" часто говорил Лес Пол",
              "https://cdn.shoplightspeed.com/shops/607207/files/18264608/epiphone-les-paul-modern-sparkling-burgundy.jpg",
              listOf(
                  Product.Attribute("Производитель", "Epiphone"),
                  Product.Attribute("Количество струн", "6"),
                  Product.Attribute("Корпус", "красное дерево, полый."),
                  Product.Attribute("Гриф", "красное дерево, 22 лада, 1960s SlimTaper™ “D” Profile."),
                  Product.Attribute("Накладка грифа", "палисандр, трапециевидные отметки ладов"),
                  Product.Attribute("Мензура", "24,75\""),
                  Product.Attribute("Бридж", "Tune-O-Matic"),
                  Product.Attribute("Звукосниматели", "700T/650R open-coil"),
                  Product.Attribute("Регулировки", "громкость, тон, 3-поз.переключатель"),
                  Product.Attribute("Фурнитура", "хром")
              )
          ).also {
            it.category = lesPaulElectric
            it.otherPhotos.addAll(listOf(
                "https://www.pmtonline.co.uk/media/catalog/product/cache/1/image/900x/9df78eab33525d08d6e5fb8d27136e95/8/6/86679-eilmsbunh1.jpg",
                "https://media.sweetwater.com/api/i/q-82__ha-1dcec90ddc4077dd__hmac-3a5999d908539f0d00f4989c083c2eb39f32a2e5/images/items/750/EILMSBUNH-large.jpg",
                "https://images.reverb.com/image/upload/s--JVe9thX2--/a_exif,c_limit,e_unsharp_mask:80,f_auto,fl_progressive,g_south,h_1600,q_80,w_1600/v1465398038/ocm3hs0kprow7edo19ux.jpg"
            ))
          },
          Product(
              "5",
              "Gibson Les Paul Black",
              400000.0,
              5,
              "'The Fretless Wonder' - что значит \"Безладовое Чудо\" - так окрестили несравненный Gibson Les Paul Custom\uFEFF  за ее низкопрофильные лады и контраснто-черный бесподобный внешний вид.",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQdHP8T0WW134BWD-W8kdhrRE8NbWCP_XPQXLVF-qT2zt85EC9i&usqp=CAU",
              listOf(
                  Product.Attribute("Производитель", "Gibson"),
                  Product.Attribute("Количество струн", "6"),
                  Product.Attribute("Корпус", "красное дерево."),
                  Product.Attribute("Гриф", "красное дерево, 22 лада."),
                  Product.Attribute("Накладка грифа", "палисандр."),
                  Product.Attribute("Мензура", "24,75\""),
                  Product.Attribute("Бридж", "Tune-O-Matic"),
                  Product.Attribute("Звукосниматели", "490R / 498T"),
                  Product.Attribute("Регулировки", "2 х громкость, 2 тона, 3-поз.переключатель"),
                  Product.Attribute("Фурнитура", "хром")
              )
          ).also {
            it.category = lesPaulElectric
            it.otherPhotos.addAll(listOf(
                "https://www.woodbrass.com/images/SQUARE400/woodbrass/GBI+LPB57VOEBGH1-1.JPG",
                "https://cdn.shopify.com/s/files/1/0533/5597/products/productg-2.png?v=1583855594",
                "https://www.pmtonline.co.uk/media/catalog/product/cache/1/image/1200x/9df78eab33525d08d6e5fb8d27136e95/7/5/75120-302993-gibson-les-paul-custom-eb-gloss-ebony-_3_.jpg"
            ))
          }
      )
  )
}