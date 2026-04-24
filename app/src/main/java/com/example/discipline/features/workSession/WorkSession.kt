package com.example.discipline.features.workSession

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WorkSession (viewModel: WorkSessionViewModel = viewModel()) {
    WorkSessionScreen(viewModel)
}