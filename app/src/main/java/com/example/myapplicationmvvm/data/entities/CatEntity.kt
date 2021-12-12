package com.example.myapplicationmvvm.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CatEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo val firstName: String,
    @ColumnInfo val lastName: String,
    @ColumnInfo val breed: String,
    @ColumnInfo val age: Int,
    @ColumnInfo val imageUrl: String
)
