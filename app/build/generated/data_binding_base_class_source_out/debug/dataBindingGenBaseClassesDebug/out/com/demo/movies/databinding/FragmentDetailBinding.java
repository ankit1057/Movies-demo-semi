package com.demo.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.demo.movies.detail.DetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView moveiOverview;

  @NonNull
  public final TextView movieLanguage;

  @NonNull
  public final TextView movieName;

  @NonNull
  public final ImageView moviePosterImageView;

  @NonNull
  public final TextView movieVotes;

  @NonNull
  public final TextView releaseDate;

  @Bindable
  protected DetailViewModel mDetailViewModel;

  protected FragmentDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView moveiOverview, TextView movieLanguage, TextView movieName,
      ImageView moviePosterImageView, TextView movieVotes, TextView releaseDate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.moveiOverview = moveiOverview;
    this.movieLanguage = movieLanguage;
    this.movieName = movieName;
    this.moviePosterImageView = moviePosterImageView;
    this.movieVotes = movieVotes;
    this.releaseDate = releaseDate;
  }

  public abstract void setDetailViewModel(@Nullable DetailViewModel detailViewModel);

  @Nullable
  public DetailViewModel getDetailViewModel() {
    return mDetailViewModel;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailBinding>inflateInternal(inflater, com.demo.movies.R.layout.fragment_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailBinding>inflateInternal(inflater, com.demo.movies.R.layout.fragment_detail, null, false, component);
  }

  public static FragmentDetailBinding bind(@NonNull View view) {
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
  public static FragmentDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDetailBinding)bind(component, view, com.demo.movies.R.layout.fragment_detail);
  }
}
