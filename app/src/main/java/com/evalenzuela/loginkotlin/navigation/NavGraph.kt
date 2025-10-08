package com.evalenzuela.loginkotlin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.evalenzuela.loginkotlin.ui.screens.HomeScreen
import com.evalenzuela.loginkotlin.ui.screens.LoginScreen
import com.evalenzuela.loginkotlin.ui.screens.RegisterScreen
import com.evalenzuela.loginkotlin.ui.screens.SplashScreen
import com.evalenzuela.loginkotlin.viewmodel.AuthViewModel

@Composable
fun AppNavGraph(authViewModel: AuthViewModel, isLoggedIn: Boolean) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {

        composable("splash") {
            SplashScreen {
                // después de splash, decide:
                if (isLoggedIn) navController.navigate("home") { popUpTo("splash") { inclusive = true } }
                else navController.navigate("login") { popUpTo("splash") { inclusive = true } }
            }
        }
        composable("login") {
            LoginScreen(
                onLogin = { email, pass -> authViewModel.login(email, pass) },
                onNavigateToRegister = { navController.navigate("register") },
                onSuccess = {
                    navController.navigate("home") {
                        popUpTo("login") { inclusive = true }
                    }
                },
                authViewModel = authViewModel
            )
        }

        composable("register") {
            RegisterScreen(
                onRegister = { email, pass, name ->
                    authViewModel.register(email, pass, name)
                },
                onBack = { navController.popBackStack() },
                onSuccess = {
                    navController.navigate("home") {
                        popUpTo("register") { inclusive = true }
                    }
                },
                authViewModel = authViewModel
            )
        }

        composable("home") {
            HomeScreen(authViewModel = authViewModel, navHostControllerApp = navController)
        }
    }
}

