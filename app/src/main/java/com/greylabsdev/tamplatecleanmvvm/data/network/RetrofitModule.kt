package com.greylabsdev.tamplatecleanmvvm.data.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber

private const val API_ENDPOINT = ""

val retrofitModule = module {

    single {
        createApiService<Api>(
            get(),
            API_ENDPOINT
        )
    }

    factory { createLoggingInterceptor() }

    factory { createOkHttpClient(get()) }
}

fun createLoggingInterceptor(): HttpLoggingInterceptor {
    val logging = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message ->
        Timber.d(message)
    })
    logging.level = HttpLoggingInterceptor.Level.BODY
    return logging
}

fun createOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .retryOnConnectionFailure(false)
        .build()
}

inline fun <reified T> createApiService(okHttpClient: OkHttpClient, apiUrl: String): T {
    val retrofit = Retrofit.Builder()
        .baseUrl(apiUrl)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
    return retrofit.create(T::class.java)
}