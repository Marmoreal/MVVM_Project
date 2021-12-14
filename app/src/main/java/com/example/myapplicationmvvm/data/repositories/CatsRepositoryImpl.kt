package com.example.myapplicationmvvm.data.repositories

import com.example.myapplicationmvvm.data.entities.CatEntity
import com.example.myapplicationmvvm.domain.repositories.CatsRepository

class CatsRepositoryImpl : CatsRepository {
    override suspend fun getAllCats(): List<CatEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun getCat(): CatEntity {
        TODO("Not yet implemented")
    }

    override suspend fun insert(vararg cat: CatEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun update(vararg cat: CatEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(vararg cat: CatEntity) {
        TODO("Not yet implemented")
    }
}