package com.example.rickmortyapp.di.component

import com.example.rickmortyapp.base.BaseApplication
import com.example.rickmortyapp.di.module.ActivityBuilderModule
import com.example.rickmortyapp.di.module.AppModule
import com.example.rickmortyapp.di.module.NavHostModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    AppModule::class
])
interface AppComponent: AndroidInjector<BaseApplication> {
    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<BaseApplication>() {
        abstract override fun build(): AppComponent
    }
}