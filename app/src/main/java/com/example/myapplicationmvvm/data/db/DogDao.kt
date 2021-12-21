package com.example.myapplicationmvvm.data.db

import androidx.room.*
import com.example.myapplicationmvvm.data.entities.DogEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DogDao {
    @Query("Select * from DogEntity")
    fun getAllDogs(): Flow<List<DogEntity>>

    @Query("Select * from DogEntity where id in (:dogId)")
    fun getDog(dogId: Int): DogEntity

    @Delete
    fun delete(vararg dog: DogEntity)

    @Insert
    fun insert(vararg dog: DogEntity)

    @Update
    fun update(vararg dog: DogEntity)
}