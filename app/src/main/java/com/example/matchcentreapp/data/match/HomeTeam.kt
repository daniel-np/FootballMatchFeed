package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class HomeTeam(
    @SerializedName("halfTimeScore")
    val halfTimeScore: Int?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("imageUrl")
    val imageUrl: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("players")
    val players: List<TeamPlayer?>?,
    @SerializedName("score")
    val score: Int?,
    @SerializedName("shortName")
    val shortName: String?,
    @SerializedName("teamStats")
    val teamStats: TeamStatsX?
)