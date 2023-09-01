package com.example.rickmortyapp.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject
import javax.inject.Provider

class CustomFragmentFactory @Inject constructor(
    private val creators: Map<Class<out Fragment>, @JvmSuppressWildcards Provider<Fragment>>
): FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        val fragmentCLass = loadFragmentClass(classLoader, className)
        val creator = creators[fragmentCLass] ?: return createFragmentAsCallback(classLoader, className)

        try {
            return creator.get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    private fun createFragmentAsCallback(classLoader: ClassLoader, className: String): Fragment {
        return super.instantiate(classLoader, className)
    }
}