package com.example.myapplicationmvvm.presentation.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplicationmvvm.domain.entities.CatUI

class AnimalListViewModel: ViewModel() {
    val animalListLiveData = MutableLiveData<CatUI>()
    init {

    }
}