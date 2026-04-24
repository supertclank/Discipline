package com.example.discipline.features.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Preview(showBackground = true)
@Composable
fun Login(
    viewModel: LoginViewModel = viewModel(),
) {
    LoginScreen(viewModel)
}