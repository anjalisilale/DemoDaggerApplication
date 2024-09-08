package com.example.dagger2application


data class  Movie(val tittle:String,val year:Number)

interface  Movies{
    fun findAll():List<Movie>
}