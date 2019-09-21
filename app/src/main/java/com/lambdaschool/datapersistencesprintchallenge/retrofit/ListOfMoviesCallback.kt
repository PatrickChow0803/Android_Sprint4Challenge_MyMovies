package com.lambdaschool.datapersistencesprintchallenge.retrofit

import android.util.Log
import com.lambdaschool.sprint4challenge_mymovies.model.MovieOverview
import com.lambdaschool.sprint4challenge_mymovies.model.MovieSearchResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ListOfMoviesCallBack : Callback<MovieSearchResult> {

    val listOfMovies = ArrayList<MovieOverview>()
    val favoriteListOfMovies = ArrayList<MovieOverview>()

    override fun onResponse(call: Call<MovieSearchResult>, response: Response<MovieSearchResult>) {
        if (response.isSuccessful){
            response.body()?.results?.forEach {
                listOfMovies.add(it)
            }
        } else {
            println(response)
        }
    }

    override fun onFailure(call: Call<MovieSearchResult>, t: Throwable) {
        Log.i(t.localizedMessage, "Failure")
    }
}