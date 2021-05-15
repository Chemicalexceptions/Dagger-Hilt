package com.roysoft.dagger_hilt.repositories

import com.roysoft.dagger_hilt.db.MyDao
import com.roysoft.dagger_hilt.db.MyDb
import javax.inject.Inject

class MainRepository @Inject constructor( val dao: MyDao) {

    suspend fun getUserDetail(userid :Int) = dao.getUserDetail(userid = userid)

}