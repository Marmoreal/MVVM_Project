package com.example.myapplicationmvvm.domain.repositories

import com.example.myapplicationmvvm.data.entities.CatEntity
import kotlinx.coroutines.flow.Flow

interface CatsRepository {

    fun getAllCats(): Flow<List<CatEntity>>

    fun getCat(catId: Int): CatEntity

    suspend fun insert(vararg cat: CatEntity)

    suspend fun update(vararg cat: CatEntity)

    suspend fun delete(vararg cat: CatEntity)
}