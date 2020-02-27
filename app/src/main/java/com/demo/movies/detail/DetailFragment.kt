package com.demo.movies.detail


import android.app.WallpaperManager
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import java.lang.Exception
import android.graphics.drawable.BitmapDrawable
import android.widget.Toast
import com.demo.movies.databinding.FragmentDetailBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private lateinit var detailViewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater)

        val application = requireNotNull(activity).application
        val movie = DetailFragmentArgs.fromBundle(arguments!!).selectedMovie

        val viewModelFactory = DetailViewModelFactory(movie, application)
        detailViewModel = ViewModelProviders.of(this, viewModelFactory).get(DetailViewModel::class.java)

        binding.detailViewModel = detailViewModel
        binding.lifecycleOwner = this

        binding.moviePosterImageView.setOnClickListener {
            val wallpaperManager: WallpaperManager = WallpaperManager.getInstance(context)

            try {
                val bitMap = (binding.moviePosterImageView.getDrawable() as BitmapDrawable).bitmap
                wallpaperManager.setBitmap(bitMap)
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Log.d("Wallpaper Exception: ", "" + e.message)
                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}
