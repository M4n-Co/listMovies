package com.example.listmovies.adapAndHolder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listmovies.DCListMovies.MovieItem
import com.example.listmovies.R

class MoviesAdapter ():RecyclerView.Adapter<MovieViewHolder>(){
    var movies = mutableListOf<MovieItem>()

    fun setItemsRv(list:List<MovieItem>){
        this.movies.clear()
        this.movies.addAll(list)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(layoutInflater.inflate(R.layout.item_movie,parent,false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = movies[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = movies.size


}