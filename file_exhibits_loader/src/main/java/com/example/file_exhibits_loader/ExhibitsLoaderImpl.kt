package com.example.file_exhibits_loader

import android.content.Context
import com.example.model.Exhibit
import com.example.model.ExhibitContainer
import com.example.model.ExhibitsLoader
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.nio.charset.Charset

class ExhibitsLoaderImpl(private val context: Context) : ExhibitsLoader {

    override fun getExhibitList(): List<Exhibit> = Gson().fromJson(loadJSONFromAsset(), ExhibitContainer::class.java).list

    private fun loadJSONFromAsset(): String {
        var json = ""
        try {
            val inputStream = context.assets.open(context.getString(R.string.assets_path_to_data))
            val buffer = ByteArray(inputStream.available())
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.forName("UTF-8"))
        } catch (ex: IOException) {
            ex.printStackTrace()
            return json
        }

        return json
    }


}