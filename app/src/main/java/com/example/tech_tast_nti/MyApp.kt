package com.example.tech_tast_nti


import android.app.Application
import com.example.client.clientModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.example.server.serverModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf( clientModule, serverModel))
        }
    }
}
