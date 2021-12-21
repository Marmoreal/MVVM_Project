package com.example.myapplicationmvvm.data.repositories

import com.example.myapplicationmvvm.data.db.CatDao
import com.example.myapplicationmvvm.data.entities.CatEntity
import com.example.myapplicationmvvm.domain.repositories.CatsRepository
import kotlinx.coroutines.flow.Flow

class CatsRepositoryImpl(private val dao: CatDao) : CatsRepository {

    override fun getAllCats(): Flow<List<CatEntity>> {
        return dao.getAllCats()
    }

    override fun getCat(catId: Int): CatEntity {
        return dao.getCat(catId)
    }

    override suspend fun insert(vararg cat: CatEntity) {
        dao.insert(*cat)
    }

    override suspend fun update(vararg cat: CatEntity) {
        dao.update(*cat)
    }

    override suspend fun delete(vararg cat: CatEntity) {
        dao.delete(*cat)
    }
}