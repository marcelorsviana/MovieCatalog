package com.example.moviecatalog

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalog.databinding.MovieListItemBinding
import com.example.moviecatalog.model.Movies

class MovieItemAdapter:ListAdapter<Movies, MovieItemAdapter.MovieItemViewHolder>(DIFF_CALLBACK) {

    var onClickListener: ((movieId: Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
        val binding = MovieListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieItemViewHolder(binding, onClickListener)
    }

    override fun onBindViewHolder(holder: MovieItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MovieItemViewHolder(
        private val binding: MovieListItemBinding,
        private val onClickListener: ((movieId: Int) -> Unit)?
        ): RecyclerView.ViewHolder(binding.root) {

            fun bind(movie: Movies) {
                binding.title.text = movie.title
                binding.genre.text = movie.genre_ids.toString() // VERIFICAR CONVERSÃO PARA LISTA TODO
                binding.release.text = movie.release_date
                binding.root.setOnClickListener { // NAVIGATION from MovieList to MovieListDetails
                    onClickListener?.invoke(movie.id)
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