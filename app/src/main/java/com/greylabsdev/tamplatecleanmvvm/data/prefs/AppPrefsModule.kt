package com.greylabsdev.tamplatecleanmvvm.data.prefs

import com.greylabsdev.tamplatecleanmvvm.data.prefs.AppPrefs
import org.koin.dsl.module

val appPrefsModule = module {
    single { AppPrefs(get()) }
}