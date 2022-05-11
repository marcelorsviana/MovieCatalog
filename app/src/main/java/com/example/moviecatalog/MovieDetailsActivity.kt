package com.example.moviecatalog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviecatalog.databinding.MovieDetailsBinding
import com.example.moviecatalog.model.Movies
import com.example.moviecatalog.model.mockMovies

class MovieDetailsActivity : AppCompatActivity() {

    private val binding by lazy {
        MovieDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Here it is received the data which came from MainActivity.
        // See goToMovieDetails function on MainActivity.
        val movieId = intent.getIntExtra("movieId", 0)

        val movieSelected =
            mockMovies().find { movies -> movies.id == movieId } // It Compares the id in Movies Class with the movieId which came from the MainActivity

        setData(movieSelected) // We put on the onCreate the function which will display the data from the selected Movie on the screen.
    }

    // Displaying the data from the selected Movie on the screen.
    private fun setData(movieSelected: Movies?) {
        // "let" will allow the code in the brackets to be run only if it is not null.
        movieSelected?.let { movies ->
            binding.titleDetails.text = movies.title
            binding.genreDetails.text = movies.genre_ids.toString() // LISTA!!!!!! TODO
            binding.plotDetails.text = movies.overview
            binding.rating.text = movies.vote_average.toString() // LISTA!!!! TODO

        }
    }
}