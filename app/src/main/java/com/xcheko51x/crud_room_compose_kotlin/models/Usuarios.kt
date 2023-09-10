package com.xcheko51x.crud_room_compose_kotlin.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuarios(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo("usuario")
    val usuario: String,
    @ColumnInfo("email")
    val email: String
)
