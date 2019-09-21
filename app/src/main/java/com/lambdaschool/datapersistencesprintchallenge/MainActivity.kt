package com.lambdaschool.datapersistencesprintchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
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

        rv_movies.layoutManager = LinearLayoutManager(this)
        rv_movies.adapter = DisplayList(ListOfMoviesCallBack.listOfMovies)

        var test = listOfMovies

        search_bar.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(movieName: String?): Boolean {
                MovieRetroFitObject.getListOfMovies(movieName!!).enqueue(ListOfMoviesCallBack)
                rv_movies.adapter?.notifyDataSetChanged()
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                listOfMovies.clear()
                rv_movies.adapter?.notifyDataSetChanged()
                return true
            }
        })
    }
}
