package com.example.rickmortyapp.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.rickmortyapp.R
import com.example.rickmortyapp.databinding.FragmentCharactersBinding
import com.example.rickmortyapp.di.factory.ViewModelFactory
import com.example.rickmortyapp.model.entity.Car
import com.example.rickmortyapp.viewmodel.CharacterViewModel
import timber.log.Timber
import javax.inject.Inject


class CharactersFragment @Inject constructor(
    private val car: Car,
    private val factory: ViewModelProvider.Factory
) : Fragment() {



    private lateinit var binding: FragmentCharactersBinding

    lateinit var characterViewModel: CharacterViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate<FragmentCharactersBinding>(inflater, R.layout.fragment_characters,
            container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        characterViewModel = ViewModelProviders.of(this, factory)[CharacterViewModel::class.java]
        binding.name.text = car.name
//        Timber.tag("Data").e(car.name)

        characterViewModel.getAllCharacter();
        
//        characterViewModel.characters.observe(viewLifecycleOwner, Observer {
//            Timber.v(it.infoResponse?.pages.toString())
//        })
    }

}