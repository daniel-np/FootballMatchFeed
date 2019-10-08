package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("bookingDetails")
    val bookingDetails: BookingDetails?,
    @SerializedName("eventId")
    val eventId: Int?,
    @SerializedName("eventTimestamp")
    val eventTimestamp: String?,
    @SerializedName("goalDetails")
    val goalDetails: GoalDetails?,
    @SerializedName("minute")
    val minute: Int?,
    @SerializedName("optaMinute")
    val optaMinute: Int?,
    @SerializedName("period")
    val period: String?,
    @SerializedName("substitutionDetails")
    val substitutionDetails: SubstitutionDetails?,
    @SerializedName("teamId")
    val teamId: String?,
    @SerializedName("teamImageUrl")
    val teamImageUrl: String?,
    @SerializedName("time")
    val time: String?,
    @SerializedName("type")
    val type: String?
)