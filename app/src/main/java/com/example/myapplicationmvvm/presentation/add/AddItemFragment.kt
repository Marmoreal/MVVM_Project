package com.example.myapplicationmvvm.presentation.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.doOnTextChanged

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.myapplicationmvvm.R
import com.example.myapplicationmvvm.databinding.FragmentAddItemBinding

class AddItemFragment : Fragment() {

    private lateinit var binding: FragmentAddItemBinding

    private val viewModel: AddItemViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.catChecked -> {
                    binding.picture.isEnabled = true
                    viewModel.onTypeChanged(SelectedAnimalType.CAT)
                }
                R.id.dogChecked -> {
                    binding.picture.isEnabled = false
                    viewModel.onTypeChanged(SelectedAnimalType.DOG)
                }
            }

        }

        binding.firstName.doOnTextChanged { text, _, _, _ ->
            viewModel.onFirstNameChanged(text.toString())
        }
        binding.lastName.doOnTextChanged { text, _, _, _ ->
            viewModel.onLastNameChanged(text.toString())
        }
        binding.breed.doOnTextChanged { text, _, _, _ ->
            viewModel.onBreedChanged(text.toString())
        }
        binding.age.doOnTextChanged { text, _, _, _ ->
            viewModel.onAgeChanged(text.toString())
        }
        binding.picture.doOnTextChanged { text, _, _, _ ->
            viewModel.onImageUrlChanged(text.toString())
        }

        binding.createBtn.setOnClickListener{
            viewModel.onSavedClick()
            findNavController().navigate(R.id.action_addItemFragment_to_infoFragment)
        }
    }
}