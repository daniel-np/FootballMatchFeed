package com.example.incrowdapp.utils

import com.example.incrowdapp.data.ApiService
import com.example.incrowdapp.data.CommentaryRepository
import com.example.incrowdapp.data.MatchRepository
import com.example.incrowdapp.ui.match_feed.MatchFeedViewModelFactory
import com.example.incrowdapp.ui.team_stats.TeamStatsViewModel

class InjectorUtils {

    private val apiService = ApiService()
    private val commentaryRepository = CommentaryRepository(apiService)
    private val matchRepository = MatchRepository(apiService)

    fun provideMatchViewModelFactory(): MatchFeedViewModelFactory {
        return MatchFeedViewModelFactory(commentaryRepository, matchRepository)
    }

   // fun provideTeamStatsViewModelFactor(): TeamStatsViewModelFactory {
     //  return TeamStatsViewModelFactory(matchRepository)
    //}
}