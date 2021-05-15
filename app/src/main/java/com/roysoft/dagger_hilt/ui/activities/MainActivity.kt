package com.roysoft.dagger_hilt.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.roysoft.dagger_hilt.R
import com.roysoft.dagger_hilt.db.MyDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dbDao: MyDao


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("RunDao", "RunDao : ${dbDao.hashCode()}")


    }
}