package com.example.rickmortyapp.database

import android.content.Context
import androidx.room.*
import com.example.rickmortyapp.dao.*
import com.example.rickmortyapp.model.entity.*


@Database(
    entities = [
        Character::class,
        Info::class,
        CharacterDetails::class,
        Origin::class,
        Location::class,
        Episode::class
    ],
    version = AppDataBase.version,
    exportSchema = false
)
abstract class AppDataBase: RoomDatabase() {

    companion object {
        const val version: Int = 4

        private var INSTANCE: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, AppDataBase::class.java, "Database-DB")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE
        }

    }

    abstract fun getCharacterDAO(): CharacterDAO
    abstract fun getInfoDAO(): InfoDAO
    abstract fun getCharacterDetailsDAO(): CharacterDetailsDAO
    abstract fun getLocationDAO(): LocationDAO
    abstract fun getOriginDAO(): OriginDAO
    abstract fun getEpisodeDAO(): EpisodeDAO
}