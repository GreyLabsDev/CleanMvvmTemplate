package com.greylabsdev.tamplatecleanmvvm.di

import android.content.Context
import androidx.room.Room
import com.greylabsdev.tamplatecleanmvvm.data.db.AppDatabase
import org.koin.dsl.module

private const val DB_NAME = "db_contacts"

val databaseModule = module {

    single { createDbInstance(get()) }

}

fun createDbInstance(context: Context): AppDatabase {

    return Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
        .fallbackToDestructiveMigration()
        .build()
}