package com.example.matchcentreapp.ui.team_stats

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.matchcentreapp.data.MatchRepository
import com.example.matchcentreapp.data.match.Match

class TeamStatsViewModel(private val matchRepository: MatchRepository): ViewModel() {

    fun getMatch(): LiveData<Match> {
        return matchRepository.getMatchLiveData()
    }

}