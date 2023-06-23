package com.example.odv3

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout

class CenteredImageListItem(context: Context) : LinearLayout(context) {
    private val imageView: ImageView

    init {
        LayoutInflater.from(context).inflate(R.layout.list_item_image, this, true)
        imageView = findViewById(R.id.imageView)
    }

    fun setImage(resourceId: Int) {
        imageView.setImageResource(resourceId)
        // Görseli ortala
        imageView.scaleType = ImageView.ScaleType.CENTER_INSIDE
    }
}