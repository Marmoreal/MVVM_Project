package com.example.myapplicationmvvm.data.repositories

import com.example.myapplicationmvvm.data.db.DogDao
import com.example.myapplicationmvvm.data.entities.DogEntity
import com.example.myapplicationmvvm.domain.repositories.DogsRepository
import kotlinx.coroutines.flow.Flow

class DogsRepositoryImpl(private val dao: DogDao) : DogsRepository {

    override fun getAllDogs(): Flow<List<DogEntity>> {
        return dao.getAllDogs()
    }

    override fun getDog(dogId: Int): DogEntity {
        return dao.getDog(dogId)
    }

    override suspend fun insert(vararg dog: DogEntity) {
        dao.insert(*dog)
    }

    override suspend fun update(vararg dog: DogEntity) {
        dao.update(*dog)
    }

    override suspend fun delete(vararg dog: DogEntity) {
       dao.delete(*dog)
    }
}