package com.example.rickmortyapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickmortyapp.model.entity.*


@Dao
interface CharacterDetailsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(characterDetails: CharacterDetails)


    @Query("SELECT * from tbl_character_details")
    fun getCharacters(): List<CharacterDetailsWithOriginAndLocationAndEpisode>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacterCrossRef(characterDetailsEpisodeCrossRef: CharacterDetailsEpisodeCrossRef)
}