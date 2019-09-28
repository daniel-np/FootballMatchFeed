package com.example.incrowdapp.data.match


import com.google.gson.annotations.SerializedName

data class Match(
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("metadata")
    val metadata: Metadata?,
    @SerializedName("status")
    val status: String?
)