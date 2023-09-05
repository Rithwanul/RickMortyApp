package com.example.rickmortyapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickmortyapp.model.entity.Character
import com.example.rickmortyapp.model.entity.CharacterWithInfo

@Dao
interface CharacterDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: Character)


    @Query("SELECT * from tbl_character")
    fun getCharacters(): List<CharacterWithInfo>
}