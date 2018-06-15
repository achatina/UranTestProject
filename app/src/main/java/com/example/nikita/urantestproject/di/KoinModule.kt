package com.example.nikita.urantestproject.di

import com.example.file_exhibits_loader.ExhibitsLoaderImpl
import com.example.nikita.urantestproject.presentation.presenter.MainActivityPresenter
import org.koin.dsl.module.applicationContext

val module = applicationContext {
    bean { ExhibitsLoaderImpl(get()) }
    factory { MainActivityPresenter(get()) }
}