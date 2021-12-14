package com.example.myapplicationmvvm.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
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
        binding = FragmentAnimalListBinding.inflate(inflater, container, true)
        return binding.root
    }


}