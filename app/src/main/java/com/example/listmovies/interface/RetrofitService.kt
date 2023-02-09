package com.example.listmovies.`interface`

import com.example.listmovies.DCListMovies.MovieItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {
    @GET("movielist.json")
    suspend fun getAllMovies() : Response<List<MovieItem>>

    companion object{
        var retrofitService: RetrofitService? = null

        fun getInstance() : RetrofitService{

            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client  = OkHttpClient.Builder().addInterceptor(logging).build()

            if (retrofitService == null){
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://howtodoandroid.com/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(RetrofitService::class.java)
            }
            return retrofitService!!
        }
    }
}