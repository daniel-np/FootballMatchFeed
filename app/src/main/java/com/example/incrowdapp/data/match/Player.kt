package com.example.incrowdapp.data.match


import com.google.gson.annotations.SerializedName

data class Player(
    @SerializedName("captain")
    val captain: Boolean?,
    @SerializedName("firstName")
    val firstName: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("known")
    val known: String?,
    @SerializedName("lastName")
    val lastName: String?,
    @SerializedName("playerStats")
    val playerStats: PlayerStats?,
    @SerializedName("position")
    val position: String?,
    @SerializedName("shirtNumber")
    val shirtNumber: Int?,
    @SerializedName("status")
    val status: String?
)