package com.example.loginpage.user

sealed class AuthEvent {
    data class Username(val username: String) : AuthEvent()
    data class Email(val email: String) : AuthEvent()
    data class Password(val password: String) : AuthEvent()
    data class ConfirmPassword(val confirmPassword: String): AuthEvent()
}