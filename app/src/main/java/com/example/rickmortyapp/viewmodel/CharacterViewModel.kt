package com.example.rickmortyapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmortyapp.api.NetworkService
import com.google.gson.Gson
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class CharacterViewModel @Inject constructor(private val api: NetworkService, private val gson: Gson): ViewModel() {


//    private var _characters: MutableLiveData<CharacterResponse> = MutableLiveData()
//    val characters :LiveData<CharacterResponse> = _characters



    fun getAllCharacter() {
        viewModelScope.launch {
            val response = api.getAllCharactersByPage("1")
            if (response.isSuccessful) {
                Timber.tag("Data").d(gson.toJson(response.body()))
            }
        }
    }
}