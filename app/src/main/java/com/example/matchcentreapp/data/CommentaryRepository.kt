package com.example.matchcentreapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import com.example.matchcentreapp.data.commentary.Commentary
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CommentaryRepository(private val apiService: ApiService) {

    fun getCommentaryLiveData(): LiveData<Commentary> {

        return LiveDataReactiveStreams.fromPublisher(getCommentaryFromApi()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()))
    }

    private fun getCommentaryFromApi(): Flowable<Commentary> {
        return apiService.fetchCommentary()
    }

}