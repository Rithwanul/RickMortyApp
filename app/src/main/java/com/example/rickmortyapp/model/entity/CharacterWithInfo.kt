package com.example.rickmortyapp.model.entity

import androidx.room.Embedded
import androidx.room.Relation
import com.example.rickmortyapp.model.entity.Character

data class CharacterWithInfo(
    @Embedded
    val character: Character,

    @Relation(
        parentColumn = "characterId",
        entityColumn = "characterId"
    )
    val info: Info
)