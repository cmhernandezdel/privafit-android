package com.privafit.app.data.entities

import androidx.room.*;

@Entity
data class Weight(
    @ColumnInfo(name = "weight") val weight: Double,
    @PrimaryKey val timestamp: Long
)