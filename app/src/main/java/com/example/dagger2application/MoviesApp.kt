package com.example.dagger2application

import dagger.Component
import dagger.Module
import javax.inject.Singleton


@Singleton
@Component(modules = [MoviesModule::class])
interface MoviesApp {
    fun moviesList(): MoviesList
}