package com.example.loginpage.user

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AuthViewModel : ViewModel(){
    private val _uiState = MutableStateFlow(AuthState())
    val uiState: StateFlow<AuthState> = _uiState.asStateFlow()

    fun onEvent(event: AuthEvent){
        when(event){
            is AuthEvent.Email -> _uiState.update { it.copy(email = event.email) }
            is AuthEvent.Password -> _uiState.update { it.copy(password = event.password) }
            is AuthEvent.Username -> _uiState.update { it.copy(userName = event.username) }
            is AuthEvent.ConfirmPassword -> _uiState.update { it.copy(confirmPassword = event.confirmPassword) }
        }
    }

}