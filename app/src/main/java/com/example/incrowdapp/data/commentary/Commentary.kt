package com.example.incrowdapp.data.commentary

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Commentary(

    @SerializedName("data")
    @Expose
    var data: Data? = null
)

data class Data(
    @SerializedName("homeTeamName")
    @Expose
    var homeTeamName: String? = null,
    @SerializedName("homeScore")
    @Expose
    var homeScore: Int? = null,
    @SerializedName("awayTeamName")
    @Expose
    var awayTeamName: String? = null,
    @SerializedName("awayScore")
    @Expose
    var awayScore: Int? = null,
    @SerializedName("competition")
    @Expose
    var competition: String? = null,
    @SerializedName("commentaryEntries")
    @Expose
    var commentaryEntries: List<CommentaryEntry>? = null
)

data class CommentaryEntry(
    @SerializedName("type")
    @Expose
    var type: String? = null,
    @SerializedName("comment")
    @Expose
    var comment: String? = null,
    @SerializedName("period")
    @Expose
    var period: Int? = null,
    @SerializedName("time")
    @Expose
    var time: String? = null
)