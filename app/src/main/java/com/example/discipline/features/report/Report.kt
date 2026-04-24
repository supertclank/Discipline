package com.example.discipline.features.report

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Report (viewModel: ReportViewModel = viewModel()) {
    ReportScreen(viewModel)
}