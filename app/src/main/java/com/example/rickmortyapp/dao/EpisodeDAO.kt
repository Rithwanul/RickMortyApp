package com.example.rickmortyapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.rickmortyapp.model.entity.Episode

@Dao
interface EpisodeDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(episode: Episode)

}