package com.example.matchcentreapp.ui.match_feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.matchcentreapp.data.CommentaryRepository
import com.example.matchcentreapp.data.MatchRepository

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