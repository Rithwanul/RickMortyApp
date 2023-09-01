package com.example.rickmortyapp.di.module

import com.example.rickmortyapp.navigation.CustomNavHost
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class NavHostModule {

    @ContributesAndroidInjector(modules = [
        FragmentBindingModule::class
    ])
    abstract fun contributeNavHost(): CustomNavHost
}