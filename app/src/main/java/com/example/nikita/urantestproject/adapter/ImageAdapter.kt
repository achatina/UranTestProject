package com.example.nikita.urantestproject.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.nikita.urantestproject.R
import com.example.nikita.urantestproject.adapter.viewHolder.ImageViewHolder

class ImageAdapter(private val context: Context, private val urls: List<String>): RecyclerView.Adapter<ImageViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
            ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.image_item, parent, false))

    override fun getItemCount(): Int = urls.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.setupImage(urls[position])
    }
}