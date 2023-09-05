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
import com.example.rickmortyapp.dao.CharacterDAO
import com.example.rickmortyapp.dao.InfoDAO
import com.example.rickmortyapp.databinding.FragmentCharactersBinding
import com.example.rickmortyapp.viewmodel.CharacterViewModel
import timber.log.Timber
import javax.inject.Inject
import com.example.rickmortyapp.model.entity.Character
import com.example.rickmortyapp.model.entity.Info
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CharactersFragment @Inject constructor(
    private val factory: ViewModelProvider.Factory,
    private val infoDAO: InfoDAO
) : Fragment() {

    private lateinit var binding: FragmentCharactersBinding

    private lateinit var characterViewModel: CharacterViewModel

//    @Inject
//    lateinit var name: String

    @Inject
    lateinit var characterDAO: CharacterDAO

//    @Inject
//    lateinit var infoDAO: InfoDAO


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
            1, character.characterId,
            10, 1,
            "Hello", "Bye"
        )


        CoroutineScope(Dispatchers.IO).launch {
            characterDAO.insert(character)
            infoDAO.insert(info)

            Timber.tag("Data").v(characterDAO.getCharacters().toString())
        }
    }

}