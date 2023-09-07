package com.example.rickmortyapp.di.module

import android.content.Context
import androidx.room.Room
import com.example.rickmortyapp.base.BaseApplication
import com.example.rickmortyapp.dao.*
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

    @Singleton
    @Provides
    fun getInfoDAO(appDataBase: AppDataBase): InfoDAO = appDataBase.getInfoDAO()

    @Singleton
    @Provides
    fun getLocationDAO(appDataBase: AppDataBase): LocationDAO = appDataBase.getLocationDAO()

    @Singleton
    @Provides
    fun getOriginDAO(appDataBase: AppDataBase): OriginDAO = appDataBase.getOriginDAO()

    @Singleton
    @Provides
    fun getEpisodeDAO(appDataBase: AppDataBase): EpisodeDAO = appDataBase.getEpisodeDAO()

    @Singleton
    @Provides
    fun getCharacterDetailsDAO(appDataBase: AppDataBase): CharacterDetailsDAO = appDataBase.getCharacterDetailsDAO()

//    @Singleton
//    @Provides
//    fun getCharacterDetailsEpisodeCrossRefDAO(appDataBase: AppDataBase): CharacterDetailsEpisodeCrossRefDAO
//    = appDataBase.getCharacterDetailsCrossRefDAO()

}