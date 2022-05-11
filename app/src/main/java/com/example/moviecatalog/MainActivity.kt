package com.example.moviecatalog

import android.content.Intent
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
        setContentView(binding.root)

        val movieListAdapter = MovieItemAdapter()

        // NAVIGATION - It will call goToMovieDetails() in order to change the screen
        movieListAdapter.onClickListener = { movieId ->
            goToMovieDetails(movieId)
        }

        binding.movieListRecyclerView.adapter = movieListAdapter

        movieListAdapter.submitList(mockMovies())
    }

    // FUNCTION TO MAKE THE NAVIGATION TO MOVIE DETAILS SCREEN
    private fun goToMovieDetails(movieId: Int) {
        val intent = Intent(this, MovieDetailsActivity::class.java) // FROM MainActivity TO MovieDetailsActivity
        startActivity(intent)
    }
}