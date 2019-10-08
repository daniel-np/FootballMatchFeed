package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("attendance")
    val attendance: Int?,
    @SerializedName("awayTeam")
    val awayTeam: AwayTeam?,
    @SerializedName("competition")
    val competition: String?,
    @SerializedName("competitionId")
    val competitionId: Int?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("events")
    val events: List<Event?>?,
    @SerializedName("feedMatchId")
    val feedMatchId: Int?,
    @SerializedName("homeTeam")
    val homeTeam: HomeTeam?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("minute")
    val minute: Int?,
    @SerializedName("officials")
    val officials: List<Official?>?,
    @SerializedName("period")
    val period: String?,
    @SerializedName("round")
    val round: Int?,
    @SerializedName("season")
    val season: String?,
    @SerializedName("seasonId")
    val seasonId: Int?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("venue")
    val venue: Venue?
)