package com.example.discipline.features.forgotPassword

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Preview
@Composable
fun ForgotPassword(
    viewModel: ForgotPasswordViewModel = viewModel(),
) {
    ForgotPasswordScreen(viewModel)
}