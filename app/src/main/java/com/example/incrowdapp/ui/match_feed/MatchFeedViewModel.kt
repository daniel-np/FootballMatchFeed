package com.example.incrowdapp.ui.match_feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.incrowdapp.data.CommentaryRepository
import com.example.incrowdapp.data.MatchRepository
import com.example.incrowdapp.data.commentary.Commentary
import com.example.incrowdapp.data.match.Match

class MatchFeedViewModel(private val commentaryRepository: CommentaryRepository, private val matchRepository: MatchRepository): ViewModel() {

    fun getCommentary():LiveData<Commentary> {
        return commentaryRepository.getCommentaryLiveData()
    }

    fun getMatch(): LiveData<Match> {
        return matchRepository.getMatchLiveData()
    }

}