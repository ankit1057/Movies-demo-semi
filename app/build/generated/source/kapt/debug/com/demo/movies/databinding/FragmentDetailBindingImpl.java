package com.demo.movies.databinding;
import com.demo.movies.R;
import com.demo.movies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.moveiOverview.setTag(null);
        this.movieLanguage.setTag(null);
        this.movieName.setTag(null);
        this.moviePosterImageView.setTag(null);
        this.movieVotes.setTag(null);
        this.releaseDate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.detailViewModel == variableId) {
            setDetailViewModel((com.demo.movies.detail.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetailViewModel(@Nullable com.demo.movies.detail.DetailViewModel DetailViewModel) {
        this.mDetailViewModel = DetailViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.detailViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDetailViewModelMovieTitle((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDetailViewModelMovieReleaseDate((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDetailViewModelSelectedMovie((androidx.lifecycle.LiveData<com.demo.movies.network.Movie>) object, fieldId);
            case 3 :
                return onChangeDetailViewModelMovieLanguage((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeDetailViewModelMovieOverview((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeDetailViewModelMovieRating((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDetailViewModelMovieTitle(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelMovieTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelMovieReleaseDate(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelMovieReleaseDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelSelectedMovie(androidx.lifecycle.LiveData<com.demo.movies.network.Movie> DetailViewModelSelectedMovie, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelMovieLanguage(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelMovieLanguage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelMovieOverview(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelMovieOverview, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelMovieRating(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelMovieRating, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelMovieTitle = null;
        java.lang.String detailViewModelMovieRatingGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelMovieReleaseDate = null;
        androidx.lifecycle.LiveData<com.demo.movies.network.Movie> detailViewModelSelectedMovie = null;
        java.lang.String detailViewModelSelectedMoviePosterPath = null;
        java.lang.String detailViewModelMovieOverviewGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelMovieLanguage = null;
        java.lang.String detailViewModelMovieLanguageGetValue = null;
        java.lang.String detailViewModelMovieReleaseDateGetValue = null;
        java.lang.String detailViewModelMovieTitleGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelMovieOverview = null;
        com.demo.movies.detail.DetailViewModel detailViewModel = mDetailViewModel;
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelMovieRating = null;
        com.demo.movies.network.Movie detailViewModelSelectedMovieGetValue = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.movieTitle
                        detailViewModelMovieTitle = detailViewModel.getMovieTitle();
                    }
                    updateLiveDataRegistration(0, detailViewModelMovieTitle);


                    if (detailViewModelMovieTitle != null) {
                        // read detailViewModel.movieTitle.getValue()
                        detailViewModelMovieTitleGetValue = detailViewModelMovieTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.movieReleaseDate
                        detailViewModelMovieReleaseDate = detailViewModel.getMovieReleaseDate();
                    }
                    updateLiveDataRegistration(1, detailViewModelMovieReleaseDate);


                    if (detailViewModelMovieReleaseDate != null) {
                        // read detailViewModel.movieReleaseDate.getValue()
                        detailViewModelMovieReleaseDateGetValue = detailViewModelMovieReleaseDate.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.selectedMovie
                        detailViewModelSelectedMovie = detailViewModel.getSelectedMovie();
                    }
                    updateLiveDataRegistration(2, detailViewModelSelectedMovie);


                    if (detailViewModelSelectedMovie != null) {
                        // read detailViewModel.selectedMovie.getValue()
                        detailViewModelSelectedMovieGetValue = detailViewModelSelectedMovie.getValue();
                    }


                    if (detailViewModelSelectedMovieGetValue != null) {
                        // read detailViewModel.selectedMovie.getValue().posterPath
                        detailViewModelSelectedMoviePosterPath = detailViewModelSelectedMovieGetValue.getPosterPath();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.movieLanguage
                        detailViewModelMovieLanguage = detailViewModel.getMovieLanguage();
                    }
                    updateLiveDataRegistration(3, detailViewModelMovieLanguage);


                    if (detailViewModelMovieLanguage != null) {
                        // read detailViewModel.movieLanguage.getValue()
                        detailViewModelMovieLanguageGetValue = detailViewModelMovieLanguage.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.movieOverview
                        detailViewModelMovieOverview = detailViewModel.getMovieOverview();
                    }
                    updateLiveDataRegistration(4, detailViewModelMovieOverview);


                    if (detailViewModelMovieOverview != null) {
                        // read detailViewModel.movieOverview.getValue()
                        detailViewModelMovieOverviewGetValue = detailViewModelMovieOverview.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.movieRating
                        detailViewModelMovieRating = detailViewModel.getMovieRating();
                    }
                    updateLiveDataRegistration(5, detailViewModelMovieRating);


                    if (detailViewModelMovieRating != null) {
                        // read detailViewModel.movieRating.getValue()
                        detailViewModelMovieRatingGetValue = detailViewModelMovieRating.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.moveiOverview, detailViewModelMovieOverviewGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieLanguage, detailViewModelMovieLanguageGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieName, detailViewModelMovieTitleGetValue);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            com.demo.movies.BindingAdapterKt.imageBinder(this.moviePosterImageView, detailViewModelSelectedMoviePosterPath);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieVotes, detailViewModelMovieRatingGetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.releaseDate, detailViewModelMovieReleaseDateGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): detailViewModel.movieTitle
        flag 1 (0x2L): detailViewModel.movieReleaseDate
        flag 2 (0x3L): detailViewModel.selectedMovie
        flag 3 (0x4L): detailViewModel.movieLanguage
        flag 4 (0x5L): detailViewModel.movieOverview
        flag 5 (0x6L): detailViewModel.movieRating
        flag 6 (0x7L): detailViewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}