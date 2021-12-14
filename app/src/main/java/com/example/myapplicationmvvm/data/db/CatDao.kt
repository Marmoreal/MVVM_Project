package com.example.myapplicationmvvm.data.db

import androidx.room.*
import com.example.myapplicationmvvm.data.entities.CatEntity

@Dao
interface CatDao {
    @Query("Select * from CatEntity")
    fun getAllCats(): List<CatEntity>

    @Query("Select * from CatEntity where id in (:catId)")
    fun getCat(catId: Int): CatEntity

    @Delete
    fun delete(vararg cat: CatEntity)

    @Insert
    fun insert(vararg cat: CatEntity)

    @Update
    fun update(vararg cat: CatEntity)
}