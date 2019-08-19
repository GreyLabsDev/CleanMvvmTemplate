package com.greylabsdev.tamplatecleanmvvm.di

import com.greylabsdev.tamplatecleanmvvm.presentation.viewmodel.MainActivityViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { MainActivityViewModel() }

}