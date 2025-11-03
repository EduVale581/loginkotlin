package com.evalenzuela.loginkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.evalenzuela.loginkotlin.data.repository.AuthRepository
import com.evalenzuela.loginkotlin.navigation.AppNavGraph
import com.evalenzuela.loginkotlin.ui.theme.LoginkotlinTheme
import com.evalenzuela.loginkotlin.viewmodel.AuthViewModel
import com.evalenzuela.loginkotlin.viewmodel.AuthViewModelFactory
import com.google.firebase.auth.FirebaseAuth

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instanciamos Firebase y el repositorio
        val repository = AuthRepository(applicationContext)
        val authViewModel: AuthViewModel by viewModels {
            AuthViewModelFactory(repository)
        }

        // Verificamos si el usuario ya está logueado
        val currentUser = FirebaseAuth.getInstance().currentUser
        val isLoggedIn = currentUser != null



        // Dibujamos la app
        setContent {
            LoginkotlinTheme {
                AppNavGraph(
                    authViewModel = authViewModel,
                    isLoggedIn = isLoggedIn
                )
            }
        }
    }
}
