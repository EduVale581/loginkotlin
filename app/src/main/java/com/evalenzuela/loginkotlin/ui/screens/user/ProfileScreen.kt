package com.evalenzuela.loginkotlin.ui.screens.user

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.evalenzuela.loginkotlin.ui.theme.Black
import com.evalenzuela.loginkotlin.ui.theme.Gray
import com.evalenzuela.loginkotlin.ui.theme.Green
import com.evalenzuela.loginkotlin.ui.theme.White
import com.evalenzuela.loginkotlin.viewmodel.AuthState
import com.evalenzuela.loginkotlin.viewmodel.AuthViewModel

@Composable
fun ProfileScreen(authViewModel: AuthViewModel, navControllerApp: NavHostController) {
    val authState by authViewModel.authState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Perfil",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = White
        )



        Spacer(Modifier.height(32.dp))

        Button(
            onClick = {
                try {
                    authViewModel.logout()
                    navControllerApp.navigate("login") {
                        popUpTo("home") { inclusive = true }
                    }
                } catch (err: Exception) {

                }

            },
            colors = ButtonDefaults.buttonColors(containerColor = Green),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Cerrar sesión", color = White)
        }
    }
}
