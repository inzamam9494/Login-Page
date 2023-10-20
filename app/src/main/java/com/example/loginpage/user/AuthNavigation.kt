package com.example.loginpage.user

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class AuthNavScreen {
    Login,
    Register,
}

@Composable
fun AuthNavigation(
    state: AuthState,
    onEvent: (AuthEvent) -> Unit,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = AuthNavScreen.Login.name
    ) {
        composable(AuthNavScreen.Login.name) {
            LoginPageScreen(
                state = state,
                onEvent = onEvent,
                onClickToRegister = { navController.navigate(AuthNavScreen.Register.name) },
                modifier = Modifier
            )
        }
        composable(AuthNavScreen.Register.name){
            RegistrationPageScreen(
                state = state,
                onEvent = onEvent,
                onClickToLogin = { navController.navigateUp() },
                modifier = Modifier
            )
        }
    }
}