package com.example.myapplicationmvvm

import android.app.Application
import androidx.room.Room
import com.example.myapplicationmvvm.data.db.AnimalDB

class App : Application() {

    private lateinit var animalDB: AnimalDB


    override fun onCreate() {
        super.onCreate()
        instance = this
        animalDB = Room.databaseBuilder(this, AnimalDB::class.java, AnimalDB.DATABASE_NAME).build()

    }

    fun getDatabase() = animalDB

    companion object{
        lateinit var instance: App
        private set
    }
}
