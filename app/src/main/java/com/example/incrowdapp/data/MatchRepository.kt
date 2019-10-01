package com.example.incrowdapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import com.example.incrowdapp.data.match.Match
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class MatchRepository(private val apiService: ApiService) {

    fun getMatchLiveData(): LiveData<Match> {

        return LiveDataReactiveStreams.fromPublisher(getMatchFromApi()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()))
    }

    private fun getMatchFromApi(): Flowable<Match> {
        return apiService.fetchMatch()
    }
}