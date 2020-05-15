package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product
import java.util.concurrent.CopyOnWriteArrayList

class KolyvanovArtemDataset : BaseDataset() {

    override var data = CopyOnWriteArrayList(
        listOf(
            Category(
                "Столы",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "1",
                            name = "Стол amfibia",
                            price = 1599.0,
                            discountPercent = 15,
                            description = "Стол черный,лакированный",
                            imageUrl = "http://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkkKSYq0X4V1Cd5mCf0rWXWqaKTM5SRkZCeTgDn6uOyic",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Качество",
                                    value = "Среднее"
                                ),
                                Product.Attribute(
                                    name = "Производитель",
                                    value = "Уральская компания мебель"
                                )
                            )
                        ),
                        Product(
                            id = "2",
                            name = "Стол царский",
                            price = 312.7,
                            discountPercent = 25,
                            description = "Стол для всей семьи",
                            imageUrl = "https://mirmebeli68.ru/wp-content/uploads/2020/03/transformer-sonoma-1024x768.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Качество",
                                    value = "Наивысшайшее"
                                ),
                                Product.Attribute(
                                    name = "Производитель",
                                    value = "MiassMebel"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Стулья",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "3",
                            name = "Стул amfibia",
                            price = 1599.0,
                            discountPercent = 15,
                            description = "Стул черный,лакированный",
                            imageUrl = "https://vsedekor.ru/upload/iblock/652/65263cee701f3292eb1a0a2e049f2551.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Качество",
                                    value = "Среднее"
                                ),
                                Product.Attribute(
                                    name = "Производитель",
                                    value = "Уральская компания мебель"
                                )
                            )
                        ),
                        Product(
                            id = "4",
                            name = "Стул царский",
                            price = 312.7,
                            discountPercent = 25,
                            description = "Стул для всей семьи",
                            imageUrl = "https://13chairs.ru/wp-content/uploads/2018/10/IMG_4863_1000_MAXI-WHITE-NATURAL.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Качество",
                                    value = "Наивысшайшее"
                                ),
                                Product.Attribute(
                                    name = "Производитель",
                                    value = "MiassMebel"
                                )
                            )
                        )
                    )
                )
            )
        )
    )
}