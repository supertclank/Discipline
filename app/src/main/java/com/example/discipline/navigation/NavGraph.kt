package com.example.discipline.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.discipline.features.dashboard.DashboardScreen
import com.example.discipline.features.report.ReportScreen
import com.example.discipline.features.rewardSession.RewardSessionScreen
import com.example.discipline.features.settings.SettingsScreen
import com.example.discipline.features.workSession.WorkSessionScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {
        composable(Screen.Dashboard.route) {
            DashboardScreen()
        }

        composable(Screen.Report.route) {
            ReportScreen()
        }
        composable(Screen.RewardSession.route) {
            RewardSessionScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen()
        }
        composable(Screen.WorkSession.route) {
            WorkSessionScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen()
        }
    }
}