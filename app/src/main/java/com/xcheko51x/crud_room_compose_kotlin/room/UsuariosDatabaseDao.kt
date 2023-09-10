package com.xcheko51x.crud_room_compose_kotlin.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.xcheko51x.crud_room_compose_kotlin.models.Usuarios
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuariosDatabaseDao {

    @Query("SELECT * FROM usuarios")
    fun obtenerUsuarios(): Flow<List<Usuarios>>

    @Query("SELECT * FROM usuarios WHERE id = :id")
    fun obtenerUsuario(id: Int): Flow<Usuarios>

    @Insert
    suspend fun agregarUsuario(usuario: Usuarios)

    @Update
    suspend fun actualizarUsuario(usuario: Usuarios)

    @Delete
    suspend fun borrarUsuario(usuario: Usuarios)

}