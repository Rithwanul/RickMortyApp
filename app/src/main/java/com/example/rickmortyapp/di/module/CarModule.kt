package com.example.rickmortyapp.di.module

import com.example.rickmortyapp.model.entity.Car
import dagger.Module
import dagger.Provides

@Module
class CarModule {

    @Provides
    fun provideCar() = Car("Ferrari")
}