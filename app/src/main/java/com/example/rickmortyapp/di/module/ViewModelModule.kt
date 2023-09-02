package com.example.rickmortyapp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rickmortyapp.di.factory.ViewModelFactory
import com.example.rickmortyapp.di.key.ViewModelKey
import com.example.rickmortyapp.viewmodel.CharacterViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(CharacterViewModel::class)
    abstract fun bindThemeViewModel(viewModel: CharacterViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
