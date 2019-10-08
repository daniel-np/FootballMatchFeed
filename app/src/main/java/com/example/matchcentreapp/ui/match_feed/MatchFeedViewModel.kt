package com.example.matchcentreapp.ui.match_feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.matchcentreapp.data.CommentaryRepository
import com.example.matchcentreapp.data.MatchRepository
import com.example.matchcentreapp.data.commentary.Commentary
import com.example.matchcentreapp.data.match.Match

class MatchFeedViewModel(private val commentaryRepository: CommentaryRepository, private val matchRepository: MatchRepository): ViewModel() {

    fun getCommentary():LiveData<Commentary> {
        return commentaryRepository.getCommentaryLiveData()
    }

    fun getMatch(): LiveData<Match> {
        return matchRepository.getMatchLiveData()
    }

}