package com.demo.movies.databinding;
import com.demo.movies.R;
import com.demo.movies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOverviewBindingImpl extends FragmentOverviewBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOverviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentOverviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.movieRecycler.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.overviewModel == variableId) {
            setOverviewModel((com.demo.movies.overview.OverviewViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOverviewModel(@Nullable com.demo.movies.overview.OverviewViewModel OverviewModel) {
        this.mOverviewModel = OverviewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.overviewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOverviewModelMoviesList((androidx.lifecycle.LiveData<java.util.List<com.demo.movies.network.Movie>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOverviewModelMoviesList(androidx.lifecycle.LiveData<java.util.List<com.demo.movies.network.Movie>> OverviewModelMoviesList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.demo.movies.overview.OverviewViewModel overviewModel = mOverviewModel;
        java.util.List<com.demo.movies.network.Movie> overviewModelMoviesListGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.demo.movies.network.Movie>> overviewModelMoviesList = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (overviewModel != null) {
                    // read overviewModel.moviesList
                    overviewModelMoviesList = overviewModel.getMoviesList();
                }
                updateLiveDataRegistration(0, overviewModelMoviesList);


                if (overviewModelMoviesList != null) {
                    // read overviewModel.moviesList.getValue()
                    overviewModelMoviesListGetValue = overviewModelMoviesList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.demo.movies.BindingAdapterKt.recyclerBinder(this.movieRecycler, overviewModelMoviesListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): overviewModel.moviesList
        flag 1 (0x2L): overviewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}