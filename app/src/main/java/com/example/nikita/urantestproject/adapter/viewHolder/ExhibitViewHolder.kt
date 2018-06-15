package com.example.nikita.urantestproject.adapter.viewHolder

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.model.Exhibit
import com.example.nikita.urantestproject.adapter.ExhibitAdapter
import com.example.nikita.urantestproject.adapter.ImageAdapter
import kotlinx.android.synthetic.main.exhibit_item.view.*

class ExhibitViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    fun setupView(exhibit: Exhibit, context: Context) {
        itemView.title.text = exhibit.title
        itemView.images_recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        itemView.images_recycler.adapter = ImageAdapter(context, exhibit.images)
    }

}