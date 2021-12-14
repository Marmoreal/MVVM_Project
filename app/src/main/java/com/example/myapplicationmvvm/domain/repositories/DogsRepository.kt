package com.example.myapplicationmvvm.domain.repositories

import com.example.myapplicationmvvm.data.entities.DogEntity

interface DogsRepository {

    suspend fun getAllDogs(): List<DogEntity>

    suspend fun getDog(): DogEntity

    suspend fun insert(vararg dog:DogEntity)

    suspend fun update(vararg dog:DogEntity)

    suspend fun delete(vararg dog:DogEntity)
}