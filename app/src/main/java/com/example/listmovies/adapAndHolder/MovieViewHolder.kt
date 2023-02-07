package com.example.listmovies.adapAndHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.listmovies.DCListMovies.MovieItem
import com.example.listmovies.databinding.ItemMovieBinding
import com.squareup.picasso.Picasso

class MovieViewHolder(view: View):RecyclerView.ViewHolder(view) {
    private val binding = ItemMovieBinding.bind(view)
    fun bind(movie: MovieItem){
        val nombre = movie.nombre
        val cat = movie.categoria

        Picasso.get().load(movie.imagen).into(binding.civItem)
        binding.tvNombre.text = nombre
        binding.tvCat.text = cat
    }
}