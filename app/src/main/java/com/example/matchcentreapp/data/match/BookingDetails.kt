package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class BookingDetails(
    @SerializedName("player")
    val player: PlayerX?,
    @SerializedName("type")
    val type: String?
)