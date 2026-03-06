package com.darwin.votechecker.model

data class Constituency(
    val name: String,
    val alias: String
)

data class District(
    val name: String,
    val constituencies: List<Constituency>
)

data class Province(
    val name: String,
    val districts: List<District>
)

object LocationData {

    val provinces = listOf(
        Province(
            name = "SudurPachim Pradesh", districts = listOf(
                District(
                    name = "Bajura",
                    constituencies = listOf(
                        Constituency("Bajura - 1", "bajura-1")
                    )
                ),

                District(
                    name = "Achham",
                    constituencies = listOf(
                        Constituency("Achham - 1", "achham-1"),
                        Constituency("Achham - 2", "achham-2")
                    )
                ),

                District(
                    name = "Bajhang",
                    constituencies = listOf(
                        Constituency("Bajhang - 1", "bajhang-1")
                    )
                ),

                District(
                    name = "Doti",
                    constituencies = listOf(
                        Constituency("Doti - 1", "doti-1")
                    )
                ),

                District(
                    name = "Kailali",
                    constituencies = listOf(
                        Constituency("Kailali - 1", "kailali-1"),
                        Constituency("Kailali - 2", "kailali-2"),
                        Constituency("Kailali - 3", "kailali-3"),
                        Constituency("Kailali - 4", "kailali-4"),
                        Constituency("Kailali - 5", "kailali-5")
                    )
                ),

                District(
                    name = "Darchula",
                    constituencies = listOf(
                        Constituency("Darchula - 1", "darchula-1")
                    )
                ),

                District(
                    name = "Baitadi",
                    constituencies = listOf(
                        Constituency("Baitadi - 1", "baitadi-1")
                    )
                ),

                District(
                    name = "Dadeldhura",
                    constituencies = listOf(
                        Constituency("Dadeldhura - 1", "dadeldhura-1")
                    )
                ),

                District(
                    name = "Kanchanpur",
                    constituencies = listOf(
                        Constituency("Kanchanpur - 1", "kanchanpur-1"),
                        Constituency("Kanchanpur - 2", "kanchanpur-2"),
                        Constituency("Kanchanpur - 3", "kanchanpur-3")
                    )
                )
            )
        ),
        Province(
            name = "Karnali Pradesh", districts = listOf(
                District(
                    name = "Salyan",
                    constituencies = listOf(
                        Constituency("Salyan - 1", "salyan-1")
                    )
                ),

                District(
                    name = "Dolpa",
                    constituencies = listOf(
                        Constituency("Dolpa - 1", "dolpa-1")
                    )
                ),

                District(
                    name = "Mugu",
                    constituencies = listOf(
                        Constituency("Mugu - 1", "mugu-1")
                    )
                ),

                District(
                    name = "Jumla",
                    constituencies = listOf(
                        Constituency("Jumla - 1", "jumla-1")
                    )
                ),

                District(
                    name = "Kalikot",
                    constituencies = listOf(
                        Constituency("Kalikot - 1", "kalikot-1")
                    )
                ),

                District(
                    name = "Humla",
                    constituencies = listOf(
                        Constituency("Humla - 1", "humla-1")
                    )
                ),

                District(
                    name = "Jajarkot",
                    constituencies = listOf(
                        Constituency("Jajarkot - 1", "jajarkot-1")
                    )
                ),

                District(
                    name = "Dailekh",
                    constituencies = listOf(
                        Constituency("Dailekh - 1", "dailekh-1"),
                        Constituency("Dailekh - 2", "dailekh-2")
                    )
                ),

                District(
                    name = "Surkhet",
                    constituencies = listOf(
                        Constituency("Surkhet - 1", "surkhet-1"),
                        Constituency("Surkhet - 2", "surkhet-2")
                    )
                ),

                District(
                    name = "Rukum West",
                    constituencies = listOf(
                        Constituency("Rukum West - 1", "rukum-west-1")
                    )
                )
            )
        ),
        Province(
            name = "Lumbini Pradesh", districts = listOf(
                District(
                    name = "Gulmi",
                    constituencies = listOf(
                        Constituency("Gulmi - 1", "gulmi-1"),
                        Constituency("Gulmi - 2", "gulmi-2")
                    )
                ),

                District(
                    name = "Palpa",
                    constituencies = listOf(
                        Constituency("Palpa - 1", "palpa-1"),
                        Constituency("Palpa - 2", "palpa-2")
                    )
                ),

                District(
                    name = "Arghakhanchi",
                    constituencies = listOf(
                        Constituency("Arghakhanchi - 1", "arghakhanchi-1")
                    )
                ),

                District(
                    name = "Rupandehi",
                    constituencies = listOf(
                        Constituency("Rupandehi - 1", "rupandehi-1"),
                        Constituency("Rupandehi - 2", "rupandehi-2"),
                        Constituency("Rupandehi - 3", "rupandehi-3"),
                        Constituency("Rupandehi - 4", "rupandehi-4"),
                        Constituency("Rupandehi - 5", "rupandehi-5")
                    )
                ),

                District(
                    name = "Kapilvastu",
                    constituencies = listOf(
                        Constituency("Kapilvastu - 1", "kapilvastu-1"),
                        Constituency("Kapilvastu - 2", "kapilvastu-2"),
                        Constituency("Kapilvastu - 3", "kapilvastu-3")
                    )
                ),

                District(
                    name = "Rukum East",
                    constituencies = listOf(
                        Constituency("Rukum East - 1", "rukum-east-1")
                    )
                ),

                District(
                    name = "Rolpa",
                    constituencies = listOf(
                        Constituency("Rolpa - 1", "rolpa-1")
                    )
                ),

                District(
                    name = "Pyuthan",
                    constituencies = listOf(
                        Constituency("Pyuthan - 1", "pyuthan-1")
                    )
                ),

                District(
                    name = "Dang",
                    constituencies = listOf(
                        Constituency("Dang - 1", "dang-1"),
                        Constituency("Dang - 2", "dang-2"),
                        Constituency("Dang - 3", "dang-3")
                    )
                ),

                District(
                    name = "Banke",
                    constituencies = listOf(
                        Constituency("Banke - 1", "banke-1"),
                        Constituency("Banke - 2", "banke-2"),
                        Constituency("Banke - 3", "banke-3")
                    )
                ),

                District(
                    name = "Bardiya",
                    constituencies = listOf(
                        Constituency("Bardiya - 1", "bardiya-1"),
                        Constituency("Bardiya - 2", "bardiya-2")
                    )
                ),

                District(
                    name = "Nawalparasi West",
                    constituencies = listOf(
                        Constituency("Nawalparasi West - 1", "nawalparasi-west-1"),
                        Constituency("Nawalparasi West - 2", "nawalparasi-west-2")
                    )
                )
            )
        ),
        Province(
            name = "Gandaki Pradesh", districts = listOf(
                District(
                    name = "Gorkha",
                    constituencies = listOf(
                        Constituency("Gorkha - 1", "gorkha-1"),
                        Constituency("Gorkha - 2", "gorkha-2")
                    )
                ),

                District(
                    name = "Manang",
                    constituencies = listOf(
                        Constituency("Manang - 1", "manang-1")
                    )
                ),

                District(
                    name = "Lamjung",
                    constituencies = listOf(
                        Constituency("Lamjung - 1", "lamjung-1")
                    )
                ),

                District(
                    name = "Kaski",
                    constituencies = listOf(
                        Constituency("Kaski - 1", "kaski-1"),
                        Constituency("Kaski - 2", "kaski-2"),
                        Constituency("Kaski - 3", "kaski-3")
                    )
                ),

                District(
                    name = "Tanahun",
                    constituencies = listOf(
                        Constituency("Tanahun - 1", "tanahun-1"),
                        Constituency("Tanahun - 2", "tanahun-2")
                    )
                ),

                District(
                    name = "Syangja",
                    constituencies = listOf(
                        Constituency("Syangja - 1", "syangja-1"),
                        Constituency("Syangja - 2", "syangja-2")
                    )
                ),

                District(
                    name = "Nawalparasi East",
                    constituencies = listOf(
                        Constituency("Nawalparasi East - 1", "nawalparasi-east-1"),
                        Constituency("Nawalparasi East - 2", "nawalparasi-east-2")
                    )
                ),

                District(
                    name = "Mustang",
                    constituencies = listOf(
                        Constituency("Mustang - 1", "mustang-1")
                    )
                ),

                District(
                    name = "Myagdi",
                    constituencies = listOf(
                        Constituency("Myagdi - 1", "myagdi-1")
                    )
                ),

                District(
                    name = "Baglung",
                    constituencies = listOf(
                        Constituency("Baglung - 1", "baglung-1"),
                        Constituency("Baglung - 2", "baglung-2")
                    )
                ),

                District(
                    name = "Parbat",
                    constituencies = listOf(
                        Constituency("Parbat - 1", "parbat-1")
                    )
                )
            )
        ),
        Province(
            name = "Bagmati Pradesh", districts = listOf(
                District(
                    name = "Dolakha",
                    constituencies = listOf(
                        Constituency("Dolakha - 1", "dolakha-1")
                    )
                ),

                District(
                    name = "Ramechhap",
                    constituencies = listOf(
                        Constituency("Ramechhap - 1", "ramechhap-1")
                    )
                ),

                District(
                    name = "Sindhuli",
                    constituencies = listOf(
                        Constituency("Sindhuli - 1", "sindhuli-1"),
                        Constituency("Sindhuli - 2", "sindhuli-2")
                    )
                ),

                District(
                    name = "Rasuwa",
                    constituencies = listOf(
                        Constituency("Rasuwa - 1", "rasuwa-1")
                    )
                ),

                District(
                    name = "Dhading",
                    constituencies = listOf(
                        Constituency("Dhading - 1", "dhading-1"),
                        Constituency("Dhading - 2", "dhading-2")
                    )
                ),

                District(
                    name = "Nuwakot",
                    constituencies = listOf(
                        Constituency("Nuwakot - 1", "nuwakot-1"),
                        Constituency("Nuwakot - 2", "nuwakot-2")
                    )
                ),

                District(
                    name = "Kathmandu",
                    constituencies = listOf(
                        Constituency("Kathmandu - 1", "kathmandu-1"),
                        Constituency("Kathmandu - 2", "kathmandu-2"),
                        Constituency("Kathmandu - 3", "kathmandu-3"),
                        Constituency("Kathmandu - 4", "kathmandu-4"),
                        Constituency("Kathmandu - 5", "kathmandu-5"),
                        Constituency("Kathmandu - 6", "kathmandu-6"),
                        Constituency("Kathmandu - 7", "kathmandu-7"),
                        Constituency("Kathmandu - 8", "kathmandu-8"),
                        Constituency("Kathmandu - 9", "kathmandu-9"),
                        Constituency("Ktm - 10", "kathmandu-10")
                    )
                ),

                District(
                    name = "Bhaktapur",
                    constituencies = listOf(
                        Constituency("Bhaktapur - 1", "bhaktapur-1"),
                        Constituency("Bhaktapur - 2", "bhaktapur-2")
                    )
                ),

                District(
                    name = "Lalitpur",
                    constituencies = listOf(
                        Constituency("Lalitpur - 1", "lalitpur-1"),
                        Constituency("Lalitpur - 2", "lalitpur-2"),
                        Constituency("Lalitpur - 3", "lalitpur-3")
                    )
                ),

                District(
                    name = "Kavrepalanchok",
                    constituencies = listOf(
                        Constituency("Kavrepalanchok - 1", "kavrepalanchok-1"),
                        Constituency("Kavrepalanchok - 2", "kavrepalanchok-2")
                    )
                ),

                District(
                    name = "Sindhupalchok",
                    constituencies = listOf(
                        Constituency("Sindhupalchok - 1", "sindhupalchok-1"),
                        Constituency("Sindhupalchok - 2", "sindhupalchok-2")
                    )
                ),

                District(
                    name = "Makwanpur",
                    constituencies = listOf(
                        Constituency("Makwanpur - 1", "makwanpur-1"),
                        Constituency("Makwanpur - 2", "makwanpur-2")
                    )
                ),

                District(
                    name = "Chitwan",
                    constituencies = listOf(
                        Constituency("Chitwan - 1", "chitwan-1"),
                        Constituency("Chitwan - 2", "chitwan-2"),
                        Constituency("Chitwan - 3", "chitwan-3")
                    )
                )
            )
        ),
        Province(
            name = "Madesh Pradesh",
            districts = listOf(
                District(
                    name = "Saptari",
                    constituencies = listOf(
                        Constituency("Saptari - 1", "saptari-1"),
                        Constituency("Saptari - 2", "saptari-2"),
                        Constituency("Saptari - 3", "saptari-3"),
                        Constituency("Saptari - 4", "saptari-4")
                    )
                ),

                District(
                    name = "Siraha",
                    constituencies = listOf(
                        Constituency("Siraha - 1", "siraha-1"),
                        Constituency("Siraha - 2", "siraha-2"),
                        Constituency("Siraha - 3", "siraha-3"),
                        Constituency("Siraha - 4", "siraha-4")
                    )
                ),

                District(
                    name = "Dhanusha",
                    constituencies = listOf(
                        Constituency("Dhanusha - 1", "dhanusha-1"),
                        Constituency("Dhanusha - 2", "dhanusha-2"),
                        Constituency("Dhanusha - 3", "dhanusha-3"),
                        Constituency("Dhanusha - 4", "dhanusha-4")
                    )
                ),

                District(
                    name = "Mahottari",
                    constituencies = listOf(
                        Constituency("Mahottari - 1", "mahottari-1"),
                        Constituency("Mahottari - 2", "mahottari-2"),
                        Constituency("Mahottari - 3", "mahottari-3"),
                        Constituency("Mahottari - 4", "mahottari-4")
                    )
                ),

                District(
                    name = "Sarlahi",
                    constituencies = listOf(
                        Constituency("Sarlahi - 1", "sarlahi-1"),
                        Constituency("Sarlahi - 2", "sarlahi-2"),
                        Constituency("Sarlahi - 3", "sarlahi-3"),
                        Constituency("Sarlahi - 4", "sarlahi-4")
                    )
                ),

                District(
                    name = "Rautahat",
                    constituencies = listOf(
                        Constituency("Rautahat - 1", "rautahat-1"),
                        Constituency("Rautahat - 2", "rautahat-2"),
                        Constituency("Rautahat - 3", "rautahat-3"),
                        Constituency("Rautahat - 4", "rautahat-4")
                    )
                ),

                District(
                    name = "Bara",
                    constituencies = listOf(
                        Constituency("Bara - 1", "bara-1"),
                        Constituency("Bara - 2", "bara-2"),
                        Constituency("Bara - 3", "bara-3"),
                        Constituency("Bara - 4", "bara-4")
                    )
                ),

                District(
                    name = "Parsa",
                    constituencies = listOf(
                        Constituency("Parsa - 1", "parsa-1"),
                        Constituency("Parsa - 2", "parsa-2"),
                        Constituency("Parsa - 3", "parsa-3"),
                        Constituency("Parsa - 4", "parsa-4")
                    )
                )
            )
        ),

        Province(
            name = "Koshi Province",
            districts = listOf(

                District(
                    name = "Taplejung",
                    constituencies = listOf(
                        Constituency("Taplejung - 1", "taplejung-1")
                    )
                ),

                District(
                    name = "Panchthar",
                    constituencies = listOf(
                        Constituency("Panchthar - 1", "panchthar-1")
                    )
                ),

                District(
                    name = "Ilam",
                    constituencies = listOf(
                        Constituency("Ilam - 1", "ilam-1"),
                        Constituency("Ilam - 2", "ilam-2")
                    )
                ),

                District(
                    name = "Jhapa",
                    constituencies = listOf(
                        Constituency("Jhapa - 1", "jhapa-1"),
                        Constituency("Jhapa - 2", "jhapa-2"),
                        Constituency("Jhapa - 3", "jhapa-3"),
                        Constituency("Jhapa - 4", "jhapa-4"),
                        Constituency("Jhapa - 5", "jhapa-5")
                    )
                ),

                District(
                    name = "Sankhuwasabha",
                    constituencies = listOf(
                        Constituency("Sankhuwasabha - 1", "sankhuwasabha-1")
                    )
                ),

                District(
                    name = "Terhathum",
                    constituencies = listOf(
                        Constituency("Terhathum - 1", "terhathum-1")
                    )
                ),

                District(
                    name = "Bhojpur",
                    constituencies = listOf(
                        Constituency("Bhojpur - 1", "bhojpur-1")
                    )
                ),

                District(
                    name = "Dhankuta",
                    constituencies = listOf(
                        Constituency("Dhankuta - 1", "dhankuta-1")
                    )
                ),

                District(
                    name = "Morang",
                    constituencies = listOf(
                        Constituency("Morang - 1", "morang-1"),
                        Constituency("Morang - 2", "morang-2"),
                        Constituency("Morang - 3", "morang-3"),
                        Constituency("Morang - 4", "morang-4"),
                        Constituency("Morang - 5", "morang-5"),
                        Constituency("Morang - 6", "morang-6")
                    )
                ),

                District(
                    name = "Sunsari",
                    constituencies = listOf(
                        Constituency("Sunsari - 1", "sunsari-1"),
                        Constituency("Sunsari - 2", "sunsari-2"),
                        Constituency("Sunsari - 3", "sunsari-3"),
                        Constituency("Sunsari - 4", "sunsari-4")
                    )
                ),

                District(
                    name = "Solukhumbu",
                    constituencies = listOf(
                        Constituency("Solukhumbu - 1", "solukhumbu-1")
                    )
                ),

                District(
                    name = "Khotang",
                    constituencies = listOf(
                        Constituency("Khotang - 1", "khotang-1")
                    )
                ),

                District(
                    name = "Okhaldhunga",
                    constituencies = listOf(
                        Constituency("Okhaldhunga - 1", "okhaldhunga-1")
                    )
                ),

                District(
                    name = "Udayapur",
                    constituencies = listOf(
                        Constituency("Udayapur - 1", "udayapur-1"),
                        Constituency("Udayapur - 2", "udayapur-2")
                    )
                )
            )
        )

    ).reversed()
}
