package com.roysoft.dagger_hilt.db.entities

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_user_master")
data class UserEntity(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "phone")
    val pno: String ,
    @ColumnInfo(name = "profile_pic")
    val profilePic : Bitmap)