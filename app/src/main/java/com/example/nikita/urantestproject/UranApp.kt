package com.example.nikita.urantestproject

import android.app.Application
import com.example.nikita.urantestproject.di.module
import org.koin.android.ext.android.startKoin

class UranApp: Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(module))
    }
}