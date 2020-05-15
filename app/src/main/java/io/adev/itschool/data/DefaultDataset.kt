package io.adev.itschool.data

import io.adev.itschool.Product

class DefaultDataset {
    fun getData(): List<Product> =
        listOf(
            Product(
                id = "1",
                name = "Motorola Moto E5",
                price = 10999.0,
                discountPercent = 0,
                description = ("Аппарат отличается привлекательным дизайном и обладает высоким " +
                        "быстродействием, которое достигается благодаря возможностям процессора " +
                        "Snapdragon 425 и оперативной памяти объемом 2 ГБ. На нем можно " +
                        "запустить любые приложения и игры, совместимые с платформой Android 8.0."),
                imageUrl = "http://c.dns-shop.ru/thumb/st1/fit/320/250/e6f15e5e06b9089a4aa6da8bfee12c2e/c07a3fe7c1c39c46f2129989098ba6bc4e05fd269f87f09440fc5e9d1094838f.jpg",
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
                id = "2",
                name = "Haier Elegance E13",
                price = 12999.0,
                discountPercent = 3,
                description = ("Haier Elegance E13 представляет собой мощный смартфон с " +
                        "восьмиядерным процессором MediaTek и 4 Гб оперативной памяти, " +
                        "с операционной системой Android 8.1 Oreo. " +
                        "Устройство поддерживает LTE стандарт связи, две SIM карты, " +
                        "MicroSD объемом до 128 Гб, считыватель отпечатков пальцев, быструю зарядку. " +
                        "В устройстве установлен IPS дисплей с защитой от царапин и разрешением 720 на 1440 пикселей. " +
                        "Для качественных фотографий в телефоне имеется двойная основная камера 16 +2 Мпикс и фронтальная 13 Мпикс."),
                imageUrl = "http://c.dns-shop.ru/thumb/st1/fit/320/250/2f90396a997c329351520f864e94bc5b/c3f3701b628d8f043ec06ebc6edb30d450b70b66397d91296b3c8cd9dfdd4ea5.jpg",
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
                id = "3",
                name = "Highscreen Power Five Max 2",
                price = 15999.0,
                discountPercent = 5,
                description = ("Описание 5.99'' Смартфон Highscreen Power Five Max 2" +
                        "64 ГБ синий Highscreen Power Five Max\n" +
                        "2 смартфон с ёмким аккумулятором серии Power.Ёмкая батарея на " +
                        "5000 мАч обеспечивает длительное время работы без подзарядки . " +
                        "Мощная батарея является неоспоримым плюсом, " +
                        "создавая ощутимый комфорт и удобство при ежедневном использовании аппарата. " +
                        "Быстродействие смартфона обеспечивает " +
                        "8 - ми ядерный процессор Mediatek Helio P23. " +
                        "Аппарат легко справляется с режимом многозадачности, " +
                        "работает быстро и чётко . Смартфон порадует и такими востребованными возможностями, " +
                        "как NFC,\n" +
                        "навигация GPS / ГЛОНАСС,\n" +
                        "LTE / 4 G,\n" +
                        "Wi - Fi,\n" +
                        "поддержка двух sim - карт.\n" +
                        "Утончённый дизайн, металлическая окантовка и элегантные черты смартфона " +
                        "придутся по вкусу самой широкой аудитории ."),
                imageUrl =
                "http://c.dns-shop.ru/thumb/st1/fit/320/250/595ffa0be0da170dfdaa036e058abd70/5bb316c2af569252e058774530ce38e23fca77d19bf3194f3a1f3471cd9c6e71.jpg",
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
                id = "4",
                name = "Honor 10 Lite",
                price = 17999.0,
                discountPercent = 12,
                description = ("В конструкции смартфона Honor 10 Lite присутствует красочный " +
                        "6.21-дюймовый экран, который подарит вам изображение высокой четкости в " +
                        "разрешении 2340x1080 пикселей. Данная модель стала обладательницей " +
                        "небольшого полукруглого выреза, в которую была помещена качественная " +
                        "фронтальная камера. Неоспоримым преимуществом представленного аппарата " +
                        "является поддержка его процессором HiSilicon Kirin 710 технологии " +
                        "GPU Turbo 2.0, благодаря которой при запуске ресурсоемких игр повышается " +
                        "производительность графического чипсета."),
                imageUrl = "http://c.dns-shop.ru/thumb/st1/fit/320/250/94fdd0f3518cc5cfe5aca0d5e9722d6c/3821174382813c729d9ecd5aad6884eb5ca12d47f1e3790412f9be86eae2ad42.jpg",
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
} 