package com.example.rickmortyapp.ui.activity

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.rickmortyapp.R
import com.example.rickmortyapp.dao.CharacterDAO
import com.example.rickmortyapp.databinding.ActivityMainBinding
import com.example.rickmortyapp.model.entity.Character
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var context: Context


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        Toast.makeText(context, "ok", Toast.LENGTH_LONG).show()


    }
}