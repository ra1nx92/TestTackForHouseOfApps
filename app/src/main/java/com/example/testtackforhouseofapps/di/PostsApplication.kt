package com.example.testtackforhouseofapps.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PostsApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@PostsApplication)
        }
    }
}