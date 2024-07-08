package com.example.client

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val clientModule = module {
    single { ClientRepository() }
    viewModel { ClientViewModel() }
}
