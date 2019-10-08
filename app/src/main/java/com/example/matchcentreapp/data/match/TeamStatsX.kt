package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class TeamStatsX(
    @SerializedName("bottomCentreSaves")
    val bottomCentreSaves: Int?,
    @SerializedName("bottomRightGoals")
    val bottomRightGoals: Int?,
    @SerializedName("bottomRightSaves")
    val bottomRightSaves: Int?,
    @SerializedName("centreBoxShots")
    val centreBoxShots: Int?,
    @SerializedName("concededShotsOnTargetInsideBox")
    val concededShotsOnTargetInsideBox: Int?,
    @SerializedName("concededShotsOnTargetOutsideBox")
    val concededShotsOnTargetOutsideBox: Int?,
    @SerializedName("cornersLost")
    val cornersLost: Int?,
    @SerializedName("cornersTaken")
    val cornersTaken: Int?,
    @SerializedName("cornersWon")
    val cornersWon: Int?,
    @SerializedName("defenderBlocks")
    val defenderBlocks: Int?,
    @SerializedName("defenderGoals")
    val defenderGoals: Int?,
    @SerializedName("finalThirdFouls")
    val finalThirdFouls: Int?,
    @SerializedName("firstHalfGoals")
    val firstHalfGoals: Int?,
    @SerializedName("formation")
    val formation: String?,
    @SerializedName("freeKicksConceded")
    val freeKicksConceded: Int?,
    @SerializedName("freeKicksWon")
    val freeKicksWon: Int?,
    @SerializedName("goalAssists")
    val goalAssists: Int?,
    @SerializedName("goalKicks")
    val goalKicks: Int?,
    @SerializedName("goals")
    val goals: Int?,
    @SerializedName("goalsConceded")
    val goalsConceded: Int?,
    @SerializedName("goalsConcededInsideBox")
    val goalsConcededInsideBox: Int?,
    @SerializedName("insideBoxBlocks")
    val insideBoxBlocks: Int?,
    @SerializedName("insideBoxGoalkeeperSaves")
    val insideBoxGoalkeeperSaves: Int?,
    @SerializedName("insideBoxGoals")
    val insideBoxGoals: Int?,
    @SerializedName("insideBoxSaves")
    val insideBoxSaves: Int?,
    @SerializedName("intentionalGoalAssists")
    val intentionalGoalAssists: Int?,
    @SerializedName("keeperDivingSaves")
    val keeperDivingSaves: Int?,
    @SerializedName("leftBoxShots")
    val leftBoxShots: Int?,
    @SerializedName("leftFootShotGoals")
    val leftFootShotGoals: Int?,
    @SerializedName("leftFootShotSaves")
    val leftFootShotSaves: Int?,
    @SerializedName("leftFootShots")
    val leftFootShots: Int?,
    @SerializedName("leftMisses")
    val leftMisses: Int?,
    @SerializedName("midfielderGoals")
    val midfielderGoals: Int?,
    @SerializedName("openPlayGoalAssists")
    val openPlayGoalAssists: Int?,
    @SerializedName("openPlayGoals")
    val openPlayGoals: Int?,
    @SerializedName("openPlayShots")
    val openPlayShots: Int?,
    @SerializedName("outsideBoxCentreShots")
    val outsideBoxCentreShots: Int?,
    @SerializedName("outsideBoxGoalkeeperSaves")
    val outsideBoxGoalkeeperSaves: Int?,
    @SerializedName("outsideBoxMisses")
    val outsideBoxMisses: Int?,
    @SerializedName("outsideBoxSaves")
    val outsideBoxSaves: Int?,
    @SerializedName("penaltiesWon")
    val penaltiesWon: Int?,
    @SerializedName("penaltyGoals")
    val penaltyGoals: Int?,
    @SerializedName("possession")
    val possession: Double?,
    @SerializedName("rightFootGoals")
    val rightFootGoals: Int?,
    @SerializedName("rightFootSaves")
    val rightFootSaves: Int?,
    @SerializedName("rightFootShots")
    val rightFootShots: Int?,
    @SerializedName("saves")
    val saves: Int?,
    @SerializedName("shotsBlocked")
    val shotsBlocked: Int?,
    @SerializedName("shotsOffTarget")
    val shotsOffTarget: Int?,
    @SerializedName("shotsOnGoal")
    val shotsOnGoal: Int?,
    @SerializedName("shotsOnTarget")
    val shotsOnTarget: Int?,
    @SerializedName("shotsOnTargetAssists")
    val shotsOnTargetAssists: Int?,
    @SerializedName("substitutionsMade")
    val substitutionsMade: Int?,
    @SerializedName("teamYellowCards")
    val teamYellowCards: Int?,
    @SerializedName("throwIns")
    val throwIns: Int?,
    @SerializedName("topRightGoals")
    val topRightGoals: Int?,
    @SerializedName("totalCornersIntoBox")
    val totalCornersIntoBox: Int?
)