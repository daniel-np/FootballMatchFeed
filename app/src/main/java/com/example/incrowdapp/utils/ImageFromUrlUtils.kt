package com.example.incrowdapp.utils

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.HttpURLConnection
import java.net.URL

object ImageFromUrlUtils {

    fun fetchImage(urlString: String): Bitmap? {
        val url = URL(urlString)
        val urlConnection = url.openConnection() as HttpURLConnection
        lateinit var image: Bitmap
        try {
            image = BitmapFactory.decodeStream(urlConnection.inputStream)
        } finally {
            urlConnection.disconnect()
        }
        return image
    }
}