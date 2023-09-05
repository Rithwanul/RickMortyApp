package com.example.rickmortyapp.di.module

import android.content.Context
import androidx.room.Room
import com.example.rickmortyapp.base.BaseApplication
import com.example.rickmortyapp.dao.CharacterDAO
import com.example.rickmortyapp.dao.InfoDAO
import com.example.rickmortyapp.database.AppDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DataBaseModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Context) : AppDataBase = AppDataBase.getDatabase(application)!!


    @Singleton
    @Provides
    fun provideCharacterDao(appDataBase: AppDataBase): CharacterDAO = appDataBase.getCharacterDAO()

    @Provides
    fun getInfoDAO(appDataBase: AppDataBase): InfoDAO = appDataBase.getInfoDAO()
}