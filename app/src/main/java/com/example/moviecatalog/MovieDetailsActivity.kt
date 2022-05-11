package com.example.moviecatalog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviecatalog.databinding.MovieDetailsBinding

class MovieDetailsActivity : AppCompatActivity() {

    private val binding by lazy {
        MovieDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
     }
}