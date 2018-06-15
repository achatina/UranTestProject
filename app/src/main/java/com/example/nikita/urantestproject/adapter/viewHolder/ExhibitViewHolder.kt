package com.example.nikita.urantestproject.adapter.viewHolder

import android.content.Context
import android.os.Parcelable
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.model.Exhibit
import com.example.nikita.urantestproject.adapter.ImageAdapter
import kotlinx.android.synthetic.main.exhibit_item.view.*

class ExhibitViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    private val childRecyclerPosition = HashMap<Int, Parcelable>()

    fun setupView(exhibit: Exhibit, context: Context) {
        itemView.title.text = exhibit.title
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        itemView.images_recycler.layoutManager = layoutManager
        itemView.images_recycler.adapter = ImageAdapter(context, exhibit.images)
        restore(layoutManager)
    }

    fun save() {
        val layoutManager = itemView.images_recycler.layoutManager as LinearLayoutManager
        childRecyclerPosition[adapterPosition] = layoutManager.onSaveInstanceState()
    }

    private fun restore(layoutManager: LinearLayoutManager) {
        layoutManager.onRestoreInstanceState(childRecyclerPosition[adapterPosition])
    }

}