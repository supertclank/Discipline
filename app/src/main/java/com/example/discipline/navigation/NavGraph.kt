package com.example.discipline.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.discipline.features.dashboard.Dashboard
import com.example.discipline.features.report.Report
import com.example.discipline.features.rewardSession.RewardSession
import com.example.discipline.features.settings.Settings
import com.example.discipline.features.workSession.WorkSession

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {
        composable(Screen.Dashboard.route) {
            Dashboard()
        }

        composable(Screen.Report.route) {
            Report()
        }
        composable(Screen.RewardSession.route) {
            RewardSession()
        }
        composable(Screen.Settings.route) {
            Settings()
        }
        composable(Screen.WorkSession.route) {
            WorkSession()
        }
        composable(Screen.Settings.route) {
            Settings()
        }
    }
}