package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product
import java.util.concurrent.CopyOnWriteArrayList

class ShumilinPavelDataset : BaseDataset() {
    override var data = CopyOnWriteArrayList(
        listOf(
            Category(
                "Посуда",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "1",
                            name = "Кружка \"Добрый кот\"",
                            price = 550.0,
                            discountPercent = 3,
                            description = "Керамическая кружка с котом и трубкой",
                            imageUrl = "http://mykotomania.ru/wp-content/uploads/2020/03/400.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал",
                                    value = "Керамика"
                                ),
                                Product.Attribute(
                                    name = "Объем",
                                    value = "400 мл"
                                ),
                                Product.Attribute(
                                    name = "Состав",
                                    value = "Кружка, крышка, металлическая ложка"
                                )
                            )
                        ),
                        Product(
                            id = "2",
                            name = "Подставки под горячее \"Котик\"",
                            price = 200.0,
                            discountPercent = 0,
                            description = "Набор деревянных подставок под горячую посуду",
                            imageUrl = "http://mykotomania.ru/wp-content/uploads/2020/03/подставки-под-горячее-котики.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Количество",
                                    value = "4 штуки"
                                ),
                                Product.Attribute(
                                    name = "Размеры",
                                    value = "19 см х 13 см"
                                )
                            )
                        ),
                        Product(
                            id = "3",
                            name = "Термос \"Дом там, где кот\"",
                            price = 900.0,
                            discountPercent = 10,
                            description = "Термос для любительницы кошек",
                            imageUrl = "http://mykotomania.ru/wp-content/uploads/2019/11/термос-с-котом.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал",
                                    value = "Металл, пластик"
                                ),
                                Product.Attribute(
                                    name = "Объем",
                                    value = "500 мл"
                                ),
                                Product.Attribute(
                                    name = "Вес",
                                    value = "300 г"
                                )
                            )
                        ),
                        Product(
                            id = "4",
                            name = "Кружка с ложкой \"Радостный кот\"",
                            price = 980.0,
                            discountPercent = 0,
                            description = "Голова котика - это крышка, которая спасет ваш напиток от остывания, а в лапках котик держит ложку-рыбку",
                            imageUrl = "https://sun9-3.userapi.com/impf/c847216/v847216505/24e33/8nDARluCITM.jpg?size=520x0&quality=90&sign=ab6236310c10abcbdb72a24e494168bf",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал",
                                    value = "Керамика"
                                ),
                                Product.Attribute(
                                    name = "Объем",
                                    value = "400 мл"
                                ),
                                Product.Attribute(
                                    name = "Высота",
                                    value = "16,5 см"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Подушки",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "5",
                            name = "Декоративная подушка \"Кот Уголь\"",
                            price = 1800.0,
                            discountPercent = 10,
                            description = "Декоративная подушка в виде кота",
                            imageUrl = "https://static-eu.insales.ru/images/products/1/906/174113674/large_A131-2.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Наполнитель",
                                    value = "Гранулы полистирола, диаметр < 1 мм"
                                ),
                                Product.Attribute(
                                    name = "Обшивка",
                                    value = "Трикотаж"
                                ),
                                Product.Attribute(
                                    name = "Высота",
                                    value = "30 см"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Черный"
                                )
                            )
                        ),
                        Product(
                            id = "6",
                            name = "Подушка \"Котики\"",
                            price = 1090.0,
                            discountPercent = 15,
                            description = "Подушка \"Котики\". Наволочка на молнии, легко снимается для стирки",
                            imageUrl = "https://storage.vsemayki.ru/images/0/1/1650/1650697/previews/people_2_cushion_full_front_white_500.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Наполнитель",
                                    value = "Холлофайбер"
                                ),
                                Product.Attribute(
                                    name = "Наволочка",
                                    value = "Полиэстер"
                                ),
                                Product.Attribute(
                                    name = "Размеры",
                                    value = "40 см х 40 см"
                                )
                            )
                        ),
                        Product(
                            id = "7",
                            name = "Мягкая игрушка \"Кот Кэмерон\"",
                            price = 799.0,
                            discountPercent = 0,
                            description = "Кот Кэмерон любит прыгать, прятаться в коробки, строить крепости и кататься на скейтборде по городу.",
                            imageUrl = "https://cdn1.ozone.ru/s3/multimedia-t/wc1200/6011186201.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Мягкая игрушка"
                                ),
                                Product.Attribute(
                                    name = "Материал",
                                    value = "Полиэстер"
                                ),
                                Product.Attribute(
                                    name = "Возраст ребенка",
                                    value = "От 3 лет"
                                ),
                                Product.Attribute(
                                    name = "Страна-изготовитель",
                                    value = "Китай"
                                ),
                                Product.Attribute(
                                    name = "Вес",
                                    value = "170 г"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Сувениры",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "8",
                            name = "Котенок на воздушном шаре",
                            price = 1232.0,
                            discountPercent = 5,
                            description = "Котенок на воздушном шаре",
                            imageUrl = "https://pict.belvedor.com/6/e2/6e2a8ed2284453903dee4a3938fb5eb8.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал",
                                    value = "Полистоун"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Голубой"
                                ),
                                Product.Attribute(
                                    name = "Размеры",
                                    value = "11 х 11 х 19,5 см"
                                ),
                                Product.Attribute(
                                    name = "Вес",
                                    value = "390 г"
                                )
                            )
                        ),
                        Product(
                            id = "9",
                            name = "Котенок персидский",
                            price = 943.0,
                            discountPercent = 10,
                            description = "Котенок персидский",
                            imageUrl = "https://pict.belvedor.com/3/1f/31f00de73155cfe55e2aa979dda1819c.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал",
                                    value = "Полистоун"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Серый"
                                ),
                                Product.Attribute(
                                    name = "Размеры",
                                    value = "16 х 12 х 16 см"
                                ),
                                Product.Attribute(
                                    name = "Вес",
                                    value = "365 г"
                                )
                            )
                        ),
                        Product(
                            id = "10",
                            name = "Кошка с бантом и котёнком",
                            price = 1022.0,
                            discountPercent = 0,
                            description = "Сувенир полистоун кошка с бантом и котёнком",
                            imageUrl = "https://pict.belvedor.com/6/58/6581d84f3b3b29b25e7632db0aa6013e.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал",
                                    value = "Полистоун"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Серый"
                                ),
                                Product.Attribute(
                                    name = "Размеры",
                                    value = "8,5 х 15,5 х 20 см"
                                ),
                                Product.Attribute(
                                    name = "Вес",
                                    value = "490 г"
                                )
                            )
                        )
                    )
                )
            )
        )
    )
} 