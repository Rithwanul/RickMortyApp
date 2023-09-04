package com.example.rickmortyapp.di.module

import android.app.Application
import com.example.rickmortyapp.base.BaseApplication
import dagger.Binds
import dagger.Module


@Module(includes = [
    ViewModelModule::class,
    NetworkingModule::class,
    DataBaseModule::class
])
abstract class AppModule {
//    @Binds
//    abstract fun bindApplication(app: BaseApplication): Application
}