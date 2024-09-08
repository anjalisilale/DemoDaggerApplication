package com.example.dagger2application

import javax.inject.Inject

class MoviesBlockbuster @Inject constructor(): Movies {
    override fun findAll()=listOf(
    Movie("John Wick 4: Baba Yaga", 2023),
    Movie("KSI: In Real Life", 2023),
    Movie("Assassin", 2023),
    Movie("The Gray Man", 2022),
    Movie("The Whale", 2022),
    Movie("Hustle", 2022)
    )
}
