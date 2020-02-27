package com.demo.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007\u00a8\u0006\n"}, d2 = {"imageBinder", "", "Landroid/widget/ImageView;", "imageUrl", "", "recyclerBinder", "Landroidx/recyclerview/widget/RecyclerView;", "movie", "", "Lcom/demo/movies/network/Movie;", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"movieRecycler"})
    public static final void recyclerBinder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$recyclerBinder, @org.jetbrains.annotations.Nullable()
    java.util.List<com.demo.movies.network.Movie> movie) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageBinding"})
    public static final void imageBinder(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$imageBinder, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
}