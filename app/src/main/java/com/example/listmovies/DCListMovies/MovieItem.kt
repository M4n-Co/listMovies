package com.example.listmovies.DCListMovies

import com.google.gson.annotations.SerializedName

data class MovieItem(
    @SerializedName("category") val categoria: String,
    @SerializedName("desc") val descrip: String,
    @SerializedName("imageUrl") val imagen: String,
    @SerializedName("name") val nombre: String
)