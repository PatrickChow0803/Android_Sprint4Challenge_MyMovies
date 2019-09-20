package com.lambdaschool.sprint4challenge_mymovies.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

data class MovieSearchResult(val results: List<MovieOverview>)

@Entity(tableName = "movieTable")
data class MovieOverview(
        val original_language: String,
        val original_title: String,
        val overview: String,
        val popularity: Float,
        val poster_path: String,
        val release_date: String,
        val title: String,
        val isVideo: Boolean,
        val vote_average: Float,
        val vote_count: Int,

        var favorited: Boolean = false,

        @PrimaryKey(autoGenerate = true)
        val id: Int
)