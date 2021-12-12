package com.example.myapplicationmvvm.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplicationmvvm.data.db.AnimalDB.Companion.VERSION
import com.example.myapplicationmvvm.data.entities.CatEntity
import com.example.myapplicationmvvm.data.entities.DogEntity

@Database(entities = arrayOf(CatEntity::class, DogEntity::class), version = VERSION)
abstract class AnimalDB : RoomDatabase() {
    abstract fun catsDao(): CatsDao
    abstract fun dogsDao(): DogsDao


    companion object{
        const val VERSION = 1
        const val DATABASE_NAME = "animal database"
    }
}