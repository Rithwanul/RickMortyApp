package com.example.rickmortyapp.model.entity

import androidx.room.Embedded
import androidx.room.Relation

data class CharacterDetailsWithOriginAndLocationAndEpisode (

    @Embedded val characterDetails: CharacterDetails,

    @Relation(
        parentColumn = "characterDetailsId",
        entityColumn = "characterDetailsId"
    )
    val origin: Origin,

    @Relation(
        parentColumn = "characterDetailsId",
        entityColumn = "characterDetailsId"
    )
    val characterLocation: Location,


    @Relation(
        parentColumn = "characterDetailsId",
        entityColumn = "characterDetailsId"
    )
    val episodes: List<Episode>


)