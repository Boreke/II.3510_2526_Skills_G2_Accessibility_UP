package com.example.unfinished_project_presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToSemantics: () -> Unit,
    onNavigateToUser: () -> Unit,
    onNavigateToInteraction: () -> Unit
    ) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Home", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(12.dp))
        Button(onClick = onNavigateToSemantics) {
            Text("Icon exercise")
        }
        Spacer(Modifier.height(12.dp))
        Button(onClick = onNavigateToUser) {
            Text("Accessible dialog exercise")
        }
        Spacer(Modifier.height(12.dp))
        Button(onClick = onNavigateToInteraction) {
            Text("Touch target & contrast exercise")
        }
    }
}