package com.example.discipline.features.settings

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Settings (viewModel: SettingsViewModel = viewModel()) {
    SettingsScreen(viewModel)
}