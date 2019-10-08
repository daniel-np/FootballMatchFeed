package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class TeamStats(
    @SerializedName("bottomCentreSaves")
    val bottomCentreSaves: Int?,
    @SerializedName("bottomLeftGoals")
    val bottomLeftGoals: Int?,
    @SerializedName("bottomLeftSaves")
    val bottomLeftSaves: Int?,
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
    @SerializedName("directFreeKicks")
    val directFreeKicks: Int?,
    @SerializedName("finalThirdFouls")
    val finalThirdFouls: Int?,
    @SerializedName("formation")
    val formation: String?,
    @SerializedName("freeKickCrosses")
    val freeKickCrosses: Int?,
    @SerializedName("freeKicksConceded")
    val freeKicksConceded: Int?,
    @SerializedName("freeKicksWon")
    val freeKicksWon: Int?,
    @SerializedName("goalKicks")
    val goalKicks: Int?,
    @SerializedName("goals")
    val goals: Int?,
    @SerializedName("goalsConceded")
    val goalsConceded: Int?,
    @SerializedName("goalsConcededInsideBox")
    val goalsConcededInsideBox: Int?,
    @SerializedName("handBalls")
    val handBalls: Int?,
    @SerializedName("headerGoals")
    val headerGoals: Int?,
    @SerializedName("headerMisses")
    val headerMisses: Int?,
    @SerializedName("headerShots")
    val headerShots: Int?,
    @SerializedName("insideBoxGoalkeeperSaves")
    val insideBoxGoalkeeperSaves: Int?,
    @SerializedName("insideBoxGoals")
    val insideBoxGoals: Int?,
    @SerializedName("insideBoxMisses")
    val insideBoxMisses: Int?,
    @SerializedName("insideBoxSaves")
    val insideBoxSaves: Int?,
    @SerializedName("keeperDivingSaves")
    val keeperDivingSaves: Int?,
    @SerializedName("leftFootShots")
    val leftFootShots: Int?,
    @SerializedName("openPlayGoals")
    val openPlayGoals: Int?,
    @SerializedName("openPlayShots")
    val openPlayShots: Int?,
    @SerializedName("outsideBoxBlocks")
    val outsideBoxBlocks: Int?,
    @SerializedName("outsideBoxCentreShots")
    val outsideBoxCentreShots: Int?,
    @SerializedName("outsideBoxGoalkeeperSaves")
    val outsideBoxGoalkeeperSaves: Int?,
    @SerializedName("outsideBoxMisses")
    val outsideBoxMisses: Int?,
    @SerializedName("outsideBoxSaves")
    val outsideBoxSaves: Int?,
    @SerializedName("penaltiesConceded")
    val penaltiesConceded: Int?,
    @SerializedName("penaltiesFaced")
    val penaltiesFaced: Int?,
    @SerializedName("penaltyGoalsConceded")
    val penaltyGoalsConceded: Int?,
    @SerializedName("possession")
    val possession: Double?,
    @SerializedName("rightFootSaves")
    val rightFootSaves: Int?,
    @SerializedName("rightFootShots")
    val rightFootShots: Int?,
    @SerializedName("rightMisses")
    val rightMisses: Int?,
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
    @SerializedName("topMisses")
    val topMisses: Int?,
    @SerializedName("totalCornersIntoBox")
    val totalCornersIntoBox: Int?,
    @SerializedName("woodworkHits")
    val woodworkHits: Int?
)