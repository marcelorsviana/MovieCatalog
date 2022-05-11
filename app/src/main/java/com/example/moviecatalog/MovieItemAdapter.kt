package com.example.moviecatalog

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalog.databinding.MovieListItemBinding
import com.example.moviecatalog.model.Movies

class MovieItemAdapter:ListAdapter<Movies, MovieItemAdapter.MovieItemViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
        val binding = MovieListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MovieItemViewHolder(
        private val binding: MovieListItemBinding
        ): RecyclerView.ViewHolder(binding.root) {

            fun bind(movie: Movies) {
                binding.title.text = movie.title
                binding.genre.text = movie.genre_ids.toString() // VERIFICAR CONVERSÃO PARA LISTA
                binding.release.text = movie.release_date

                binding.root.setOnClickListener {
                    Log.i("CLICK", "CLICOU")
                }
            }

        }

        companion object {
            private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Movies>() {
                override fun areItemsTheSame(oldItem: Movies, newItem: Movies): Boolean {
                    return oldItem.id == newItem.id
                }

                override fun areContentsTheSame(oldItem: Movies, newItem: Movies): Boolean {
                    return oldItem == newItem
                }

            }
        }
}