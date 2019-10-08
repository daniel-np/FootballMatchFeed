package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class PlayerStats(
    @SerializedName("formationPlace")
    val formationPlace: Int?
)