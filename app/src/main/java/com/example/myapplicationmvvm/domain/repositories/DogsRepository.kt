package com.example.myapplicationmvvm.domain.repositories

import com.example.myapplicationmvvm.data.entities.DogEntity
import kotlinx.coroutines.flow.Flow

interface DogsRepository {

    fun getAllDogs(): Flow<List<DogEntity>>

    fun getDog(dogId: Int): DogEntity

    suspend fun insert(vararg dog: DogEntity)

    suspend fun update(vararg dog: DogEntity)

    suspend fun delete(vararg dog: DogEntity)
}