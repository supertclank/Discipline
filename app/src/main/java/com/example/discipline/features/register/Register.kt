package com.example.discipline.features.register

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Register(
    viewModel: RegisterViewModel = viewModel()
) {
    RegisterScreen(viewModel)
}