package com.lambdaschool.datapersistencesprintchallenge.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.lambdaschool.sprint4challenge_mymovies.model.MovieOverview


@Dao
interface MovieDAO{

    @Query(value = "SELECT * FROM movieTable WHERE id = :id")
    fun getMovieById(id:Long): LiveData<MovieOverview>

    @Query(value = "SELECT * FROM movieTable WHERE favorited = 1")
    fun getFavMovies(): LiveData<List<MovieOverview>>

    @Query("SELECT * FROM movieTable")
    fun getAllMovies(): LiveData<List<MovieOverview>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg movie: MovieOverview)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(movie: MovieOverview)

    @Delete
    fun delete(movie: MovieOverview)
}