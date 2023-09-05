package com.example.rickmortyapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickmortyapp.model.entity.Origin

@Dao
interface OriginDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(origin: Origin)


    @Query("SELECT * from tbl_origin")
    fun getOrigin(): Origin
}