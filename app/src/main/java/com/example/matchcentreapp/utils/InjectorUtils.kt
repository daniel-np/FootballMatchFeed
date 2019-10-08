package com.example.matchcentreapp.utils

import com.example.matchcentreapp.data.ApiService
import com.example.matchcentreapp.data.CommentaryRepository
import com.example.matchcentreapp.data.MatchRepository
import com.example.matchcentreapp.ui.match_feed.MatchFeedViewModelFactory
import com.example.matchcentreapp.ui.team_stats.TeamStatsViewModelFactory

object InjectorUtils {

    private val apiService = ApiService()
    private val commentaryRepository = CommentaryRepository(apiService)
    private val matchRepository = MatchRepository(apiService)

    fun provideMatchViewModelFactory(): MatchFeedViewModelFactory {
        return MatchFeedViewModelFactory(commentaryRepository, matchRepository)
    }

    fun provideTeamStatsViewModelFactory(): TeamStatsViewModelFactory {
       return TeamStatsViewModelFactory(matchRepository)
    }
}