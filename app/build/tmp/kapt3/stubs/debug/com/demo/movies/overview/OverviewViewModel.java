package com.demo.movies.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0013J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/demo/movies/overview/OverviewViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_moviesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/demo/movies/network/Movie;", "_onNavigationToDetail", "moviesList", "Landroidx/lifecycle/LiveData;", "getMoviesList", "()Landroidx/lifecycle/LiveData;", "onNavigationToDetail", "getOnNavigationToDetail", "scope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "getMovies", "", "filter", "Lcom/demo/movies/network/MovieTypes;", "navigateToDisplay", "movie", "navigateToDisplayComplete", "onCleared", "updateSelectedMovieType", "app_debug"})
public final class OverviewViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.demo.movies.network.Movie>> _moviesList = null;
    private final androidx.lifecycle.MutableLiveData<com.demo.movies.network.Movie> _onNavigationToDetail = null;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.demo.movies.network.Movie>> getMoviesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.demo.movies.network.Movie> getOnNavigationToDetail() {
        return null;
    }
    
    private final void getMovies(com.demo.movies.network.MovieTypes filter) {
    }
    
    public final void navigateToDisplay(@org.jetbrains.annotations.NotNull()
    com.demo.movies.network.Movie movie) {
    }
    
    public final void navigateToDisplayComplete() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void updateSelectedMovieType(@org.jetbrains.annotations.NotNull()
    com.demo.movies.network.MovieTypes filter) {
    }
    
    public OverviewViewModel() {
        super();
    }
}