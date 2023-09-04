package com.example.rickmortyapp.di.module

import com.example.rickmortyapp.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module()
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [
        CarModule::class,
        NavHostModule::class
    ])
    abstract fun contributeMainActivity(): MainActivity
}