package com.example.listmovies

import com.example.listmovies.`interface`.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){
    suspend fun getAllMovies() = retrofitService.getAllMovies()
}