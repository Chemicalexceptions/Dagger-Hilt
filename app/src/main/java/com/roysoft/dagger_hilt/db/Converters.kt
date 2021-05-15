package com.roysoft.dagger_hilt.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream


class Converters {

    @TypeConverter
    fun ByteArraytoBitmap(byteArray: ByteArray): Bitmap {

        return BitmapFactory.decodeByteArray(
            byteArray, 0, byteArray.size
        )

    }


    @TypeConverter
    fun BitmapToByteArray(bitmap: Bitmap): ByteArray {

        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)
        return byteArrayOutputStream.toByteArray()

    }

}