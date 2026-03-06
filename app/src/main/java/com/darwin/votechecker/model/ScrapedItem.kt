package com.darwin.votechecker.model

data class ScrapedData(
    val totalCount :String,
    val maleCount :String,
    val femaleCount :String,
    val items: List<ScrapedItem>,
)
data class ScrapedItem(
    val candidateName: String,
    val candidateImage: String,
    val partyName: String,
    val partySymbol: String,
    val votes: String
)
