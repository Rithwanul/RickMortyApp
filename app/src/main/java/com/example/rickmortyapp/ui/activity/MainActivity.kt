package com.example.rickmortyapp.ui.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.rickmortyapp.R
import com.example.rickmortyapp.databinding.ActivityMainBinding
import com.example.rickmortyapp.model.entity.Car
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var car: Car

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


//        binding.carName.text = car.name
    }
}