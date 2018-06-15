package com.example.nikita.urantestproject.presentation.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.file_exhibits_loader.ExhibitsLoaderImpl
import com.example.model.Exhibit
import com.example.nikita.urantestproject.presentation.view.MainActivityView
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.withContext

@InjectViewState
class MainActivityPresenter(private val exhibitsLoader: ExhibitsLoaderImpl): MvpPresenter<MainActivityView>() {

    fun loadData() = launch(UI) {
        val exhibits = getDataFromExhibitsLoader()
        viewState.setupAdapter(exhibits)
    }

    private suspend fun getDataFromExhibitsLoader(): List<Exhibit> = withContext(CommonPool){
        exhibitsLoader.getExhibitList()
    }

}