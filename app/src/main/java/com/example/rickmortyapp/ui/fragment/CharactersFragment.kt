package com.example.rickmortyapp.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.rickmortyapp.R
import com.example.rickmortyapp.dao.*
import com.example.rickmortyapp.databinding.FragmentCharactersBinding
import com.example.rickmortyapp.model.entity.*
import com.example.rickmortyapp.viewmodel.CharacterViewModel
import com.google.gson.Gson
import timber.log.Timber
import javax.inject.Inject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CharactersFragment @Inject constructor(
    private val factory: ViewModelProvider.Factory,
    private val infoDAO: InfoDAO,
    private val characterDAO: CharacterDAO,
    private val characterDetailsDAO: CharacterDetailsDAO,
    private val originDAO: OriginDAO,
    private val locationDAO: LocationDAO,
    private val episodeDAO: EpisodeDAO,
    private val gson: Gson
//    private val characterDetailsEpisodeCrossRefDAO: CharacterDetailsEpisodeCrossRefDAO

) : Fragment() {

    private lateinit var binding: FragmentCharactersBinding

    private lateinit var characterViewModel: CharacterViewModel


    @Inject
    lateinit var app: Context


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate<FragmentCharactersBinding>(inflater, R.layout.fragment_characters,
            container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        characterViewModel = ViewModelProviders.of(this, factory)[CharacterViewModel::class.java]
        binding.name.text = "Ferrari"

        characterViewModel.getAllCharacter();
//        Timber.tag("Data").v(name)
//
//        Toast.makeText(app, name, Toast.LENGTH_LONG).show()

        val character: Character = Character(1, "Dico")

        val info: Info = Info(
            0, character.characterId,
            10, 1,
            "Hello", "Bye"
        )

        val origin: Origin = Origin(
            1,
            1,
            "Name",
            "https://www.google.com"
        )

        val location: Location = Location(
            1,
            1,
            "Name",
            "https://www.google.com"
        )

        val episode: Episode = Episode(
            1,
//            1,
            "https://www.google.com"
        )

        val episodeTwo: Episode = Episode(
            2,
//            1,
            "https://www.google.com"
        )

        val characterDetails: CharacterDetails = CharacterDetails(
            1,
            "name",
            "Alive",
            "Homo",
            "Human",
            "Male",
            "Jojo",
            "12-08-2020"
        )

        val characterDetailsEpisodeCrossRef = CharacterDetailsEpisodeCrossRef(
            1,
            1
        )

        val characterDetailsEpisodeCrossRefTwo = CharacterDetailsEpisodeCrossRef(
            1,
            2
        )

        val characterDetailsEpisodeCrossRefThree = CharacterDetailsEpisodeCrossRef(
            2,
            1
        )


        CoroutineScope(Dispatchers.IO).launch {
            characterDAO.insert(character)
            infoDAO.insert(info)
            characterDetailsDAO.insert(characterDetails)
            originDAO.insert(origin)
            locationDAO.insert(location)
            episodeDAO.insert(episode)
            episodeDAO.insert(episodeTwo)
            characterDetailsDAO.insertCharacterCrossRef(characterDetailsEpisodeCrossRef)
            characterDetailsDAO.insertCharacterCrossRef(characterDetailsEpisodeCrossRefTwo)
            characterDetailsDAO.insertCharacterCrossRef(characterDetailsEpisodeCrossRefThree)

            Timber.tag("Data").v(characterDAO.getCharacters().toString())
        }

        CoroutineScope(Dispatchers.IO).launch {
            Timber.tag("Data").v(gson.toJson(characterDetailsDAO.getCharacters()))
        }
    }

}