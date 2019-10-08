package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class PlayerXX(
    @SerializedName("firstName")
    val firstName: String?,
    @SerializedName("lastName")
    val lastName: String?,
    @SerializedName("playerId")
    val playerId: Int?
)