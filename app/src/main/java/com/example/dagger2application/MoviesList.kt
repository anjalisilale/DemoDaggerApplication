package com.example.dagger2application

import javax.inject.Inject

class MoviesList @Inject constructor (private val movies: Movies)
{
    fun  findAll()=movies.findAll()
}