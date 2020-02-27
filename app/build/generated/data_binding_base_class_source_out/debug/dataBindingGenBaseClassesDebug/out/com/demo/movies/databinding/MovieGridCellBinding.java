package com.demo.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.demo.movies.network.Movie;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MovieGridCellBinding extends ViewDataBinding {
  @NonNull
  public final ImageView gridImageCell;

  @Bindable
  protected Movie mMovieData;

  protected MovieGridCellBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView gridImageCell) {
    super(_bindingComponent, _root, _localFieldCount);
    this.gridImageCell = gridImageCell;
  }

  public abstract void setMovieData(@Nullable Movie movieData);

  @Nullable
  public Movie getMovieData() {
    return mMovieData;
  }

  @NonNull
  public static MovieGridCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_grid_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MovieGridCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MovieGridCellBinding>inflateInternal(inflater, com.demo.movies.R.layout.movie_grid_cell, root, attachToRoot, component);
  }

  @NonNull
  public static MovieGridCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_grid_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MovieGridCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MovieGridCellBinding>inflateInternal(inflater, com.demo.movies.R.layout.movie_grid_cell, null, false, component);
  }

  public static MovieGridCellBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MovieGridCellBinding bind(@NonNull View view, @Nullable Object component) {
    return (MovieGridCellBinding)bind(component, view, com.demo.movies.R.layout.movie_grid_cell);
  }
}
