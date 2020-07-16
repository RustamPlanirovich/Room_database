package com.example.roomdatabase

import androidx.room.*

@Dao
interface CatDAO {

    @Insert
    fun add(add: Cat)

    @Insert
    fun insertAll(vararg cats: Cat)

    @Update
    fun update(cat: Cat)

    @Delete
    fun delete(cat: Cat)

    @Query("SELECT * FROM cats")
    fun getAllCat(): List<Cat>

    //@Query("SELECT * FROM cats")
    //fun getAllCats() : Flowable<List<Cat>>
    //fun getAllCatsRx() : Flowable<List<Cat>>
}