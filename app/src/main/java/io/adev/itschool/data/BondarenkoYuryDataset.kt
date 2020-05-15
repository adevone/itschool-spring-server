package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product
import java.util.concurrent.CopyOnWriteArrayList

class BondarenkoYuryDataset : BaseDataset() {
    override var data = CopyOnWriteArrayList(
        listOf(
            Category(
                "Смартфоны",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "1",
                            name = "Samsung Galaxy M21",
                            price = 15990.0,
                            discountPercent = 3,
                            description = "Смартфон на платформе Android",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1901647/img_id8566197823464743507.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "OS",
                                    value = "Android"
                                ),
                                Product.Attribute(
                                    name = "Камеры",
                                    value = "48 МП/8 МП/5 МП"
                                ),
                                Product.Attribute(
                                    name = "Память",
                                    value = "64 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Аккумулятор",
                                    value = "6000 мА∙ч"
                                ),
                                Product.Attribute(
                                    name = "Связь",
                                    value = "3G, 4G LTE, Wi-Fi, Bluetooth, NFC"
                                )

                            )
                        ),
                        Product(
                            id = "2",
                            name = "Apple iPhone SE (2020)",
                            price = 38990.0,
                            discountPercent = 0,
                            description = "смартфон с iOS 13",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1909520/img_id4375196903065481182.png/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Экран",
                                    value = "4.7\", разрешение 1334x750"
                                ),
                                Product.Attribute(
                                    name = "Камера",
                                    value = "12 МП"
                                ),
                                Product.Attribute(
                                    name = "Память",
                                    value = "64 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Связь",
                                    value = "3G, 4G LTE, Wi-Fi, Bluetooth, NFC"
                                )
                            )
                        ),
                        Product(
                            id = "3",
                            name = "OnePlus 8",
                            price = 53920.0,
                            discountPercent = 15,
                            description = "Смартфон с Android 10",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1600461/img_id8279945597083630939.png/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Экран",
                                    value = "6.55\", разрешение 2400x1080"
                                ),
                                Product.Attribute(
                                    name = "Камеры",
                                    value = "48 МП/2 МП/16 МП"
                                ),
                                Product.Attribute(
                                    name = "Память",
                                    value = "128 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Связь",
                                    value = "3G, 4G LTE, 5G, LTE-A, Wi-Fi, Bluetooth, NFC"
                                )
                            )
                        ),
                        Product(
                            id = "4",
                            name = "Xiaomi Redmi Note 8 Pro",
                            price = 16380.0,
                            discountPercent = 0,
                            description = "Смартфон с Android 9.0",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/2009321/img_id4657732664751664675.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Экран",
                                    value = "6.53\", разрешение 2340x1080"
                                ),
                                Product.Attribute(
                                    name = "Камеры",
                                    value = "64 МП/8 МП/2 МП/2 МП"
                                ),
                                Product.Attribute(
                                    name = "Память",
                                    value = "128 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Связь",
                                    value = "3G, 4G LTE, Wi-Fi, Bluetooth, NFC"
                                )
                            )
                        ),
                        Product(
                            id = "5",
                            name = "Samsung Galaxy Note 10 Lite",
                            price = 29990.0,
                            discountPercent = 0,
                            description = "Смартфон на платформе Android",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1565610/img_id3672403429439031165.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Экран",
                                    value = "6.7\", разрешение 2400x1080"
                                ),
                                Product.Attribute(
                                    name = "Камеры",
                                    value = "12 МП/12 МП/12 МП"
                                ),
                                Product.Attribute(
                                    name = "Память",
                                    value = "128 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Связь",
                                    value = "3G, 4G LTE, Wi-Fi, Bluetooth, NFC"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Ноутбуки",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "6",
                            name = "ASUS Laptop 15 X509",
                            price = 47990.0,
                            discountPercent = 15,
                            description = "Intel Core i5 8265U 1600 MHz/15.6\"/1920x1080/8GB/1000GB HDD/DVD нет/NVIDIA GeForce MX250 2GB/Wi-Fi/Bluetooth/Endless OS",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1565610/img_id2562970766288431608.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Тип памяти",
                                    value = "DDR4"
                                ),
                                Product.Attribute(
                                    name = "объем оперативной памяти",
                                    value = "8 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Объем видеопамяти",
                                    value = "2 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Экран",
                                    value = "матовый, 15.6\" (1920x1080)"
                                )
                            )
                        ),
                        Product(
                            id = "7",
                            name = "ASUS TUF Gaming FX505DU",
                            price = 91890.0,
                            discountPercent = 0,
                            description = "AMD Ryzen 7 3750H 2300MHz/15.6\"/1920x1080/16GB/256GB SSD/1000GB HDD/DVD нет/NVIDIA GeForce GTX 1660 Ti 6GB/Wi-Fi/Bluetooth/Windows 10 Home",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1567763/img_id8140717334066574666.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Тип памяти",
                                    value = "DDR4"
                                ),
                                Product.Attribute(
                                    name = "Объем оперативной памяти",
                                    value = "16 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Видеокарта",
                                    value = "AMD Radeon RX Vega 10, NVIDIA GeForce GTX 1660 Ti"
                                ),
                                Product.Attribute(
                                    name = "Объем видеопамяти",
                                    value = "6 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Экран",
                                    value = "матовый, 15.6\" (1920x1080)"
                                )
                            )
                        ),
                        Product(
                            id = "8",
                            name = "MSI GF63 Thin 9RCX-868X",
                            price = 61990.0,
                            discountPercent = 0,
                            description = "Intel Core i5 9300H 2400MHz/15.6\"/1920x1080/8GB/1000GB HDD/DVD нет/NVIDIA GeForce GTX 1050 Ti 4GB/Wi-Fi/Bluetooth/DOS",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1656415/img_id4241878784733576496.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Тип памяти",
                                    value = "DDR4"
                                ),
                                Product.Attribute(
                                    name = "Объем оперативной памяти",
                                    value = "8 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Видеокарта",
                                    value = "NVIDIA GeForce GTX 1050 Ti, Intel UHD Graphics 630"
                                ),
                                Product.Attribute(
                                    name = "Объем видеопамяти",
                                    value = "4 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Экран",
                                    value = "матовый, 15.6\" (1920x1080)"
                                )
                            )
                        ),
                        Product(
                            id = "9",
                            name = "Apple MacBook Air 13",
                            price = 89490.0,
                            discountPercent = 0,
                            description = "Intel Core i3 1100MHz/13.3\"/2560x1600/8GB/256GB SSD/DVD нет/Intel Iris Plus Graphics/Wi-Fi/Bluetooth/macOS",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1943683/img_id8674477609536863931.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Тип памяти",
                                    value = "DDR4"
                                ),
                                Product.Attribute(
                                    name = "Объем оперативной памяти",
                                    value = "8 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Видеокарта",
                                    value = "встроенная Intel Iris Plus Graphics"
                                ),
                                Product.Attribute(
                                    name = "Хранение данных",
                                    value = "SSD 256 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Экран",
                                    value = "13.3\" (2560x1600)"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Планшеты",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "10",
                            name = "Samsung Galaxy Tab A 10.1",
                            price = 17900.0,
                            discountPercent = 0,
                            description = "Планшет 10.1\"",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1865278/img_id2402617051273319549.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Память",
                                    value = "32 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Камеры",
                                    value = "8 МП/5 МП"
                                ),
                                Product.Attribute(
                                    name = "Операционная система",
                                    value = "Android 9.0"
                                ),
                                Product.Attribute(
                                    name = "Экран",
                                    value = "10.1\", 1920x1200"
                                ),
                                Product.Attribute(
                                    name = "Процессор",
                                    value = "Samsung Exynos 7904"
                                )
                            )
                        ),
                        Product(
                            id = "11",
                            name = "Apple iPad (2019)",
                            price = 26950.0,
                            discountPercent = 0,
                            description = "планшет 10.2\"",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1888674/img_id8451971435629694247.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Память",
                                    value = "32 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Камеры",
                                    value = "8 МП/1.2 МП"
                                ),
                                Product.Attribute(
                                    name = "Операционная система",
                                    value = "iOS"
                                ),
                                Product.Attribute(
                                    name = "Экран",
                                    value = "10.2\", 2160x1620, TFT IPS"
                                ),
                                Product.Attribute(
                                    name = "Процессор",
                                    value = "Apple A10"
                                )
                            )
                        ),
                        Product(
                            id = "12",
                            name = "Apple iPad Air (2019)",
                            price = 43990.0,
                            discountPercent = 0,
                            description = "планшет 10.5\"",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1866068/img_id7070434538046308385.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Память",
                                    value = "64 ГБ"
                                ),
                                Product.Attribute(
                                    name = "Камеры",
                                    value = "8 МП/7 МП"
                                ),
                                Product.Attribute(
                                    name = "Операционная система",
                                    value = "iOS"
                                ),
                                Product.Attribute(
                                    name = "Экран",
                                    value = "10.5\", 2224x1668, TFT IPS"
                                ),
                                Product.Attribute(
                                    name = "Процессор",
                                    value = "Apple A12 Bionic"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Комплектующие для ПК",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "13",
                            name = "GIGABYTE GeForce GTX 1660 SUPER",
                            price = 20490.0,
                            discountPercent = 0,
                            description = "Видеокарта 1830MHz PCI-E 3.0 6144MB 14000MHz 192 bit HDMI 3xDisplayPort HDCP OC",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1912105/img_id6326074140629748935.png/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Память",
                                    value = "6144 МБ, GDDR6"
                                ),
                                Product.Attribute(
                                    name = "Разъемы",
                                    value = "HDMI, DisplayPort x3"
                                ),
                                Product.Attribute(
                                    name = "Частота ядра/памяти",
                                    value = "1830/14000 МГц"
                                ),
                                Product.Attribute(
                                    name = "Дополнительное питание",
                                    value = "8 pin"
                                ),
                                Product.Attribute(
                                    name = "Разрядность шины",
                                    value = "192 бит"
                                )
                            )
                        ),
                        Product(
                            id = "14",
                            name = "Palit GeForce GTX 1050 Ti",
                            price = 11250.0,
                            discountPercent = 0,
                            description = "Видеокарта 1290MHz PCI-E 3.0 4096MB 7000MHz 128 bit DVI HDMI DisplayPort HDCP StormX",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1767151/img_id8629848407124082564/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Память",
                                    value = "4096 МБ, GDDR5"
                                ),
                                Product.Attribute(
                                    name = "Разъемы",
                                    value = "DVI, HDMI, DisplayPort"
                                ),
                                Product.Attribute(
                                    name = "Частота ядра/памяти",
                                    value = "1290/7000 МГц"
                                ),
                                Product.Attribute(
                                    name = "Дополнительное питание",
                                    value = "нет"
                                ),
                                Product.Attribute(
                                    name = "Разрядность шины",
                                    value = "128 бит"
                                )
                            )
                        ),
                        Product(
                            id = "15",
                            name = "AMD Ryzen 5 3500",
                            price = 9700.0,
                            discountPercent = 0,
                            description = "Процессор AMD",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1865271/img_id6399508240835062787.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Socket",
                                    value = "AM4"
                                ),
                                Product.Attribute(
                                    name = "Количество ядер",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Тактовая частота",
                                    value = "3600 МГц"
                                ),
                                Product.Attribute(
                                    name = "Тип памяти",
                                    value = "DDR4"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Аксессуары для смартфонов",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "16",
                            name = "Чехол для Apple iPhone 11 Pro Max",
                            price = 3000.0,
                            discountPercent = 0,
                            description = "Кожаный ударопрочный чехол",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1912105/img_id914087856152997787.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Телефон",
                                    value = "Apple iPhone 11 Pro Max"
                                ),
                                Product.Attribute(
                                    name = "Тип чехла",
                                    value = "накладка"
                                ),
                                Product.Attribute(
                                    name = "Материал",
                                    value = "натуральная кожа"
                                )
                            )
                        ),
                        Product(
                            id = "17",
                            name = "Чехол для Samsung Galaxy A51",
                            price = 1390.0,
                            discountPercent = 10,
                            description = "Силиконовый чехол Samsung EF-PA515",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1603927/img_id8012821272089124621.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Телефон",
                                    value = "Samsung Galaxy A51"
                                ),
                                Product.Attribute(
                                    name = "Тип чехла",
                                    value = "накладка"
                                ),
                                Product.Attribute(
                                    name = "Материал",
                                    value = "силикон"
                                )
                            )
                        ),
                        Product(
                            id = "18",
                            name = "Xiaomi Mi Power Bank 3 Pro 20000",
                            price = 9700.0,
                            discountPercent = 0,
                            description = "Портативный аккумулятор Xiaomi",
                            imageUrl = "https://avatars.mds.yandex.net/get-mpic/1865271/img_id6399508240835062787.jpeg/orig",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Емкость",
                                    value = "20000 мА⋅ч"
                                ),
                                Product.Attribute(
                                    name = "Быстрая зарядка",
                                    value = "есть"
                                ),
                                Product.Attribute(
                                    name = "Разъемы",
                                    value = "USBx2, USB Type-C"
                                ),
                                Product.Attribute(
                                    name = "Вес",
                                    value = "440 г"
                                )
                            )
                        )
                    )
                )
            )
        )
    )
}