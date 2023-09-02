package com.example.rickmortyapp.model.response

import com.google.gson.annotations.SerializedName

data class ResultsResponse (
    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("species") var species: String? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("gender") var gender: String? = null,
    @SerializedName("origin") var origin: OriginResponse? = OriginResponse(),
    @SerializedName("location") var location: LocationResponse? = LocationResponse(),
    @SerializedName("image") var image: String? = null,
    @SerializedName("episode") var episode: ArrayList<String> = arrayListOf(),
    @SerializedName("url") var url: String? = null,
    @SerializedName("created") var created: String? = null
)