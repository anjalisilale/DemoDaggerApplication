package com.example.dagger2application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val app = DaggerMoviesApp.builder().build()
        val movies = app.moviesList()

        movies.findAll().forEach { println(it) }
        //movies.findByYear(2023).forEach { println(it) }

    }
}