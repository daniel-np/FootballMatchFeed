package com.example.incrowdapp.ui.match_feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.incrowdapp.data.ApiService
import com.example.incrowdapp.data.CommentaryRepository
import com.example.incrowdapp.data.MatchRepository

class MatchFeedViewModelFactory(
    private val commentaryRepository: CommentaryRepository,
    private val matchRepository: MatchRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val commentaryRepository = commentaryRepository
        val matchRepository = matchRepository
        return MatchFeedViewModel(commentaryRepository, matchRepository) as T
    }
}