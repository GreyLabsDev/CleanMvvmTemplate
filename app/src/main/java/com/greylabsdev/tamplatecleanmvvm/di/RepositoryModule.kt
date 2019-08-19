package com.greylabsdev.tamplatecleanmvvm.di

import com.greylabsdev.tamplatecleanmvvm.data.repository.RepositoryImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module


val repositoryModule = module {

    single { RepositoryImpl(get(named("local")), get(named("remote"))) }

}