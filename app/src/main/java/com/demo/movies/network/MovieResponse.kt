package com.demo.movies.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    val page:Int,
    val results: List<Movie>
):Parcelable
