package io.adev.itschool.data

import io.adev.itschool.MainCategory
import io.adev.itschool.Product
import io.adev.itschool.ProductWithCategoryAndPhoto
import io.adev.itschool.SubCategory
import java.util.concurrent.CopyOnWriteArrayList


class ZinevichYanDataset {
    private val electroGuitar = MainCategory("Электрогитара")
    private val acousticGuitar = MainCategory("Акустическая гитара")

    private val lesPaulElectric = SubCategory("Les Paul", electroGuitar)
    private val customElectric = SubCategory("Custom", electroGuitar)
    private val stratocasterElectric = SubCategory("Stratocaster", electroGuitar)
    private val explorerElectric = SubCategory("Explorer", electroGuitar)

    private val drednoutAcoustic = SubCategory("Дредноут", acousticGuitar)
    private val talmanAcoustic = SubCategory("Talman", acousticGuitar)

    fun getAllGenres(): List<SubCategory> {
        return listOf(
            lesPaulElectric,
            customElectric,
            stratocasterElectric,
            explorerElectric,
            drednoutAcoustic,
            talmanAcoustic
        )
    }

    fun getData(): CopyOnWriteArrayList<ProductWithCategoryAndPhoto> = CopyOnWriteArrayList(
        listOf(
            ProductWithCategoryAndPhoto(
                Product(
                    "1",
                    "James Hatfield Guitar",
                    200000.0,
                    30,
                    "Games Hatfield's Guitar",
                    "https://www.dhresource.com/0x0/f2/albu/g10/M00/F6/08/rBVaVlwrLiKAYMJ4AAGy0mCaXtI325.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Gibson"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "махагони"),
                        Product.Attribute("Гриф", "красное дерево, 22 лада"),
                        Product.Attribute("Накладка грифа", "палисандр, трапециевидные отметки ладов"),
                        Product.Attribute("Мензура", "24,75\""),
                        Product.Attribute("Бридж", "Tonepros Locking TOM & Tailpiece"),
                        Product.Attribute("Звукосниматели", "EMG JH SET"),
                        Product.Attribute("Регулировки", "2 х громкость, 3-поз.переключатель")
                    )
                ),
                customElectric,
                listOf(
                    "https://media.sweetwater.com/api/i/q-82__ha-34fd339e0d10c4f7__hmac-290a17714581e472e8decfd7c75c9350ea0634c5/images/items/750/SNAKEBYTESW-large.jpg",
                    "https://www.thomann.de/pics/bdb/486724/14886665_800.jpg",
                    "https://cdn.shopify.com/s/files/1/0288/1498/products/esp-ltd-electric-guitar-esp-ltd-left-handed-james-hetfield-snakebyte-electric-guitar-white-4582588907556.jpg?v=1575932484"
                )
            ),
            ProductWithCategoryAndPhoto(
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
                ),
                stratocasterElectric,
                listOf(
                    "https://media.sweetwater.com/api/i/q-82__ha-57ef4b7beeae831c__hmac-d039b90cdd26176f2b48d4e55351a630c6f2932e/images/items/750/StratAPEHHR3B-large.jpg",
                    "https://images.reverb.com/image/upload/s--7-6xLykN--/v1567010395/dkmqc2qbusekuvkjasdq.jpg",
                    "https://d1aeri3ty3izns.cloudfront.net/media/36/366987/1200/preview.jpg",
                    "https://images-na.ssl-images-amazon.com/images/I/615cA5XD%2BOL._AC_SY879_.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
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
                ),
                lesPaulElectric,
                listOf(
                    "https://cdn.webshopapp.com/shops/179375/files/265346378/683x1024x2/gibson-gibson-les-paul-leos-59-reissue-kalamazoo-c.jpg",
                    "https://static.keymusic.com/products/260492/XL/gibson-custom-shop-1959-les-paul-standard-washed-cherry-figured-vos.jpg",
                    "https://www.bigtone.in.th/wp-content/uploads/2019/11/GS-STD50-LP-HCB-02.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
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
                ),
                lesPaulElectric,
                listOf(
                    "https://www.pmtonline.co.uk/media/catalog/product/cache/1/image/900x/9df78eab33525d08d6e5fb8d27136e95/8/6/86679-eilmsbunh1.jpg",
                    "https://media.sweetwater.com/api/i/q-82__ha-1dcec90ddc4077dd__hmac-3a5999d908539f0d00f4989c083c2eb39f32a2e5/images/items/750/EILMSBUNH-large.jpg",
                    "https://images.reverb.com/image/upload/s--JVe9thX2--/a_exif,c_limit,e_unsharp_mask:80,f_auto,fl_progressive,g_south,h_1600,q_80,w_1600/v1465398038/ocm3hs0kprow7edo19ux.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
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
                ),
                lesPaulElectric,
                listOf(
                    "https://www.woodbrass.com/images/SQUARE400/woodbrass/GBI+LPB57VOEBGH1-1.JPG",
                    "https://cdn.shopify.com/s/files/1/0533/5597/products/productg-2.png?v=1583855594",
                    "https://www.pmtonline.co.uk/media/catalog/product/cache/1/image/1200x/9df78eab33525d08d6e5fb8d27136e95/7/5/75120-302993-gibson-les-paul-custom-eb-gloss-ebony-_3_.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "6",
                    "Gibson 2019 Explorer",
                    129000.0,
                    5,
                    "Gibson 2019 Explorer B-2 Satin Ebony – революционная модель, которая была впервые представлена Gibson в 1958 году одновременно с Flying V. Эта гитара нарушала все правила дизайна того времени и музыкальный мир ещё не был готов к ее появлению. Спустя шестьдесят лет инструменты Gibson Explorer стали чрезвычайно популярными среди музыкантов всех стилей и направлений, настоящей классикой гитарного мира. Представленная версия 2019 года Explorer B-2 выполнена в стильном матовом черном цвете с фурнитурой черный хром, оснащена звукоснимателями Dirty Fingers +. Это агрессивный инструмент, как по своему облику, так и по звучанию. Корпус и удобный для скоростной игры гриф Slim Taper выполнены полностью из красного дерева, накладка - палисандровая. Элементы управления удобны и лаконичны: регуляторы громкости и тембра, трехпозиционный переключатель. В комплекте с инструментом поставляется фирменный мягкий чехол.",
                    "https://www.muztorg.ru/files/1wg/akc/8tm/tq8/0cs/8wk/wgg/000/8/1wgakc8tmtq80cs8wkwgg0008.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Gibson"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "красное дерево."),
                        Product.Attribute("Гриф", "красное дерево, 22 лада. Slim Taper"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "24,75\""),
                        Product.Attribute("Бридж", "Nashville Tune-O-Matic"),
                        Product.Attribute("Звукосниматели", "Dirty Fingers"),
                        Product.Attribute("Регулировки", "громкость, тембр, переключатель звукоснимателей"),
                        Product.Attribute("Фурнитура", "черный хром"),
                        Product.Attribute("Колки", "Grover Mini Rotomatics"),
                        Product.Attribute("Лады", "low, низкотемпературной обработки")
                    )
                ),
                explorerElectric,
                listOf(
                    "https://www.muztorg.ru/files/4yo/4y2/19x/ew4/oo4/s4g/0oo/o08/o/4yo4y219xew4oo4s4g0ooo08o.jpg",
                    "https://www.muztorg.ru/files/4oe/1z6/0a4/bok/4o4/s8c/cg0/8c0/4/4oe1z60a4bok4o4s8ccg08c04.jpg",
                    "https://www.muztorg.ru/files/ngl/nfp/gwp/us4/8o0/kc4/4w0/wck/nglnfpgwpus48o0kc44w0wck.jpg",
                    "https://www.muztorg.ru/files/4x9/32s/2wn/ukg/o88/okw/ooo/cs4/s/4x932s2wnukgo88okwooocs4s.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "7",
                    "Explorer Antique Natural",
                    157000.0,
                    15,
                    "GIBSON 2019 Explorer Antique Natural – революционная модель, которая была впервые представлена Gibson в 1958 году одновременно с Flying V. Эта гитара нарушала все правила дизайна того времени и музыкальный мир ещё не был готов к ее появлению. Спустя шестьдесят лет инструменты Gibson Explorer стали чрезвычайно популярными среди музыкантов всех стилей и направлений, настоящей классикой гитарного мира. Модель 2019 года представлена в элегантном натуральном цвете и оснащена звукоснимателями BurstBucker. Это гармоничное сочетание дизайна и звучания Explorer пятидесятых годов. Вклеенный гриф Slim Taper, выполненный полностью из красного дерева, с палисандровой накладкой позволяет получить прекрасное звучание и удобство при игре. В комплекте с инструментом поставляется фирменный жесткий кейс.",
                    "https://www.muztorg.ru/files/ewe/5gp/22g/1wg/4k4/w4c/ssk/ow0/g/ewe5gp22g1wg4k4w4csskow0g.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Gibson"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "красное дерево."),
                        Product.Attribute("Гриф", "красное дерево, 22 лада. Slim Taper"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "24,75\""),
                        Product.Attribute("Бридж", "Nashville Tune-O-Matic"),
                        Product.Attribute("Звукосниматели", "BurstBucker 2"),
                        Product.Attribute("Регулировки", "громкость, тембр, переключатель звукоснимателей"),
                        Product.Attribute("Фурнитура", "черный хром"),
                        Product.Attribute("Колки", "Grover Mini Rotomatics"),
                        Product.Attribute("Лады", "low, низкотемпературной обработки")
                    )
                ),
                explorerElectric,
                listOf(
                    "https://www.muztorg.ru/files/7ja/8jm/0r7/usk/os8/s4g/ckk/g4w/k/7ja8jm0r7uskos8s4gckkg4wk.jpg",
                    "https://www.muztorg.ru/files/ag7/ob3/fz1/rsw/44c/4c0/k8w/84s/s/ag7ob3fz1rsw44c4c0k8w84ss.jpg",
                    "https://www.muztorg.ru/files/bqz/wf7/k1p/pck/w4w/8oo/sow/040/g/bqzwf7k1ppckw4w8oosow040g.jpg",
                    "https://www.muztorg.ru/files/6d8/qin/m98/eww/oww/wkw/0c0/goc/8/6d8qinm98ewwowwwkw0c0goc8.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "8",
                    "EXPLORER EX ALPINE WHITE",
                    92000.0,
                    15,
                    "В основе модели 1984 Explorer™ EX лежит ставший классикой дизайн гитары, который просто не возможно не заметить на сцене. Впервые представленный в 1958 году Explorer, благодаря своей радикально-футуристической форме корпуса, пользуется огромной популярностью среди гитаристов тяжёлых музыкальных направлений. Не упустите шанс испытать этот новый Explorer - классический дизайн дополненный парой мощных хамбакеров EMG.",
                    "https://www.muztorg.ru/files/bcc/t0t/i7w/h4o/wkc/400/owo/o44/4/bcct0ti7wh4owkc400owoo444.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Epiphone"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "красное дерево."),
                        Product.Attribute("Гриф", "красное дерево, 22 лада"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "24,75\""),
                        Product.Attribute("Бридж", "Nashville Tune-O-Matic"),
                        Product.Attribute("Звукосниматели", "HH"),
                        Product.Attribute("Регулировки", "громкость, тембр, переключатель звукоснимателей"),
                        Product.Attribute("Фурнитура", "хром")
                    )
                ),
                explorerElectric,
                listOf(
                    "https://www.stars-music.com/medias/epiphone/explorer-1984-ex-bh-hd-5-58639.png",
                    "https://i.ebayimg.com/images/g/iEIAAOSwP45dssz3/s-l300.jpg",
                    "https://i.pinimg.com/originals/bf/fb/97/bffb9744bb97c0b7821818b174b21269.jpg",
                    "https://images.reverb.com/image/upload/s--KLnT5gix--/f_auto,t_supersize/v1561136165/anl8v4vmuhh2spcffydx.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "9",
                    "FENDER SQUIER AFFINITY",
                    23900.0,
                    0,
                    "электрогитара, цвет чёрный, корпус - ольха, гриф - клен, C-образный профиль грифа, накладка на гриф - клён, инкрустация в виде точек, лады - 21 Medium Jumbo, ширина верхнего порожка - 1,6` (40,6 мм), мензура - 25.5`, звукосниматели - S/S/S Standard Single-Coil Strat®, регуляторы - 1 громкость, 2 тона, 5-ти позиционный пеерключатель звукоснимателей, бридж - Synchronous Tremolo с опорой на 6 винтов, колки - Standard Die-Cast, фурнитура - цвет хром.",
                    "https://www.muztorg.ru/files/b56/8gi/xhv/j4k/0ok/wkw/4go/kwc/k/b568gixhvj4k0okwkw4gokwck.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Fender"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "красное дерево."),
                        Product.Attribute("Гриф", " Клен, профиль C"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "24,75\""),
                        Product.Attribute("Бридж", "Nashville Tune-O-Matic"),
                        Product.Attribute("Звукосниматели", "Звукосниматели: 3 сингла"),
                        Product.Attribute("Регулировки", "Master громкость, Тембр"),
                        Product.Attribute("Фурнитура", "хром"),
                        Product.Attribute("Колки", "Standard Die-Castr")
                    )
                ),
                stratocasterElectric,
                listOf(
                    "https://www.muztorg.ru/files/pdh/6o1/b8p/q84/c40/oo4/40o/wgc/pdh6o1b8pq84c40oo440owgc.jpg",
                    "https://www.muztorg.ru/files/5of/1ty/emi/y8s/0oc/88k/w8s/sg8/o/5of1tyemiy8s0oc88kw8ssg8o.jpg",
                    "https://www.muztorg.ru/files/67o/itq/sna/loo/go4/csc/ckc/gg4/o/67oitqsnaloogo4cscckcgg4o.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "10",
                    "Fender Squier Contemporary",
                    47000.0,
                    0,
                    "Fender Squier Contemporary Active Stratocaster HH – великолепный выбор для современного музыканта, которому требуется прогрессивный инструмент, сохранивший при этом аутентичный классический стиль. Тонкий гриф профиля «С» в сочетании с накладкой радиуса 12 дюймов делают гитару чрезвычайно удобной, идеально подходящей для скоростной игры. Тремоло Floyd Rose® открывает широкие возможности для импровизации с вибрато, при этом сохраняя стабильность строя. Звукосниматели – два активных хамбакера Squier – обладают высоким выходным уровнем и подходят как для четких риффов, так и для скоростных соло. Инструмент выпускается в двух вариантах цветового исполнения. Представленная гитара – стильного черного цвета с оригинальной перевернутой головой грифа в цвет корпуса, контрастным белым пикгардом и фурнитурой цвета черный хром. Contemporary Active Stratocaster HH гармонично сочетает в себе неподвластный времени узнаваемый дизайн Fender, отличный звук и удобство. Эта гитара станет отличным пополнением Вашего арсенала.",
                    "https://www.muztorg.ru/files/1xt/2l0/oio/sdc/oc0/s8w/0ks/0s4/s/1xt2l0oiosdcoc0s8w0ks0s4s.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Fender"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "красное дерево."),
                        Product.Attribute("Гриф", " Клен, профиль C"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "25.5\""),
                        Product.Attribute("Бридж", "Nashville Tune-O-Matic"),
                        Product.Attribute("Звукосниматели", "Звукосниматели: 3 сингла"),
                        Product.Attribute("Регулировки", "Master громкость, Тембр"),
                        Product.Attribute("Фурнитура", "хром"),
                        Product.Attribute("Крепление грифа", "на болтах"),
                        Product.Attribute("Колки", "Standard Die-Castr")
                    )
                ),
                stratocasterElectric,
                listOf(
                    "https://www.muztorg.ru/files/3j0/e7h/dws/dus/k0w/wwo/w8k/0c8/3j0e7hdwsdusk0wwwow8k0c8.jpg",
                    "https://www.muztorg.ru/files/bn8/o8w/j7u/48w/8ww/gw8/osg/0o8/o/bn8o8wj7u48w8wwgw8osg0o8o.jpg",
                    "https://www.muztorg.ru/files/lw7/q0a/ztv/cgs/ogg/8o0/kco/kws/lw7q0aztvcgsogg8o0kcokws.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "11",
                    "FENDER DELUXE STRAT",
                    114000.0,
                    15,
                    "Гитара, обладающая \"жирным\", хард-роковым тоном смогла объединить в себе стиль инструментов Deluxe и универсальное звучание Fender. Богатое, теплое звучание, которое выдает бриджевый хамбакер, придаёт инструменту насыщенности и яркости. Этот инструмент, прошедший проверку временем, прекрасно проявит себя в любом музыкальном жанре. На гитарe установлены бесшумные звукосниматели, которые формируют традиционный саунд Stratocaster защищенный от назойливого шума и электромагнитных помех. Бриджевый хамбакер имеет умеренный выход, теплый, насыщенный тон. Этот звукосниматель оборудован толстой алюминиевой пластиной, предназначенной для уменьшения электромагнитных помех. ",
                    "https://www.muztorg.ru/files/bst/bdc/azp/tkw/c8k/g00/4gw/c48/c/bstbdcazptkwc8kg004gwc48c.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Fender"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "красное дерево."),
                        Product.Attribute("Гриф", " Клен, профиль Modern C"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "25.5\""),
                        Product.Attribute("Бридж", "Nashville Tune-O-Matic"),
                        Product.Attribute("Звукосниматели", "Звукосниматели: 3 сингла"),
                        Product.Attribute("Регулировки", "Master громкость, Тембр"),
                        Product.Attribute("Фурнитура", "хром"),
                        Product.Attribute("Крепление грифа", "на болтах"),
                        Product.Attribute("Колки", "Standard Die-Castr")
                    )
                ),
                stratocasterElectric,
                listOf(
                    "https://www.muztorg.ru/files/cqk/5pf/tql/qo8/0ck/ks4/sw0/og0/w/cqk5pftqlqo80ckks4sw0og0w.jpg",
                    "https://www.muztorg.ru/files/2e0/itd/go6/kys/8ws/0k0/g8g/gg4/s/2e0itdgo6kys8ws0k0g8ggg4s.jpg",
                    "https://www.muztorg.ru/files/c9e/7uz/6r1/q80/wgw/4og/8ss/0cw/k/c9e7uz6r1q80wgw4og8ss0cwk.jpg",
                    "https://www.muztorg.ru/files/3jf/21i/fu7/nwg/owk/8s8/ggs/wco/w/3jf21ifu7nwgowk8s8ggswcow.jpg",
                    "https://www.muztorg.ru/files/exm/fw3/lby/0ow/g00/oc4/0sw/84s/w/exmfw3lby0owg00oc40sw84sw.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "12",
                    "YAMAHA F310",
                    11490.0,
                    0,
                    "YAMAHA F310 воплощает приверженность качеству дизайна и звучания, свойственному всем акустикам Yamaha, и объединяет эти достоинства в единое целое по непревзойденно доступной цене.",
                    "https://www.muztorg.ru/files/3ld/eyh/tvr/8qo/0s8/040/kk4/8go/w/3ldeyhtvr8qo0s8040kk48gow.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Yamaha"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "Маранти."),
                        Product.Attribute("Гриф", " Клен"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "25\"")
                    )
                ),
                drednoutAcoustic,
                listOf(
                    "https://www.muztorg.ru/files/3wj/ksi/ncq/dus/scc/ok0/oss/ow4/4/3wjksincqdussccok0ossow44.jpg",
                    "https://www.muztorg.ru/files/eoi/3vo/69b/xss/ksc/4wg/cwc/osc/w/eoi3vo69bxssksc4wgcwcoscw.jpg",
                    "https://www.muztorg.ru/files/72m/ous/ngm/l4w/sww/4c4/0co/0w8/8/72mousngml4wsww4c40co0w88.jpg",
                    "https://www.muztorg.ru/files/bq2/qte/2x3/p4w/o4k/k0c/8kg/8kg/o/bq2qte2x3p4wo4kk0c8kg8kgo.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "13",
                    "IBANEZ TCY10E-BK",
                    11490.0,
                    0,
                    "Это шестиструнная электроакустическая гитара с звукоснимателем. Этот инструмент имеет оригинальный стиль деки и насыщенное, яркое звучание. Цвет гитары черный. Верхняя дека гитары сделана из массива ели, обечайка и дека - махагони (красное дерево). Качественные, хромированные колки от производителя помогут сохранить строй гитары при самой интенсивной игре. Гриф гитары сделан из махагони (красное дерево), наладка грифа из палисандра. Дека гитары имеет вырез, который облегчает доступ к последним ладам грифа.",
                    "https://www.muztorg.ru/files/ap5/7h3/36o/6go/kwc/4gc/08c/cgw/s/ap57h336o6gokwc4gc08ccgws.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Ibanez"),
                        Product.Attribute("Тип", "со звукоснимателем"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "Маранти."),
                        Product.Attribute("Гриф", " Клен"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "25\"")
                    )
                ),
                talmanAcoustic,
                listOf(
                    "https://www.muztorg.ru/files/608/3ea/vcw/r8c/4sk/8s4/40o/gkg/4/6083eavcwr8c4sk8s440ogkg4.jpg",
                    "https://www.muztorg.ru/files/7hp/09s/blf/bgo/soo/cck/scg/osg/o/7hp09sblfbgosoocckscgosgo.jpg",
                    "https://www.muztorg.ru/files/baf/sm1/5kp/nso/cs4/swo/ko0/kk8/s/bafsm15kpnsocs4swoko0kk8s.jpg"
                )
            ),
            ProductWithCategoryAndPhoto(
                Product(
                    "14",
                    "FENDER CD-60",
                    17300.0,
                    10,
                    "FENDER CD-60 DREAD V3 DS – идеальный инструмент для начинающих музыкантов. Это настоящий Фендер, при этом цена модели весьма невысока. Если Вы молодой музыкант, лучшая гитара, которую Вы можете выбрать, – это инструмент, звук и удобство которого вдохновят Вас играть больше и больше. Модель 2019 года CD-60 – именно такая гитара. Впрочем, она также прекрасно подойдет и опытным гитаристам, которым нужен недорогой второй дредноут. Эта акустическая гитара обладает отлично сбалансированным звучанием, а корпус дредноут с верхней декой из ели позволяет добиться высокой громкости. Нижняя дека и обечайка - из красного дерева. Гриф профиля «С» - тоже из красного дерева, с глянцевой уретановой отделкой. На грифе двадцать ладов, инкрустированных перламутровыми точками. Накладка и бридж – из ореха. Модель выпускается в 3 вариантах цветового исполнения. Представленная версия CD-60 Dread V3 DS – натурального цвета с глянцевым полиуретановым покрытием, контрастным черным пикгардом и блестящей хромированной фурнитурой.",
                    "https://www.muztorg.ru/files/5tz/ng5/xpf/ows/k0g/gso/04c/0og/c/5tzng5xpfowsk0ggso04c0ogc.jpg",
                    listOf(
                        Product.Attribute("Производитель", "Ibanez"),
                        Product.Attribute("Тип", "со звукоснимателем"),
                        Product.Attribute("Количество струн", "6"),
                        Product.Attribute("Корпус", "Маранти."),
                        Product.Attribute("Гриф", " Клен"),
                        Product.Attribute("Накладка грифа", "палисандр."),
                        Product.Attribute("Мензура", "25\"")
                    )
                ),
                drednoutAcoustic,
                listOf(
                    "https://www.muztorg.ru/files/enj/gci/fy9/xc0/gog/owk/wss/044/o/enjgcify9xc0gogowkwss044o.jpg",
                    "https://www.muztorg.ru/files/cpf/vti/dih/og0/s0s/0c8/kcw/g8k/8/cpfvtidihog0s0s0c8kcwg8k8.jpg",
                    "https://www.muztorg.ru/files/3k1/4ce/dbn/b6s/cg0/wg4/wgo/884/c/3k14cedbnb6scg0wg4wgo884c.jpg",
                    "https://www.muztorg.ru/files/13r/lls/a00/xi8/osc/cso/wg4/gck/g/13rllsa00xi8osccsowg4gckg.jpg"
                )
            )
        )
    )
}