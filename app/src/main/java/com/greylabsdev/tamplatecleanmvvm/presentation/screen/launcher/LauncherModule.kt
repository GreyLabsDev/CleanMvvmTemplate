package com.greylabsdev.tamplatecleanmvvm.presentation.screen.launcher

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val launcherModule = module {
    viewModel { LauncherViewModel() }
}