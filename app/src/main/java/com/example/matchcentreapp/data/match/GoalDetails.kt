package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class GoalDetails(
    @SerializedName("player")
    val player: PlayerXX?,
    @SerializedName("type")
    val type: String?
)