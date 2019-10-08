package com.example.matchcentreapp.data

import com.example.matchcentreapp.data.commentary.Commentary
import com.example.matchcentreapp.data.match.Match
import io.reactivex.Flowable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://feeds.incrowdsports.com/provider/opta/football/v1/matches/987597/"

interface ApiService {

    @GET("commentary")
    fun fetchCommentary(): Flowable<Commentary>

    @GET(".")
    fun fetchMatch(): Flowable<Match>

    companion object {

        operator fun invoke(): ApiService {

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
    }
}