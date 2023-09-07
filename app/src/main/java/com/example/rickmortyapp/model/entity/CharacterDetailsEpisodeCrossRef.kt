package com.example.rickmortyapp.model.entity

import androidx.room.Entity


@Entity(primaryKeys = ["characterDetailsId", "episodeId"])
data class CharacterDetailsEpisodeCrossRef (
    val characterDetailsId: Int,
    val episodeId: Long
)