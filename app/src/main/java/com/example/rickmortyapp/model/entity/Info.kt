package com.example.rickmortyapp.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "tbl_info")
data class Info (

    @PrimaryKey(autoGenerate = true)
    @field:SerializedName("infoId")
    val infoId: Long,

    @field:SerializedName("characterId")
    val characterId: Long,

    @field:SerializedName("count")
    val count : Int? = null,
    @field:SerializedName("pages")
    val pages : Int? = null,
    @field:SerializedName("next")
    val next  : String? = null,
    @field:SerializedName("prev")
    val prev  : String? = null
)