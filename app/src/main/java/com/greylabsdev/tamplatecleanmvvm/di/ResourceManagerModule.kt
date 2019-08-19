package com.greylabsdev.tamplatecleanmvvm.di

import com.greylabsdev.tamplatecleanmvvm.common.ResourceManager
import org.koin.dsl.module

val resourceManagerModule = module {

    single { ResourceManager(get()) }

}