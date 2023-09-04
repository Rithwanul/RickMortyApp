package com.example.rickmortyapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmortyapp.api.NetworkService
import com.example.rickmortyapp.dao.CharacterDAO
import com.example.rickmortyapp.model.entity.Character
import com.google.gson.Gson
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class CharacterViewModel @Inject constructor(
    private val api: NetworkService,
    private val gson: Gson
): ViewModel() {

    fun getAllCharacter() {
        viewModelScope.launch {
            val response = api.getAllCharactersByPage("1")
            if (response.isSuccessful) {
                Timber.tag("Data").d(gson.toJson(response.body()))
            }
        }
    }

    fun test() {

        val character: Character = Character(1, "Dico")


//        viewModelScope.launch {
//            db.getCharacterDAO().insert(character)
//            val characters = db.getCharacterDAO().getCharacters()
//            Timber.tag("Data").v(characters.toString())
//        }
    }
}