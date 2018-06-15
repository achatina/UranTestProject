package com.example.nikita.urantestproject.adapter.viewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.image_item.view.*

class ImageViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    fun setupImage(url: String){
        Glide.with(itemView).load(url).into(itemView.image)
    }

}