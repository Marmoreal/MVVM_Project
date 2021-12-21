package com.example.myapplicationmvvm.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.myapplicationmvvm.R
import com.example.myapplicationmvvm.databinding.FragmentAnimalListBinding


class AnimalListFragment : Fragment() {

    private lateinit var binding: FragmentAnimalListBinding

    private val viewModel:AnimalListViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnimalListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addItem.setOnClickListener() {
            findNavController().navigate(R.id.action_animalListFragment_to_addItemFragment)
        }
    }
}