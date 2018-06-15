package com.example.file_exhibits_loader

import android.content.Context
import com.example.model.Exhibit
import com.example.model.ExhibitsLoader
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ExhibitsLoaderImpl(private val context: Context) : ExhibitsLoader {

    override fun getExhibitList(): List<Exhibit> =
        Gson().fromJson(getJsonFromAssets(), object : TypeToken<ArrayList<Exhibit>>() {}.type)

    private fun getJsonFromAssets(): String = context.assets.open(context.getString(R.string.assets_path_to_data)).toString()
}