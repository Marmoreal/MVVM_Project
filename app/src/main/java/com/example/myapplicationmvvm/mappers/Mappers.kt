package com.example.myapplicationmvvm.mappers

import com.example.myapplicationmvvm.data.entities.CatEntity
import com.example.myapplicationmvvm.data.entities.DogEntity
import com.example.myapplicationmvvm.domain.entities.CatUI
import com.example.myapplicationmvvm.domain.entities.DogUI

fun CatUI.toDbModel() = CatEntity(
    id = 0,
    firstName = this.firstName,
    lastName = this.lastName,
    breed = this.breed,
    age = this.age,
    imageUrl = this.imageUrl
)

fun DogUI.toDbModel() = DogEntity(
    id = 0,
    firstName = this.firstName,
    lastName = this.lastName,
    breed = this.breed,
    age = this.age
)