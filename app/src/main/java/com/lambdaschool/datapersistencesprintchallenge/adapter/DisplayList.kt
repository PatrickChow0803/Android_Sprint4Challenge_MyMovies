package com.lambdaschool.datapersistencesprintchallenge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.datapersistencesprintchallenge.R
import com.lambdaschool.sprint4challenge_mymovies.model.MovieOverview
import kotlinx.android.synthetic.main.movie_item.view.*

class DisplayList(val list: ArrayList<MovieOverview>): RecyclerView.Adapter<DisplayList.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentMovie = list[position]

        holder.movieTitle.text = currentMovie.title
        holder.movieRating.text = "Rating: ${currentMovie.vote_average}"

        holder.movieItem.setOnClickListener {
            Toast.makeText(it.context, "${currentMovie.title} has been added to your favorites", Toast.LENGTH_SHORT).show()
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val movieItem = view.cv_movie
        val movieTitle = view.tv_movie_title
        val movieRating = view.tv_movie_rating
    }

    override fun getItemCount(): Int = list.size
}