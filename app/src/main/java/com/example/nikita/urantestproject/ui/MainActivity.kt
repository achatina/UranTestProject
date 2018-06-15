package com.example.nikita.urantestproject.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.model.Exhibit
import com.example.nikita.urantestproject.R
import com.example.nikita.urantestproject.adapter.ExhibitAdapter
import com.example.nikita.urantestproject.presentation.presenter.MainActivityPresenter
import com.example.nikita.urantestproject.presentation.view.MainActivityView
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : MvpAppCompatActivity(), MainActivityView {

    @InjectPresenter
    lateinit var presenter: MainActivityPresenter

    @ProvidePresenter
    fun providePresenter(): MainActivityPresenter = inject<MainActivityPresenter>().value


    override fun setupAdapter(exhibits: List<Exhibit>) {
        exhibit_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        exhibit_recycler.adapter = ExhibitAdapter(this, exhibits)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.loadData()

    }
}
