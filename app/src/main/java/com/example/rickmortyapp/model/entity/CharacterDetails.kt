package com.example.rickmortyapp.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.rickmortyapp.model.response.LocationResponse
import com.example.rickmortyapp.model.response.OriginResponse
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tbl_character_details")
data class CharacterDetails (

    @PrimaryKey
    @field:SerializedName("id")
    val characterDetailsId: Int? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("species")
    val species: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("gender")
    val gender: String? = null,

//    @field:SerializedName("origin") val origin: Origin? = Origin(),
//    @field:SerializedName("location") val location: Location? = Location(),

    @field:SerializedName("image")
    val image: String? = null,

//    @field:SerializedName("episode")
//    val episode: ArrayList<Episode> = arrayListOf(),

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("created")
    val created: String? = null
)