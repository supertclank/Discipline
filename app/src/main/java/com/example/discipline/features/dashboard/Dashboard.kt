package com.example.discipline.features.dashboard

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Dashboard(
    viewModel: DashboardViewModel = viewModel()
) {
    DashboardScreen(viewModel)

}
