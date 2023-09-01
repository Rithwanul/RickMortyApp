package com.example.rickmortyapp.navigation

import android.content.Context
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CustomNavHost: NavHostFragment() {

    @Inject
    protected lateinit var factory: CustomFragmentFactory


    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        childFragmentManager.fragmentFactory = factory
        super.onCreate(savedInstanceState)
    }


}