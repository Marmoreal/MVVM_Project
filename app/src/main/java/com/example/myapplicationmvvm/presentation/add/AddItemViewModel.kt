package com.example.myapplicationmvvm.presentation.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplicationmvvm.App
import com.example.myapplicationmvvm.data.repositories.CatsRepositoryImpl
import com.example.myapplicationmvvm.data.repositories.DogsRepositoryImpl
import com.example.myapplicationmvvm.domain.entities.CatUI
import com.example.myapplicationmvvm.domain.entities.DogUI
import com.example.myapplicationmvvm.mappers.toDbModel
import kotlinx.coroutines.launch

class AddItemViewModel : ViewModel() {

    private var selectedAnimalType: SelectedAnimalType = SelectedAnimalType.CAT

    private var baseAnimal = BaseAnimal()

    fun onTypeChanged(newType: SelectedAnimalType) {
        selectedAnimalType = newType
    }

    fun onFirstNameChanged(newString: String) {
        baseAnimal = baseAnimal.copy(firstName = newString)
    }

    fun onLastNameChanged(newString: String) {
        baseAnimal = baseAnimal.copy(lastName = newString)
    }

    fun onBreedChanged(newString: String) {
        baseAnimal = baseAnimal.copy(breed = newString)
    }

    fun onAgeChanged(newString: String) {
        baseAnimal = baseAnimal.copy(age = newString.toInt())
    }

    fun onImageUrlChanged(newString: String) {
        baseAnimal = baseAnimal.copy(imageUrl = newString)
    }
    //Fixme
    fun onSavedClick() {
        when (selectedAnimalType) {
            SelectedAnimalType.CAT -> {
                val cat = CatUI(
                    0,
                    baseAnimal.firstName,
                    baseAnimal.lastName,
                    baseAnimal.breed,
                    baseAnimal.age,
                    baseAnimal.imageUrl!!
                )

                viewModelScope.launch {
                    CatsRepositoryImpl(
                        App.instance.getDatabase().catDao()
                    ).insert(cat.toDbModel())
                }
            }
            SelectedAnimalType.DOG -> {
                val dog = DogUI(
                    0,
                    baseAnimal.firstName,
                    baseAnimal.lastName,
                    baseAnimal.breed,
                    baseAnimal.age
                )

                viewModelScope.launch {
                    DogsRepositoryImpl(
                        App.instance.getDatabase().dogDao()
                    ).insert(dog.toDbModel())
                }
            }
        }
    }
}