package com.example.rickmortyapp.api

import com.example.rickmortyapp.model.response.CharacterResponse
import com.example.rickmortyapp.model.response.ResultsResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NetworkService {

    companion object {
        const val BASE_URL = "https://rickandmortyapi.com"
    }

    @GET("/api/character")
    suspend fun getAllCharactersByPage(@Query("page") page: String): Response<CharacterResponse>
}