package io.adev.itschool.data

import io.adev.itschool.Category
import io.adev.itschool.Product
import java.util.concurrent.CopyOnWriteArrayList

class RakipovIlyaDataset : BaseDataset() {
    override var data = CopyOnWriteArrayList(
        listOf(
            Category(
                "Акустические гитары",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "1",
                            name = "FENDER CD-60S DREAD NAT WN",
                            price = 18810.0,
                            discountPercent = 10,
                            description = "FENDER CD-60S DREAD NAT WN – гитара из линейки Classic Design, одна из самых популярных моделей акустических гитар производства Fender. Она может похвастаться выдающимися характеристиками среди инструментов своего класса, это идеальный инструмент для тех, кто ищет бюджетный дредноут с отличным звучанием. В ней сочетаются отличные акустические свойства и удобство при игре. Корпус представленной модификации CD-60S выполнен из красного дерева, верхняя дека – из цельной древесины ели. Такая конструкция придает инструменту впечатляющую громкость, четкий, чистый звук, а также делает его достаточно неприхотливым: на такой гитаре можно играть в любом месте, в том числе на открытом воздухе. Особенность этой модели - гриф удобной формы Fender® 'Easy-to-Play' с накладкой из ореха радиуса 12”. На грифе 20 ладов Vintage с инкрустацией точками. Гитара представлена в элегантном натуральном цвете с глянцевым покрытием, однослойным черным пикгардом и хромированной фурнитурой.",
                            imageUrl = "https://www.muztorg.ru/files/2rp/kok/xui/58g/gcw/04k/484/cg0/k/2rpkokxui58ggcw04k484cg0k.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Орех"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Натуральный"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Без звукоснимателя"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "25.3"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Материал топа",
                                    value = "Ель"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Красное дерево"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Дредноут"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "20"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Красное дерево"
                                )
                            )
                        ),
                        Product(
                            id = "2",
                            name = "FENDER CD-60SCE Dread Black WN",
                            price = 31100.0,
                            discountPercent = 0,
                            description = "FENDER CD-60SCE Dread Black WN – обновленная версия электроакустической гитары CD-60SCE из линейки Classic Design, которая может похвастаться выдающимися характеристиками среди инструментов своего класса. В ней сочетаются отличные акустические свойства, мощная электроника, включающая встроенный тюнер, и удобство при игре. Корпус представленной модификации CD-60SCE с плавным венецианским вырезом выполнен из красного дерева, верхняя дека – из цельной древесины ели. Такая конструкция придает инструменту впечатляющую громкость, четкий, чистый звук, а также делает его достаточно неприхотливым: на такой гитаре можно играть в любом месте, в том числе на открытом воздухе. Особенность этой модели - гриф удобной формы Fender® 'Easy-to-Play' с накладкой из ореха радиуса 12”. На грифе 20 ладов Vintage с инкрустацией перламутровыми точками. Бридж также выполнен из ореха. CD-60SCE оснащена высококачественной электроникой Fishman® со встроенным тюнером, двухполосным эквалайзером и регулятором громкости. Гитара представлена в стильном черном цвете с черным пикгардом и хромированной фурнитурой.",
                            imageUrl = "https://www.muztorg.ru/files/a9q/04o/xuk/psg/ks8/owk/ggg/gc0/8/a9q04oxukpsgks8owkggggc08.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Орех"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Черный"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Со звукоснимателем"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "25.3"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Материал топа",
                                    value = "Ель"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Красное дерево"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Дредноут"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "20"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Красное дерево"
                                )
                            )
                        ),
                        Product(
                            id = "3",
                            name = "FENDER CD-60 DREAD V3 DS NAT WN",
                            price = 17300.0,
                            discountPercent = 10,
                            description = "FENDER CD-60 DREAD V3 DS – идеальный инструмент для начинающих музыкантов. Это настоящий Фендер, при этом цена модели весьма невысока. Если Вы молодой музыкант, лучшая гитара, которую Вы можете выбрать, – это инструмент, звук и удобство которого вдохновят Вас играть больше и больше. Модель 2019 года CD-60 – именно такая гитара. Впрочем, она также прекрасно подойдет и опытным гитаристам, которым нужен недорогой второй дредноут. Эта акустическая гитара обладает отлично сбалансированным звучанием, а корпус дредноут с верхней декой из ели позволяет добиться высокой громкости. Нижняя дека и обечайка - из красного дерева. Гриф профиля «С» - тоже из красного дерева, с глянцевой уретановой отделкой. На грифе двадцать ладов, инкрустированных перламутровыми точками. Накладка и бридж – из ореха. Модель выпускается в 3 вариантах цветового исполнения. Представленная версия CD-60 Dread V3 DS – натурального цвета с глянцевым полиуретановым покрытием, контрастным черным пикгардом и блестящей хромированной фурнитурой",
                            imageUrl = "https://www.muztorg.ru/files/5tz/ng5/xpf/ows/k0g/gso/04c/0og/c/5tzng5xpfowsk0ggso04c0ogc.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Орех"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Натуральный"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Без звукоснимателя"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "25.3"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Материал топа",
                                    value = "Ель"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Ель"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Дредноут"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "20"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Махагони"
                                )
                            )
                        ),
                        Product(
                            id = "4",
                            name = "VESTON F-38/NT",
                            price = 6150.0,
                            discountPercent = 0,
                            description = "VESTON F-38/NT - акустическая гитара в корпусе фолк отличного качества, доступная по демократичной цене. Такая гитара будет отличным выбором для начинающих музыкантов и обучающихся игре на инструменте.\n" +
                                    "\n" +
                                    "Название модели отражает размер гитары: 38 дюймов. Корпус VESTON F-38 сделан из древесины агатиса. Гриф – из клёна, накладка на гриф и бридж также кленовые. На грифе 20 ладов без инкрустации. Гитара F-38 выпускается в нескольких вариантах цветового исполнения. Представленная модель элегантно выглядит в натуральном цвете с глянцевой лакированной отделкой, контрастным черным пикгардом в виде классической капли, кремовой окантовкой корпуса и грифа. На гитаре установлены металлические струны.\n" +
                                    "\n",
                            imageUrl = "https://www.muztorg.ru/files/dti/qpy/gju/tws/ks4/c0g/k00/w8c/k/dtiqpygjutwsks4c0gk00w8ck.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Клен"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Натуральный"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Без звукоснимателя"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "24.8"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Материал топа",
                                    value = "Агатис"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Клен"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Фолк"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "20"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Агатис"
                                )
                            )
                        ),
                        Product(
                            id = "5",
                            name = "EPIPHONE EJ-200CE BLACK GLD",
                            price = 54000.0,
                            discountPercent = 15,
                            description = "Электроакустическая гитара Epiphone EJ-200CE – это классика, не теряющая своей актуальности для все новых и новых поколений музыкантов. Эта гитара имеет мелодичное звучание акустики, в сочетании с мощью электрогитары, так что вы получаете лучшее из обоих миров. Прекрасно подходит для живых выступлений. Эта электроакустическая гитара даст вам возможность поделиться звуком, который лучше всего подходит вашему стилю, с большой аудиторией, и вам не придется при этом жертвовать качеством.",
                            imageUrl = "https://www.muztorg.ru/files/6mn/rrq/c2n/ecc/ogc/4o8/k88/co8/o/6mnrrqc2neccogc4o8k88co8o.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Палисандр"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Черный"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Без звукоснимателя"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "25.5"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Материал топа",
                                    value = "Ель"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Клен"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Джамбо"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "20"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Клен"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Электрогитары",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "6",
                            name = "FENDER SQUIER BULLET STRAT HT HSS BLK",
                            price = 18900.0,
                            discountPercent = 10,
                            description = "FENDER SQUIER BULLET STRAT HT HSS BLK – бюджетная модель от знаменитого американского гитарного бренда, простая, практичная и удобная гитара, разработанная для начинающих гитаристов и обучающихся игре на инструменте. Электрогитара обладает всеми характерными чертами, которые сделали Стратокастер одной из самых популярных и любимых моделей в мире. Корпус классической узнаваемой формы окрашен в стильный черный цвет, кленовый гриф имеет удобный профиль «С», на нем будет комфортно играть, если у вас рука небольшого размера. Особенность этой версии Bullet Strat – конфигурация звукоснимателей HSS с пятипозиционным переключателем. Фиксированный бридж обеспечивает стабильность строя. Это отличный выбор для Вашей первой электрогитары, в каком бы музыкальном стиле Вы ни хотели начать играть.",
                            imageUrl = "https://www.muztorg.ru/files/cqs/mwm/zoo/u0w/440/ww8/ck8/44w/4/cqsmwmzoou0w440ww8ck844w4.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Палисандр"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Черный"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Цельнокорпусная"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "25.5"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Конфигурация звукоснимателей",
                                    value = "HSS"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Клен"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Stratocaster"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "21"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Липа"
                                ),
                                Product.Attribute(
                                    name = "Тремоло/Бридж",
                                    value = "Фиксированный"
                                ),
                                Product.Attribute(
                                    name = "Тип электроники",
                                    value = "Пассивная"
                                ),
                                Product.Attribute(
                                    name = "Крепление грифа",
                                    value = "На болтах"
                                )
                            )
                        ),
                        Product(
                            id = "7",
                            name = "IBANEZ GRX70QA-TRB",
                            price = 19000.0,
                            discountPercent = 0,
                            description = "Возвращая из памяти события 80-х годов, компания Ibanez сегодня вместе со всем миром вспоминает те славные времена, когда создавались её первые метал-машины. Она никогда не имела репутации эксклюзивной, \"\"мажорной\"\" и хайэндовой, но всегда была стабильной, рациональной и \"\"народной\"\" - покупку инструмента мог потянуть практически любой человек. Вместе с тем, разумеется, линейки высших порядков стоили в десятки раз дороже бюджетных, но и к разработке последних уделялось столь же пристальное внимание, что и к первым, при ориентировке на конкретную ценовую и целевую аудиторию. Модель GRX70 стала своеобразным \"\"Трабантом\"\" компании, выпускаясь долгие годы в самых разных модификациях, предлагаясь отдельно и в наборах, в лимитированных цветах и сетах электроники. Сегодня в соответствии с конкуренцией и требованиями гитарного рынка она становится ещё более совершенной и красивой, нежели её предшественницы.",
                            imageUrl = "https://www.muztorg.ru/files/4fx/iwk/t1k/2w4/swk/oo4/wg4/cww/4fxiwkt1k2w4swkoo4wg4cww0.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Палисандр"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Красный"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Цельнокорпусная"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Конфигурация звукоснимателей",
                                    value = "HSH"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Клен"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Modern stat"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Тополь"
                                ),
                                Product.Attribute(
                                    name = "Тремоло/Бридж",
                                    value = "Тремоло"
                                ),
                                Product.Attribute(
                                    name = "Материал топа",
                                    value = "Клен"
                                )
                            )
                        ),
                        Product(
                            id = "8",
                            name = "EPIPHONE SG-Special VE Cherry",
                            price = 20100.0,
                            discountPercent = 0,
                            description = "Электрогитара EPIPHONE SG-Special VE Cherry дает возможность приобщиться к классическому стилю электрогитар линейки SG. Кроме оригинального стиля, эта гитара имеет более демократичную цену, при этом она имеет полностью идентичный внешний вид и хорошее звучание. Бренд Epiphone представляет бюджетный вариант классической электрогитары SG, сохраняя все ее основные достоинства. На деку гитары установлен комплект звукоснимателей-хамбакеров, это модели 650R и 700T Humbuckers от производителя. Цвет гитары - вишня (Cherry). ",
                            imageUrl = "https://www.muztorg.ru/files/c5b/w4y/xc8/goc/wso/csw/kwo/sg8/o/c5bw4yxc8gocwsocswkwosg8o.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Цельнокорпусная"
                                ),
                                Product.Attribute(
                                    name = "Мензура (в дюймах)",
                                    value = "24.75"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Вишневый"
                                ),
                                Product.Attribute(
                                    name = "Тремоло/Бридж",
                                    value = "Tune-o-Matic"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Тип электроники",
                                    value = "Пассивная"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Тополь"
                                ),
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Палисандр"
                                ),
                                Product.Attribute(
                                    name = "Конфигурация звукоснимателей",
                                    value = "HH"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "22"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "SG"
                                ),
                                Product.Attribute(
                                    name = "Крепление грифа",
                                    value = "На болтах"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Окоуме"
                                )
                            )
                        ),
                        Product(
                            id = "9",
                            name = "Cort X250-TDP X Series",
                            price = 23300.0,
                            discountPercent = 0,
                            description = "Модель X250 предлагает отличное качество и множество особенностей, которые можно найти у более дорогих инструментов серии X, такие как универсальная конфигурация звукоснимателей HSH с хамбакерами EMG SRO OC1 и синглом с магнитом Alnico V, тремоло система с двойной блокировкой для стабильности настройки и корпус из красного дерева меранти с кленовым грифом.",
                            imageUrl = "https://www.muztorg.ru/files/6k1/pdg/1q9/xc0/gs0/40w/k84/o48/k/6k1pdg1q9xc0gs040wk84o48k.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Меранти"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Розовый"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Superstrat"
                                ),
                                Product.Attribute(
                                    name = "Тремоло/Бридж",
                                    value = "Тремоло"
                                ),
                                Product.Attribute(
                                    name = "Конфигурация звукоснимателей",
                                    value = "HSH"
                                ),
                                Product.Attribute(
                                    name = "Мензура (в дюймах)",
                                    value = "25.5"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "24"
                                ),
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Ятоба"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Цельнокорпусная"
                                ),
                                Product.Attribute(
                                    name = "Количество струн",
                                    value = "6"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Клен"
                                ),
                                Product.Attribute(
                                    name = "Ориентация",
                                    value = "Правосторонняя"
                                ),
                                Product.Attribute(
                                    name = "Крепление грифа",
                                    value = "На болтах"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Гитарное усиление",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "10",
                            name = "MARSHALL MS-2 MICRO AMP (BLACK)",
                            price = 3900.0,
                            discountPercent = 15,
                            description = "Гитарный транзисторный усилитель MARSHALL MS-2R MICRO AMP (BLACK) с двумя каналами звучания выпущен брендом с мировым именем, компанией Marshall (Англия). Портативный гитарный усилитель MS-2R MICRO AMP подарит всем любителям электрогитары замечательное время занятий в домашних условиях, музицирования на улице и в кругу друзей на пикнике за городом. Гитарный микростэк прекрасно подойдет как для домашнего использования, так и для игры на улице. Все дело в питании стэка, которое можно осуществлять при помощи одной батарейки типа «крона» (9В). Портативный гитарный усилитель поможет значительно расширить возможности как практикующих, так и начинающих гитаристов. Кроме ручки настройки громкости (Vol), стэк имеет ручку регулировки тембра звучания (Tone) и переключатель режимов работы - вкл./выкл. (Off/On) и включение канала перегруза (OD).",
                            imageUrl = "https://www.muztorg.ru/files/497/8pu/w5k/8is/kcw/sss/8ko/g8c/4978puw5k8iskcwsss8kog8c.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Встроенные эффекты",
                                    value = "Нет"
                                ),
                                Product.Attribute(
                                    name = "Для типа гитары",
                                    value = "Для электрогитары"
                                ),
                                Product.Attribute(
                                    name = "Мощность, вт",
                                    value = "1"
                                )
                            )
                        ),
                        Product(
                            id = "11",
                            name = "MARSHALL MG10G",
                            price = 9100.0,
                            discountPercent = 0,
                            description = "MARSHALL MG10G очень хорош для любого музыканта",
                            imageUrl = "https://www.muztorg.ru/files/579/i02/by9/38k/o4g/gg8/k8k/w80/g/579i02by938ko4ggg8k8kw80g.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Встроенные эффекты",
                                    value = "Нет"
                                ),
                                Product.Attribute(
                                    name = "Для типа гитары",
                                    value = "Для электрогитары"
                                ),
                                Product.Attribute(
                                    name = "Мощность, вт",
                                    value = "1"
                                )
                            )
                        ),
                        Product(
                            id = "12",
                            name = "FENDER CHAMPION 20",
                            price = 14100.0,
                            discountPercent = 0,
                            description = "Простота в использовании, универсализм — подойдет для любого стиля игры на гитаре. 20-ваттный усилитель Champion обладает динамиком 8\"\" (специальной конструкции), с большими голосовыми усилителями и эффектами, которые позволяют легко сыграть правильные ритмы — от джаза до кантри, блюза и т. д.",
                            imageUrl = "https://www.muztorg.ru/files/8bk/fv0/kqx/nok/0w0/cc4/08g/4ko/w/8bkfv0kqxnok0w0cc408g4kow.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Модель динамиков",
                                    value = "Eminence"
                                ),
                                Product.Attribute(
                                    name = "Встроенные эффекты",
                                    value = "Есть"
                                ),
                                Product.Attribute(
                                    name = "Конфигурация динамиков",
                                    value = "1х8"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Транзисторный"
                                ),
                                Product.Attribute(
                                    name = "Петля эффектов",
                                    value = "Последовательная"
                                ),
                                Product.Attribute(
                                    name = "Мощность, вт",
                                    value = "20"
                                ),
                                Product.Attribute(
                                    name = "Количество каналов / пресетов",
                                    value = "1"
                                )
                            )
                        )
                    )
                )
            ),
            Category(
                "Укулеле",
                CopyOnWriteArrayList(
                    listOf(
                        Product(
                            id = "13",
                            name = "FLIGHT NUS 310",
                            price = 4490.0,
                            discountPercent = 0,
                            description = "FLIGHT NUS 310 - это четырехструнный сопрано- укулеле без звукоснимателя. Укулеле - это уменьшенный четырехструнный вариант акустической гитары с приятным, ярким звуком. В звучании укулеле как правило преобладают высокие и средние частоты, благодаря которым, несмотря на свой компактный размер, инструмент звучит ярко, громко и четко в любом месте. Приобретая четырехструнный сопрано- укулеле FLIGHT NUS 310 Вы получите замечательное дополнение музыкального арсенала и возможность исполнения музыки в любом месте.",
                            imageUrl = "https://www.muztorg.ru/files/315/km4/zwd/9gk/kw4/8c0/kk0/s4s/c/315km4zwd9gkkw48c0kk0s4sc.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Без звукоснимателя"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "13.6"
                                ),
                                Product.Attribute(
                                    name = "Чехол/Кейс",
                                    value = "Чехол"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Натуральный"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "12"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Сапеле"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Сопрано"
                                ),
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Палисандр"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Окоуме"
                                )
                            )
                        ),
                        Product(
                            id = "14",
                            name = "VESTON KUS 15BK",
                            price = 2540.0,
                            discountPercent = 0,
                            description = "VESTON KUS 15BK – элегантная и удобная четырехструнная гавайская гитара размера сопрано (S). Это модель начального уровня. Инструмент прекрасно подойдёт даже для неопытных музыкантов, тех, кто только учится играть. Гавайские гитары стремительно набирают свою популярность. Массовое увлечение этими миниатюрными гитарами не удивительно, ведь укулеле - любимый инструмент многих знаменитых рок-музыкантов. Их часто используют (использовали) в своем творчестве такие звёзды как Том Петти, Эдди Веддер, Джордж Харрисон и Брайан Мэй. Укулеле удобно брать с собой в поездки и путешествия. Представленная модель VESTON KUS 15BK сделана из ламинированного дерева и обладает приятным мелодичным звуком. Инструмент стильно выглядит в черном цвете с головой грифа в цвет корпуса. Колки расположены симметрично - два сверху и два снизу. На укулеле установлены мягкие нейлоновые струны.",
                            imageUrl = "https://www.muztorg.ru/files/80m/net/zsm/5k4/csw/swc/c4c/8k8/c/80mnetzsm5k4cswswcc4c8k8c.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Черный"
                                ),
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Искусственное черное дерево"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "13"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Без звукоснимателя"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "13"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Липа"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Сопрано"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Липа"
                                )
                            )
                        ),
                        Product(
                            id = "15",
                            name = "VESTON KUS 15OR",
                            price = 2530.0,
                            discountPercent = 0,
                            description = "Укулеле VESTON KUS 15OR - отличный выбор, если нужен подарок для детей или для любимой девушки. Стильный и красочный дизайн, мягкое звучание маленькой гавайской гитары не оставят равнодушными никого.\n" +
                                    "\n" +
                                    "Укулеле VESTON KUS 15OR станет также прекрасным подарком романтичной натуре. Легкая и компактная укулеле – это идеальный выбор для путешествий. Море, закат и нежная мелодия этого инструмента просто созданы друг для друга.",
                            imageUrl = "https://www.muztorg.ru/files/14g/l8i/rn2/9ms/g84/ocw/kg8/4ow/4/14gl8irn29msg84ocwkg84ow4.jpg",
                            attributes = listOf(
                                Product.Attribute(
                                    name = "Материал накладки грифа",
                                    value = "Искусственное черное дерево"
                                ),
                                Product.Attribute(
                                    name = "Цвет",
                                    value = "Оранжевый"
                                ),
                                Product.Attribute(
                                    name = "Количество ладов (диапазон)",
                                    value = "13"
                                ),
                                Product.Attribute(
                                    name = "Тип",
                                    value = "Без звукоснимателя"
                                ),
                                Product.Attribute(
                                    name = "Мензура (диапазон)",
                                    value = "13"
                                ),
                                Product.Attribute(
                                    name = "Материал грифа",
                                    value = "Ламинат"
                                ),
                                Product.Attribute(
                                    name = "Тип корпуса",
                                    value = "Сопрано"
                                ),
                                Product.Attribute(
                                    name = "Материал корпуса",
                                    value = "Липа"
                                )
                            )
                        )
                    )
                )
            )
        )
    )
}