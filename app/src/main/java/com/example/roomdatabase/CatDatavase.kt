package com.example.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Cat::class, Summ::class), version = 1)
abstract class CatDatavase : RoomDatabase() {
    abstract fun getCatDAO(): CatDAO
    abstract fun getSummDAO(): SummDAO
}

