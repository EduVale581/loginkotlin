package com.evalenzuela.loginkotlin.ui.screens

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import com.evalenzuela.loginkotlin.navigation.NavHome
import com.evalenzuela.loginkotlin.viewmodel.AuthViewModel

@Composable
fun HomeScreen(authViewModel: AuthViewModel, navHostControllerApp: NavHostController) {
    NavHome(authViewModel, navHostControllerApp)

}

