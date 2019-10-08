package com.example.matchcentreapp.data.match


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("createdAt")
    val createdAt: String?
)