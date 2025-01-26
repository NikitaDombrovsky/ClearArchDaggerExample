package com.example.smallnote.app

import android.app.Application
import com.example.smallnote.di.AppComponent
import com.example.smallnote.di.AppModule
import com.example.smallnote.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(context = this))
            .build()
    }
}
