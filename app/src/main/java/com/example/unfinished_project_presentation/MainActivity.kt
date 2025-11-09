package com.example.unfinished_project_presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.unfinished_project_presentation.navigation.AppNavGraph
import com.example.unfinished_project_presentation.ui.theme.Unfinished_project_presentationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Unfinished_project_presentationTheme {
                AppNavGraph()
            }
        }
    }
}