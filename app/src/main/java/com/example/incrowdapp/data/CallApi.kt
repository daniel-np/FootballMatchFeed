package com.example.incrowdapp.data

import com.example.incrowdapp.data.commentary.Commentary
import com.example.incrowdapp.data.match.Match
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://feeds.incrowdsports.com/provider/opta/football/v1/matches/"

interface CallApi {

    @GET("987597/commentary")
    fun getCommentary(): Call<Commentary>

    @GET("987597")
    fun getMatch(): Call<Match>

    companion object {
        operator fun invoke(): CallApi {

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(CallApi::class.java)
        }
    }
}