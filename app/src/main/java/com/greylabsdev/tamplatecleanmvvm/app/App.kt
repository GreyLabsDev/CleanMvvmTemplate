package com.greylabsdev.tamplatecleanmvvm.app

import android.app.Application
import com.greylabsdev.tamplatecleanmvvm.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    appPrefsModule,
                    databaseModule,
                    dataSourceModule,
                    repositoryModule,
                    resourceManagerModule,
                    retrofitModule,
                    useCaseModule,
                    viewModelsModule
                )
            )
        }
    }

}