package com.example.incrowdapp.data.commentary

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CommentaryEntry {

    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("comment")
    @Expose
    var comment: String? = null
    @SerializedName("period")
    @Expose
    var period: Int? = null
    @SerializedName("time")
    @Expose
    var time: String? = null

}
