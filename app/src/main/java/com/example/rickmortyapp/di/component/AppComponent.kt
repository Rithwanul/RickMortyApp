package com.example.rickmortyapp.di.component

import android.content.Context
import com.example.rickmortyapp.base.BaseApplication
import com.example.rickmortyapp.database.AppDataBase
import com.example.rickmortyapp.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    AppModule::class
])
interface AppComponent: AndroidInjector<BaseApplication> {
//    @Component.Builder
//    abstract class Builder: AndroidInjector.Builder<BaseApplication>() {
//        abstract override fun build(): AppComponent
//    }


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}