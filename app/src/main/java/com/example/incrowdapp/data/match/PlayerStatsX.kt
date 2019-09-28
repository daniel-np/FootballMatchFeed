package com.example.incrowdapp.data.match


import com.google.gson.annotations.SerializedName

data class PlayerStatsX(
    @SerializedName("concededShotsOnTargetInsideBox")
    val concededShotsOnTargetInsideBox: Int?,
    @SerializedName("concededShotsOnTargetOutsideBox")
    val concededShotsOnTargetOutsideBox: Int?,
    @SerializedName("formationPlace")
    val formationPlace: Int?,
    @SerializedName("goalKicks")
    val goalKicks: Int?,
    @SerializedName("goalsConceded")
    val goalsConceded: Int?,
    @SerializedName("goalsConcededInsideBox")
    val goalsConcededInsideBox: Int?,
    @SerializedName("insideBoxSaves")
    val insideBoxSaves: Int?,
    @SerializedName("keeperDivingSaves")
    val keeperDivingSaves: Int?,
    @SerializedName("minutesPlayed")
    val minutesPlayed: Int?,
    @SerializedName("outsideBoxSaves")
    val outsideBoxSaves: Int?,
    @SerializedName("saves")
    val saves: Int?,
    @SerializedName("started")
    val started: Int?
)