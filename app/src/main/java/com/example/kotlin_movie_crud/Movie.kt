package com.example.kotlin_movie_crud

import com.google.gson.annotations.SerializedName

data class Movie( val id: Int, val name: String )
data class MovieList (
    @SerializedName("movies" )
    val movies: List<Movie>
)
data class MovieEmbedded (
    @SerializedName("_embedded" )
    val list: MovieList
)