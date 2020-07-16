package com.example.roomdatabase

import android.app.Application
import androidx.room.Room

class MyApp : Application(){

    companion object{
        var datavase: CatDatavase? = null
    }

    override fun onCreate() {
        super.onCreate()
        MyApp.datavase = Room.databaseBuilder(this, CatDatavase::class.java, "mydatabase")
            .allowMainThreadQueries()
            .build()
    }
}