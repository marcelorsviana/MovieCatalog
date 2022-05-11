package com.example.moviecatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviecatalog.databinding.ActivityMainBinding
import com.example.moviecatalog.model.mockMovies

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root )

        val movieListAdapter = MovieItemAdapter()

        binding.movieListRecyclerView.adapter = movieListAdapter

        movieListAdapter.submitList(mockMovies())
    }
}