package com.greylabsdev.tamplatecleanmvvm.di

import com.greylabsdev.tamplatecleanmvvm.data.prefs.AppPrefs
import org.koin.dsl.module

val appPrefsModule = module {
    single { AppPrefs(get()) }
}