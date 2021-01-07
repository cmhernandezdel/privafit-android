package com.privafit.app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.privafit.app.data.daos.WeightDao
import com.privafit.app.data.entities.Weight

@Database(entities = [Weight::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun weightDao() : WeightDao
}