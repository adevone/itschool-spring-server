package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product
import java.util.concurrent.CopyOnWriteArrayList

class KireevVildanDataset : BaseDataset() {
    override var data = CopyOnWriteArrayList(
        listOf(
            Category(
                "Нарезное",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "1",
                            name = "Карабин Сайга-9 кал. 9х19, исп. 02",
                            price = 44590.0,
                            discountPercent = 5,
                            description = "Самозарядный карабин Сайга-9",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/632/509_496_1/632de8f293b3f06c675abccf17e8ccb5.JPG",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "9х19"
                                ),
                                Product.Attribute(
                                    name = "Предохранитель",
                                    value = "Неавтоматический"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "350 мм"
                                )

                            )
                        ),
                        Product(
                            id = "2",
                            name = "Карабин Сайга кал.5,45х39, исп. 01, L-415",
                            price = 21990.0,
                            discountPercent = 2,
                            description = "Идеальный карабин для спортивной и тренировочной стрельбы",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/511/509_496_1/511c866d03e75b8b4539ecd35bb55e49.JPG",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "5,45х39"
                                ),
                                Product.Attribute(
                                    name = "Предохранитель",
                                    value = "Неавтоматический"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "415 мм"
                                )
                            )
                        ),
                        Product(
                            id = "3",
                            name = "Карабин Сайга 5,45х39 исп. 033",
                            price = 38490.0,
                            discountPercent = 10,
                            description = "Идеальный карабин для спортивной и тренировочной стрельбы",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/039/509_496_1/039e842b7ba4787d1d42b72e3b016775.JPG",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "5,45х39"
                                ),
                                Product.Attribute(
                                    name = "Предохранитель",
                                    value = "Неавтоматический"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "336 мм"
                                )
                            )
                        ),
                        Product(
                            id = "4",
                            name = "Карабин КО-30С 7,62х54R с ПУ",
                            price = 30355.0,
                            discountPercent = 0,
                            description = "Модификация карабина КО-30",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/610/509_496_1/6104760496bdb547e0a7c3aa2fdf0d5a.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "7,62х54R"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "745 мм"
                                )
                            )
                        ),
                        Product(
                            id = "5",
                            name = "Карабин Sabatti STR cal. 6,5 Creedmoor",
                            price = 244990.0,
                            discountPercent = 0,
                            description = "Карабин Sabatti STR подойдёт любителям спортинга",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/763/509_496_1/7638a8b7fa2eba126afba934c0704023.JPG",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "6,5"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Гладкоствольное",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "6",
                            name = "Карабин КО ВССЛ (Ланкастер)",
                            price = 84890.0,
                            discountPercent = 10,
                            description = "ВССЛ - самозарядное гладкоствольное охотничье ружьё со сверловкой «Ланкастер»",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/94b/509_496_1/94bb477babb5d4f94910e424006c983d.JPG",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = ".366ТКМ"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "403 мм"
                                ),
                                Product.Attribute(
                                    name = "Вес ружья",
                                    value = "2,7 кг"
                                )
                            )
                        ),
                        Product(
                            id = "7",
                            name = "Ружье ТОЗ-34 ЕР",
                            price = 27190.0,
                            discountPercent = 0,
                            description = "Отличный выбор для охотника",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/44b/509_496_1/44b520f4090ea2a8effef70c7dd8abb9.JPG",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "12/70"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "711 мм"
                                )
                            )
                        ),
                        Product(
                            id = "8",
                            name = "Ружье Сайга-12С исп.10",
                            price = 29290.0,
                            discountPercent = 0,
                            description = "Самозарядное гладкоствольное ружье Сайга-12С",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/081/509_496_1/0817d0be0d7a1e374d36f253ff377837.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "12"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "680 мм"
                                )
                            )
                        ),
                        Product(
                            id = "9",
                            name = "Ружье Сайга-20К исп. 04",
                            price = 27490.0,
                            discountPercent = 3,
                            description = "«Сайга-20К» практически полностью идентична модели «Сайга-20С».",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/08f/509_496_1/08f4b419ecb912f4ac06520d743a82b4.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "20/76"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "430 мм"
                                ),
                                Product.Attribute(
                                    name = "Масса без патронов",
                                    value = "3,5 кг"
                                ),
                                Product.Attribute(
                                    name = "Емкость магазина",
                                    value = "5 или 10 патронов"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Травматическое",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "10",
                            name = "Пистолет ООП МР-80-13Т",
                            price = 14490.0,
                            discountPercent = 0,
                            description = "Травматический пистолет МР-80-13Т",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/47f/509_496_1/47fac849bc8c51594d6127e45460044b.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "45 Rubber"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                )
                            )
                        ),
                        Product(
                            id = "11",
                            name = "Пистолет ООП МР-353",
                            price = 25990.0,
                            discountPercent = 0,
                            description = "Травматический пистолет MP-353",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/152/509_496_1/1529db2b84b792b975026ef637cb3b84.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = ".45 Rubber"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                )
                            )
                        ),
                        Product(
                            id = "12",
                            name = "Пистолет ООП WASP Grom",
                            price = 31995.0,
                            discountPercent = 0,
                            description = "Травматический пистолет WASP GROM",
                            imageUrl = "https://ohotaktiv.ru/upload/iblock/af9/af9ff2aadc803facd9f8813a9aa7c20e.jpeg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "9 мм"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Охолощенное",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "13",
                            name = "Автомат Калашникова ОС-АК103",
                            price = 20490.0,
                            discountPercent = 0,
                            description = "Легендарный Калаш, списанный с вооружения",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/9c0/509_496_1/9c068e3fc129ace1eadde80d8aed01ae.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "7,62х39"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                )
                            )
                        ),
                        Product(
                            id = "14",
                            name = "Пистолет Макарова «ПМ»",
                            price = 15490.0,
                            discountPercent = 0,
                            description = "Пистолет Макарова ПМ был принят на вооружение Советской армии в 1951 году",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/e33/509_496_1/e33d0a2e79bda1b53a881fa3f68b2867.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "9"
                                ),
                                Product.Attribute(
                                    name = "Тип магазина",
                                    value = "Коробчатый"
                                )
                            )
                        ),
                        Product(
                            id = "15",
                            name = "Rossi-92 KURS",
                            price = 79290.0,
                            discountPercent = 0,
                            description = "Оружие списанное, охолощенное модели «Rossi-92 Kurs»",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/8f5/509_496_1/8f5da28d5c68b6ea6fe549ea501e73d4.png",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "5.45"
                                ),
                                Product.Attribute(
                                    name = "Длина ствола",
                                    value = "1080 мм"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Патроны",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "16",
                            name = "Патрон пистолетный УПЗ (ТПЗ) 9х19",
                            price = 10.0,
                            discountPercent = 0,
                            description = "Патрон пистолетный УПЗ (ТПЗ)  9х19 FMJ 115 gr цинк б/м об (50шт) в коробке 1000 шт.",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/710/509_496_1/710dbae3855c55ac55562f5c46ef296d.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "9х18"
                                ),
                                Product.Attribute(
                                    name = "Производитель",
                                    value = "TULAMMO"
                                )
                            )
                        ),
                        Product(
                            id = "17",
                            name = "Патрон CHASE БИОР 12/70 дробь № 5",
                            price = 19.0,
                            discountPercent = 0,
                            description = "Основной патрон в линейке охотничьих патронов 12 калибра",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/01f/509_496_1/01f24d9350df1f04c84733e9d44549dd.JPG",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "12x70"
                                ),
                                Product.Attribute(
                                    name = "Производитель",
                                    value = "CHASE"
                                ),
                                Product.Attribute(
                                    name = "Масса снаряда",
                                    value = "32 гр"
                                )
                            )
                        ),
                        Product(
                            id = "18",
                            name = "Патрон нарезной 7,62х63 (30-06) SP Spring",
                            price = 36.0,
                            discountPercent = 0,
                            description = "Патрон нарезной 7,62х63 (30-06) SP Spring 9,1г оцинк. гильза (БПЗ) (20 шт.)",
                            imageUrl = "https://ohotaktiv.ru/upload/resize_cache/iblock/cb2/509_496_1/cb2c71a49e1bead39658868ec3d79b18.png",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Калибр",
                                    value = "7,62х63"
                                ),
                                Product.Attribute(
                                    name = "Производитель",
                                    value = "БПЗ (Барнаул)"
                                )
                            )
                        )
                    )
                )
            )
        )
    )
} 