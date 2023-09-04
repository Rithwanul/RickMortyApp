package com.example.rickmortyapp.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tbl_character")
data class Character (

    @PrimaryKey(autoGenerate = true)
    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("name")
    val name: String?

//    @field:SerializedName("info")
//    val
)