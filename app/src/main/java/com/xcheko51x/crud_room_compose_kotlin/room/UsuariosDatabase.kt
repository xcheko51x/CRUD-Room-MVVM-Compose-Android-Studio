package com.xcheko51x.crud_room_compose_kotlin.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.xcheko51x.crud_room_compose_kotlin.models.Usuarios

@Database(
    entities = [Usuarios::class],
    version = 1,
    exportSchema = false
)
abstract class UsuariosDatabase: RoomDatabase() {
    abstract fun usuariosDao(): UsuariosDatabaseDao
}