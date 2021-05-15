package com.roysoft.dagger_hilt.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.roysoft.dagger_hilt.db.entities.UserEntity

@Dao
interface MyDao {

    @Query("Select * from tbl_user_master where id = :userid")
    suspend fun getUserDetail(userid: Int): List<UserEntity>

}