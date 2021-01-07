package com.privafit.app.data.daos

import androidx.room.*;
import com.privafit.app.data.entities.Weight

@Dao
interface WeightDao {
    @Query("SELECT * FROM weight")
    fun getAll() : List<Weight>

    @Query("SELECT * FROM weight WHERE timestamp = :timestamp")
    fun getByTimestamp(timestamp: Long): Weight

    @Insert
    fun insert(weight: Weight)

    @Delete
    fun delete(weight: Weight)
}