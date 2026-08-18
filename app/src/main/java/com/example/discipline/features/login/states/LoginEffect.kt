package com.example.discipline.features.login.states

sealed interface LoginEffect {
    data object NavigateToDashboard : LoginEffect
    data object NavigateToRegister : LoginEffect
    data object NavigateToForgotPassword : LoginEffect
}