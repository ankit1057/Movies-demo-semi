package com.demo.movies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/demo/movies/network/MoviesApiService;", "", "getPopularMovies", "Lkotlinx/coroutines/Deferred;", "Lcom/demo/movies/network/MovieResponse;", "type", "", "apiKey", "app_debug"})
public abstract interface MoviesApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_type}")
    public abstract kotlinx.coroutines.Deferred<com.demo.movies.network.MovieResponse> getPopularMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_type", encoded = true)
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
}