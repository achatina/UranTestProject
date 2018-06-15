package com.example.nikita.urantestproject.presentation.view

import com.arellomobile.mvp.MvpView
import com.example.model.Exhibit

interface MainActivityView: MvpView {

    fun setupAdapter(exhibits: List<Exhibit>)

}