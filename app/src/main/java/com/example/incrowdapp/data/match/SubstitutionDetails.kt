package com.example.incrowdapp.data.match


import com.google.gson.annotations.SerializedName

data class SubstitutionDetails(
    @SerializedName("playerSubOff")
    val playerSubOff: PlayerSubOff?,
    @SerializedName("playerSubOn")
    val playerSubOn: PlayerSubOn?,
    @SerializedName("reason")
    val reason: String?
)