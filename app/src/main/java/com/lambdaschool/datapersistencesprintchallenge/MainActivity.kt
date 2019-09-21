package com.lambdaschool.datapersistencesprintchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lambdaschool.datapersistencesprintchallenge.adapter.DisplayList
import com.lambdaschool.datapersistencesprintchallenge.retrofit.ListOfMoviesCallBack
import com.lambdaschool.datapersistencesprintchallenge.retrofit.ListOfMoviesCallBack.listOfMovies
import com.lambdaschool.datapersistencesprintchallenge.retrofit.MovieRetroFitObject
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fav.setOnClickListener {
            startActivity(Intent(this, FavoritesActivity::class.java))
        }



        MovieRetroFitObject.getListOfMovies("batman").enqueue(ListOfMoviesCallBack)

        rv_movies.layoutManager = LinearLayoutManager(this)
        rv_movies.adapter = DisplayList(ListOfMoviesCallBack.listOfMovies)
    }
}
