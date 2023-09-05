package com.example.rickmortyapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickmortyapp.model.entity.Character
import com.example.rickmortyapp.model.entity.CharacterDetails
import com.example.rickmortyapp.model.entity.CharacterDetailsWithOriginAndLocationAndEpisode
import com.example.rickmortyapp.model.entity.CharacterWithInfo


@Dao
interface CharacterDetailsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(characterDetails: CharacterDetails)


    @Query("SELECT * from tbl_character_details")
    fun getCharacters(): List<CharacterDetailsWithOriginAndLocationAndEpisode>
}