package com.example.rickmortyapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickmortyapp.model.entity.Info

@Dao
interface InfoDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(info: Info)

    @Query("SELECT * from tbl_info")
    suspend fun getInfo(): List<Info>
}