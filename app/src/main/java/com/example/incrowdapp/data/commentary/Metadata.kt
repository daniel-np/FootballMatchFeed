package com.example.incrowdapp.data.commentary

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Metadata {

    @SerializedName("createdAt")
    @Expose
    var createdAt: String? = null

}