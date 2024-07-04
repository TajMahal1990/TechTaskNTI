package com.example.tech_tast_nti


import android.app.Application
import com.example.client.clientModule
import com.example.tech_tast_nti.server.serverModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

import com.example.tech_tast_nti.server.serverModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(clientModule, serverModule)
        }
    }
}
