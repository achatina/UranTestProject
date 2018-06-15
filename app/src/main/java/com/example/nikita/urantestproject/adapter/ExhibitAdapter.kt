package com.example.nikita.urantestproject.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.model.Exhibit
import com.example.nikita.urantestproject.R
import com.example.nikita.urantestproject.adapter.viewHolder.ExhibitViewHolder

class ExhibitAdapter(private val context: Context, private val exhibits: List<Exhibit>) : RecyclerView.Adapter<ExhibitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExhibitViewHolder =
            ExhibitViewHolder(LayoutInflater.from(context).inflate(R.layout.exhibit_item, parent, false))

    override fun getItemCount(): Int = exhibits.size

    override fun onBindViewHolder(holder: ExhibitViewHolder, position: Int) {
        holder.setupView(exhibits[position], context)
    }

}