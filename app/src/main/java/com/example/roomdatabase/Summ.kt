package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "purcaches")
data class Summ(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val categoty: String,

    @ColumnInfo(name = "age")
    val summa: Int
)
