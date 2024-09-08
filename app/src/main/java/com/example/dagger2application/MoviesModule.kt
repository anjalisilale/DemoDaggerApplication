package com.example.dagger2application

import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module
interface MoviesModule {

    @Binds
    @Singleton
    fun bindmovie(moviesBlockbuster: MoviesBlockbuster) :Movies

}