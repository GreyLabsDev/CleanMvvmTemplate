package com.greylabsdev.tamplatecleanmvvm.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [], version = 1)
@TypeConverters(DbConverters::class)
abstract class AppDatabase() : RoomDatabase() {

}