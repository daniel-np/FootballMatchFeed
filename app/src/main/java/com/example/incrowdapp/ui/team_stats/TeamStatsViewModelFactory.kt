package com.example.incrowdapp.ui.team_stats

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.incrowdapp.data.MatchRepository

class TeamStatsViewModelFactory(
    private val matchRepository: MatchRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val matchRepository = matchRepository
        return TeamStatsViewModel(matchRepository) as T
    }
}