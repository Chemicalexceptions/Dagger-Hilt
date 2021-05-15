package com.roysoft.dagger_hilt.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.roysoft.dagger_hilt.db.MyDb
import com.roysoft.dagger_hilt.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getMyDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, MyDb::class.java, Constants.ROOM_DB_NAME)
            .build()

    @Singleton
    @Provides
    fun getMyDao(db: MyDb) = db.getMyDao()

}