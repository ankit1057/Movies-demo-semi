package com.demo.movies;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.demo.movies.databinding.FragmentDetailBindingImpl;
import com.demo.movies.databinding.FragmentOverviewBindingImpl;
import com.demo.movies.databinding.MovieGridCellBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTDETAIL = 1;

  private static final int LAYOUT_FRAGMENTOVERVIEW = 2;

  private static final int LAYOUT_MOVIEGRIDCELL = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.movies.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.movies.R.layout.fragment_overview, LAYOUT_FRAGMENTOVERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.movies.R.layout.movie_grid_cell, LAYOUT_MOVIEGRIDCELL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTOVERVIEW: {
          if ("layout/fragment_overview_0".equals(tag)) {
            return new FragmentOverviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_overview is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIEGRIDCELL: {
          if ("layout/movie_grid_cell_0".equals(tag)) {
            return new MovieGridCellBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_grid_cell is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "movieData");
      sKeys.put(2, "detailViewModel");
      sKeys.put(3, "overviewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_detail_0", com.demo.movies.R.layout.fragment_detail);
      sKeys.put("layout/fragment_overview_0", com.demo.movies.R.layout.fragment_overview);
      sKeys.put("layout/movie_grid_cell_0", com.demo.movies.R.layout.movie_grid_cell);
    }
  }
}
