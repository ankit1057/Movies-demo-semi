package com.demo.movies.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/demo/movies/overview/OverviewAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/demo/movies/network/Movie;", "Lcom/demo/movies/overview/OverviewAdapter$MovieHolder;", "movieClickListener", "Lcom/demo/movies/overview/OverviewAdapter$MovieClickListener;", "(Lcom/demo/movies/overview/OverviewAdapter$MovieClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieClickListener", "MovieDiffCallBack", "MovieHolder", "app_debug"})
public final class OverviewAdapter extends androidx.recyclerview.widget.ListAdapter<com.demo.movies.network.Movie, com.demo.movies.overview.OverviewAdapter.MovieHolder> {
    private final com.demo.movies.overview.OverviewAdapter.MovieClickListener movieClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.movies.overview.OverviewAdapter.MovieHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.movies.overview.OverviewAdapter.MovieHolder holder, int position) {
    }
    
    public OverviewAdapter(@org.jetbrains.annotations.NotNull()
    com.demo.movies.overview.OverviewAdapter.MovieClickListener movieClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/demo/movies/overview/OverviewAdapter$MovieHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/demo/movies/databinding/MovieGridCellBinding;", "(Lcom/demo/movies/databinding/MovieGridCellBinding;)V", "bind", "", "movieItem", "Lcom/demo/movies/network/Movie;", "Companion", "app_debug"})
    public static final class MovieHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.demo.movies.databinding.MovieGridCellBinding binding = null;
        public static final com.demo.movies.overview.OverviewAdapter.MovieHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.demo.movies.network.Movie movieItem) {
        }
        
        public MovieHolder(@org.jetbrains.annotations.NotNull()
        com.demo.movies.databinding.MovieGridCellBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/demo/movies/overview/OverviewAdapter$MovieHolder$Companion;", "", "()V", "from", "Lcom/demo/movies/overview/OverviewAdapter$MovieHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.demo.movies.overview.OverviewAdapter.MovieHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/demo/movies/overview/OverviewAdapter$MovieDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/demo/movies/network/Movie;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class MovieDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.demo.movies.network.Movie> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.demo.movies.network.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.demo.movies.network.Movie newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.demo.movies.network.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.demo.movies.network.Movie newItem) {
            return false;
        }
        
        public MovieDiffCallBack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/demo/movies/overview/OverviewAdapter$MovieClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/demo/movies/network/Movie;", "Lkotlin/ParameterName;", "name", "movie", "", "(Lkotlin/jvm/functions/Function1;)V", "onClick", "selectedMovie", "app_debug"})
    public static final class MovieClickListener {
        private final kotlin.jvm.functions.Function1<com.demo.movies.network.Movie, kotlin.Unit> clickListener = null;
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.demo.movies.network.Movie selectedMovie) {
        }
        
        public MovieClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.demo.movies.network.Movie, kotlin.Unit> clickListener) {
            super();
        }
    }
}