package com.lambdaschool.datapersistencesprintchallenge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.datapersistencesprintchallenge.R
import com.lambdaschool.sprint4challenge_mymovies.model.MovieOverview
import kotlinx.android.synthetic.main.movie_item.view.*

class FavoriteMovieList(val list: ArrayList<MovieOverview>): RecyclerView.Adapter<FavoriteMovieList.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = list[position]

        holder.movieTitle.text = movie.title
        holder.movieRating.text = "Rating: ${movie.vote_average}"

        holder.movieItem.setOnLongClickListener {
            update(movie)
        }
    }



    override fun getItemCount(): Int = list.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val movieItem = view.cv_movie
        val movieTitle = view.tv_movie_title
        val movieRating = view.tv_movie_rating
    }

    fun update(movie: MovieOverview): Boolean{
        list.remove(movie)
        this.notifyDataSetChanged()
        return true
    }
}