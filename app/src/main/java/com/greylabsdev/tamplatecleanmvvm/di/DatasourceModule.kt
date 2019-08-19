package com.greylabsdev.tamplatecleanmvvm.di


import com.greylabsdev.tamplatecleanmvvm.data.datasource.local.LocalDataSource
import com.greylabsdev.tamplatecleanmvvm.data.datasource.remote.RemoteDataSource
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataSourceModule = module {

    single(named("local")) { LocalDataSource() }

    single(named("remote")) { RemoteDataSource() }

}