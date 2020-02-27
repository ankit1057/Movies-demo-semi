package com.demo.movies.overview;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.demo.movies.R;
import com.demo.movies.network.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class OverviewFragmentDirections {
  private OverviewFragmentDirections() {
  }

  @NonNull
  public static ActionOverviewFragmentToDetailFragment actionOverviewFragmentToDetailFragment(@NonNull Movie selectedMovie) {
    return new ActionOverviewFragmentToDetailFragment(selectedMovie);
  }

  public static class ActionOverviewFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionOverviewFragmentToDetailFragment(@NonNull Movie selectedMovie) {
      if (selectedMovie == null) {
        throw new IllegalArgumentException("Argument \"selectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedMovie", selectedMovie);
    }

    @NonNull
    public ActionOverviewFragmentToDetailFragment setSelectedMovie(@NonNull Movie selectedMovie) {
      if (selectedMovie == null) {
        throw new IllegalArgumentException("Argument \"selectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedMovie", selectedMovie);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_overviewFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Movie getSelectedMovie() {
      return (Movie) arguments.get("selectedMovie");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionOverviewFragmentToDetailFragment that = (ActionOverviewFragmentToDetailFragment) object;
      if (arguments.containsKey("selectedMovie") != that.arguments.containsKey("selectedMovie")) {
        return false;
      }
      if (getSelectedMovie() != null ? !getSelectedMovie().equals(that.getSelectedMovie()) : that.getSelectedMovie() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSelectedMovie() != null ? getSelectedMovie().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionOverviewFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "selectedMovie=" + getSelectedMovie()
          + "}";
    }
  }
}
