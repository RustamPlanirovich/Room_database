package com.example.roomdatabase

import androidx.room.*

@Dao
interface SummDAO {

    @Insert
    fun add(add: Summ)

    @Insert
    fun insertAll(vararg sums: Summ)

    @Update
    fun update(sum: Summ)

    @Delete
    fun delete(sum: Summ)

    @Query("SELECT * FROM purcaches")
    fun getAllSumm(): List<Summ>
}