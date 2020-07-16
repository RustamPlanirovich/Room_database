package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cats")
data class Cat(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val name: String,

    @ColumnInfo(name = "age")
    val age: Int,

    val breed: String
)
