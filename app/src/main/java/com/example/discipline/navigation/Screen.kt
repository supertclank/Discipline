package com.example.discipline.navigation

sealed class Screen(val route: String) {
    object Dashboard : Screen("dashboard")
    object Report : Screen("report")
    object WorkSession : Screen("workSession")
    object RewardSession : Screen("rewardSession")
    object Settings : Screen("settings")
    object ForgotPassword : Screen("forgotPassword")
    object Register : Screen("register")
    object Login : Screen("login")
}