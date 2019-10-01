package com.example.incrowdapp.ui.team_stats

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.incrowdapp.data.MatchRepository
import com.example.incrowdapp.data.match.Match

class TeamStatsViewModel(private val matchRepository: MatchRepository): ViewModel() {

    fun getMatch(): LiveData<Match> {
        return matchRepository.getMatchLiveData()
    }

}