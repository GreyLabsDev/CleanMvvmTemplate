package com.greylabsdev.tamplatecleanmvvm.domain.usecase

import org.koin.dsl.module

val useCaseModule = module {

    factory { SomeUseCase(get()) }

    factory { AnotherUseCase(get()) }

}