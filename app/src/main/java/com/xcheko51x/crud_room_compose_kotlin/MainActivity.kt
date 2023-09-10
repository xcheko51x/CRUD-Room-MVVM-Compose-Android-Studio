package com.xcheko51x.crud_room_compose_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.xcheko51x.crud_room_compose_kotlin.navigation.NavManager
import com.xcheko51x.crud_room_compose_kotlin.room.UsuariosDatabase
import com.xcheko51x.crud_room_compose_kotlin.ui.theme.CRUD_Room_Compose_KotlinTheme
import com.xcheko51x.crud_room_compose_kotlin.viewmodels.UsuariosViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CRUD_Room_Compose_KotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val database = Room.databaseBuilder(this, UsuariosDatabase::class.java, "db_usuarios").build()
                    val dao = database.usuariosDao()
                    
                    val viewModel = UsuariosViewModel(dao)
                    
                    NavManager(viewModel = viewModel)
                }
            }
        }
    }
}
