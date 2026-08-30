package com.example.discipline.features.forgotPassword.states

sealed interface ForgotPasswordEffect {
    data object NavigateBack : ForgotPasswordEffect
    data object PasswordResetSent
}