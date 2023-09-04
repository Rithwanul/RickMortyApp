package com.example.rickmortyapp.base

import com.example.rickmortyapp.BuildConfig
import com.example.rickmortyapp.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber

class BaseApplication: DaggerApplication() {


    override fun applicationInjector():
            AndroidInjector<out DaggerApplication> = DaggerAppComponent.factory().create(this)

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}