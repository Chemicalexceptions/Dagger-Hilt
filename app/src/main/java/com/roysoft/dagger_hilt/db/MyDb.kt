package com.roysoft.dagger_hilt.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.roysoft.dagger_hilt.db.entities.UserEntity

@Database(entities = arrayOf(UserEntity::class), version = 1, exportSchema = false)

@TypeConverters(Converters::class)

abstract class MyDb : RoomDatabase() {

    abstract fun getMyDao(): MyDao

}