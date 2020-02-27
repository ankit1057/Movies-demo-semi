package com.demo.movies.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.demo.movies.network.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("selectedMovie")) {
      Movie selectedMovie;
      if (Parcelable.class.isAssignableFrom(Movie.class) || Serializable.class.isAssignableFrom(Movie.class)) {
        selectedMovie = (Movie) bundle.get("selectedMovie");
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (selectedMovie == null) {
        throw new IllegalArgumentException("Argument \"selectedMovie\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selectedMovie", selectedMovie);
    } else {
      throw new IllegalArgumentException("Required argument \"selectedMovie\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Movie getSelectedMovie() {
    return (Movie) arguments.get("selectedMovie");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("selectedMovie")) {
      Movie selectedMovie = (Movie) arguments.get("selectedMovie");
      if (Parcelable.class.isAssignableFrom(Movie.class) || selectedMovie == null) {
        __result.putParcelable("selectedMovie", Parcelable.class.cast(selectedMovie));
      } else if (Serializable.class.isAssignableFrom(Movie.class)) {
        __result.putSerializable("selectedMovie", Serializable.class.cast(selectedMovie));
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("selectedMovie") != that.arguments.containsKey("selectedMovie")) {
      return false;
    }
    if (getSelectedMovie() != null ? !getSelectedMovie().equals(that.getSelectedMovie()) : that.getSelectedMovie() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedMovie() != null ? getSelectedMovie().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "selectedMovie=" + getSelectedMovie()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Movie selectedMovie) {
      if (selectedMovie == null) {
        throw new IllegalArgumentException("Argument \"selectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedMovie", selectedMovie);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSelectedMovie(@NonNull Movie selectedMovie) {
      if (selectedMovie == null) {
        throw new IllegalArgumentException("Argument \"selectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedMovie", selectedMovie);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Movie getSelectedMovie() {
      return (Movie) arguments.get("selectedMovie");
    }
  }
}
