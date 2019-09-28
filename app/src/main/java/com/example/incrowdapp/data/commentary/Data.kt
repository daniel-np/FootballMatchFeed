package com.example.incrowdapp.data.commentary

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {

    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("feedMatchId")
    @Expose
    var feedMatchId: Int? = null
    @SerializedName("homeTeamName")
    @Expose
    var homeTeamName: String? = null
    @SerializedName("homeTeamId")
    @Expose
    var homeTeamId: String? = null
    @SerializedName("homeScore")
    @Expose
    var homeScore: Int? = null
    @SerializedName("awayTeamName")
    @Expose
    var awayTeamName: String? = null
    @SerializedName("awayTeamId")
    @Expose
    var awayTeamId: String? = null
    @SerializedName("awayScore")
    @Expose
    var awayScore: Int? = null
    @SerializedName("competitionId")
    @Expose
    var competitionId: Int? = null
    @SerializedName("competition")
    @Expose
    var competition: String? = null
    @SerializedName("commentaryEntries")
    @Expose
    var commentaryEntries: List<CommentaryEntry>? = null

}