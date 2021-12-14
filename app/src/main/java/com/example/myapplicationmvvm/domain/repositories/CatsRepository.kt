package com.example.myapplicationmvvm.domain.repositories

import com.example.myapplicationmvvm.data.entities.CatEntity

interface CatsRepository {

    suspend fun getAllCats(): List<CatEntity>

    suspend fun getCat(): CatEntity

    suspend fun insert(vararg cat: CatEntity)

    suspend fun update(vararg cat:CatEntity)

    suspend fun delete(vararg cat:CatEntity)
}