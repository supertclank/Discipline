package com.example.discipline.features.rewardSession

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RewardSession (viewModel: RewardSessionViewModel = viewModel()) {
    RewardSessionScreen(viewModel)
}