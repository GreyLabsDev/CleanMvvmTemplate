package com.greylabsdev.tamplatecleanmvvm.presentation.screen.main

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel { MainViewModel() }
}