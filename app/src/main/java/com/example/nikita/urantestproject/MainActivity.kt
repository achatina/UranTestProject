package com.example.nikita.urantestproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.file_exhibits_loader.ExhibitsLoaderImpl
import com.example.nikita.urantestproject.adapter.ExhibitAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exhibit_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        exhibit_recycler.adapter = ExhibitAdapter(this, ExhibitsLoaderImpl(this).getExhibitList())

    }
}
