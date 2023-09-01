package com.example.rickmortyapp.di.module

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.rickmortyapp.di.key.FragmentKey
import com.example.rickmortyapp.navigation.CustomFragmentFactory
import com.example.rickmortyapp.ui.fragment.CharactersFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentBindingModule {
    @Binds
    @IntoMap
    @FragmentKey(CharactersFragment::class)
    abstract fun bindCharacterFragment(mainFragment: CharactersFragment): Fragment

    @Binds
    abstract fun bindFragmentFactory(factory: CustomFragmentFactory): FragmentFactory
}