package com.greylabsdev.tamplatecleanmvvm.app

import android.app.Application
import com.greylabsdev.tamplatecleanmvvm.common.resourceManagerModule
import com.greylabsdev.tamplatecleanmvvm.data.datasource.dataSourceModule
import com.greylabsdev.tamplatecleanmvvm.data.db.databaseModule
import com.greylabsdev.tamplatecleanmvvm.data.network.retrofitModule
import com.greylabsdev.tamplatecleanmvvm.data.prefs.appPrefsModule
import com.greylabsdev.tamplatecleanmvvm.data.repository.repositoryModule
import com.greylabsdev.tamplatecleanmvvm.domain.usecase.useCaseModule
import com.greylabsdev.tamplatecleanmvvm.presentation.screen.launcher.launcherModule
import com.greylabsdev.tamplatecleanmvvm.presentation.screen.main.mainModule
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
                    launcherModule,
                    mainModule
                )
            )
        }
    }

}