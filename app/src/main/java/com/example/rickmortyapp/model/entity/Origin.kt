package com.example.rickmortyapp.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tbl_origin")
data class Origin (
    @PrimaryKey(autoGenerate = true) val originId: Long,
    @field:SerializedName("character_details_id") val characterDetailsId: Long,
    @field:SerializedName("name" ) val name : String? = null,
    @field:SerializedName("url"  ) val url  : String? = null
)