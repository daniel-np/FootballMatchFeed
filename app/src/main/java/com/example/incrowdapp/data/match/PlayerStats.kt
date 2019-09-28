package com.example.incrowdapp.data.match


import com.google.gson.annotations.SerializedName

data class PlayerStats(
    @SerializedName("formationPlace")
    val formationPlace: Int?
)