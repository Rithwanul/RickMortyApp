package com.example.rickmortyapp.model.response

import com.google.gson.annotations.SerializedName

data class CharacterResponse (
    @SerializedName("info") var infoResponse: InfoResponse? = InfoResponse(),
    @SerializedName("results") var characterDetailResponses : ArrayList<CharacterDetailsResponse> = arrayListOf()
)