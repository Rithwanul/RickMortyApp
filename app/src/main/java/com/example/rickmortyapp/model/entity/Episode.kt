package com.example.rickmortyapp.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tbl_episode")
data class Episode(
    @PrimaryKey(autoGenerate = true)
    val episodeId: Long,
//    @field:SerializedName("character_details_id")
//    val characterDetailsId: Long,
    @field:SerializedName("name")
    val name: String
)
