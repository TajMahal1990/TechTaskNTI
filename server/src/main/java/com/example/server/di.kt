package com.example.server

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val serverModel = module {
        single { ServerRepository() }
        viewModel { ServerViewModel() }
    }
