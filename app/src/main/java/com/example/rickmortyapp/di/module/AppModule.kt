package com.example.rickmortyapp.di.module

import android.app.Application
import com.example.rickmortyapp.base.BaseApplication
import dagger.Binds
import dagger.Module


@Module
abstract class AppModule {

    @Binds
    abstract fun bindApplication(app: BaseApplication): Application

//    @Provides
//    @Singleton
//    fun provideContext(baseApplication: BaseApplication): Context = baseApplication
}