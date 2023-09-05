package com.example.rickmortyapp.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tbl_character")
data class Character (

    @PrimaryKey(autoGenerate = true)
    @field:SerializedName("characterId")
    val characterId: Long,

    @field:SerializedName("name")
    val name: String?

//    @field:SerializedName("info")
//    val
)