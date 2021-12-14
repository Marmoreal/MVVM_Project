package com.example.myapplicationmvvm.data.repositories

import com.example.myapplicationmvvm.data.entities.DogEntity
import com.example.myapplicationmvvm.domain.repositories.DogsRepository

class DogsRepositoryImpl: DogsRepository {
    override suspend fun getAllDogs(): List<DogEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun getDog(): DogEntity {
        TODO("Not yet implemented")
    }

    override suspend fun insert(vararg dog: DogEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun update(vararg dog: DogEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(vararg dog: DogEntity) {
        TODO("Not yet implemented")
    }
}