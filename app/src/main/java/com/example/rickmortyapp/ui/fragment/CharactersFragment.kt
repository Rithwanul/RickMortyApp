package com.example.rickmortyapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.rickmortyapp.R
import com.example.rickmortyapp.databinding.FragmentCharactersBinding
import com.example.rickmortyapp.model.entity.Car
import javax.inject.Inject


class CharactersFragment @Inject constructor(
    private val car: Car
) : Fragment() {

    private lateinit var binding: FragmentCharactersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate<FragmentCharactersBinding>(inflater, R.layout.fragment_characters, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.name.text = car.name
    }

}