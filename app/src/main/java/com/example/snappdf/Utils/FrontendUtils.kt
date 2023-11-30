package com.example.snappdf.Utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import kotlinx.coroutines.withContext

fun ImageView.loadOnline(imageUrl: String){
    Glide.with(this.context)
        .load(imageUrl)
        .transition(withCrossFade())
        .thumbnail(0.5f)
        .into(this)
}