package com.example.moviecatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.moviecatalog.databinding.MovieListBinding
import com.example.moviecatalog.model.mockMovies

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        MovieListBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root )

        val movieListAdapter = MovieItemAdapter()

        movieListAdapter.onClickListener = { movieId ->
            Toast.makeText(this, "Selected movie: $movieId", Toast.LENGTH_SHORT).show()
        }

        binding.movieListRecyclerView.adapter = movieListAdapter

        movieListAdapter.submitList(mockMovies())
    }
}