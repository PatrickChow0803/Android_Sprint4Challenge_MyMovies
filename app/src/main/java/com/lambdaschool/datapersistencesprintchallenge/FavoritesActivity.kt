package com.lambdaschool.datapersistencesprintchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lambdaschool.datapersistencesprintchallenge.adapter.FavoriteMovieList
import com.lambdaschool.datapersistencesprintchallenge.retrofit.ListOfMoviesCallBack
import kotlinx.android.synthetic.main.activity_favorites.*

class FavoritesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)


        rv_favorite_movie.layoutManager = LinearLayoutManager(this)
        rv_favorite_movie.adapter = FavoriteMovieList(ListOfMoviesCallBack.favoriteListOfMovies)
    }
}
