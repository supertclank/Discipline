package com.example.discipline.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavBottomSheet(onNavigate: (String) -> Unit) {
    ModalBottomSheet(
        onDismissRequest = { onNavigate(Screen.Dashboard.route) },
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Navigate to:", style = MaterialTheme.typography.titleLarge)

            NavigationItem("Dashboard", Screen.Dashboard.route, onNavigate)
            NavigationItem("Work", Screen.WorkSession.route, onNavigate)
            NavigationItem("Reward", Screen.RewardSession.route, onNavigate)
            NavigationItem("Report", Screen.Report.route, onNavigate)
            NavigationItem("Settings", Screen.Settings.route, onNavigate)
        }
    }
}

@Composable
fun NavigationItem(label: String, route: String, onNavigate: (String) -> Unit) {
    Button(
        onClick = { onNavigate(route) },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(label)
    }
}