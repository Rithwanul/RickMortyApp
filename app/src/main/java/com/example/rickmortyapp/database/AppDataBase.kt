package com.example.rickmortyapp.database

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.rickmortyapp.dao.CharacterDAO
import com.example.rickmortyapp.model.entity.Character;


@Database(
    entities = [
        Character::class
    ],
    version = AppDataBase.version,
    exportSchema = false
)
abstract class AppDataBase: RoomDatabase() {

    companion object {
        const val version: Int = 1

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
}