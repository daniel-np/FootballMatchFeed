package com.example.incrowdapp.data.commentary

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Commentary {

    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("data")
    @Expose
    var data: Data? = null
    @SerializedName("metadata")
    @Expose
    var metadata: Metadata? = null

}
