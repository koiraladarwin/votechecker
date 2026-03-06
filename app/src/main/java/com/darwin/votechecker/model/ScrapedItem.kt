package com.darwin.votechecker.model

data class ScrapedItem(
    val candidateName: String,
    val candidateImage: String,
    val partyName: String,
    val partySymbol: String,
    val votes: String
)
