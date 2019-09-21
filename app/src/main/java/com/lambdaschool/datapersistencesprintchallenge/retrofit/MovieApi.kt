package com.lambdaschool.datapersistencesprintchallenge.retrofit

import com.lambdaschool.sprint4challenge_mymovies.model.MovieSearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {

    @GET("search/movie?")
    fun getListOfMovies(@Query("query") movieName: String, @Query("api_key") apikey: String = "359211348348a13a2b996217f7538f45"): Call<MovieSearchResult>

}