package com.example.unfinished_project_presentation.semantics

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun LabeledIconsExercise() {
    Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(24.dp)) {
        // Bad example (leave as-is for comparison)
        IconButton(onClick = { /* no-op */ }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null // TODO(1): Provide a meaningful label via contentDescription or semantics
            )
        }

        // Goal: single announcement for the whole Row below
        Row(
            modifier = Modifier
                .semantics {
                    // TODO(2): Make the Row read as one element that says:
                    // "Search products, button"
                    // Hint: mergeDescendants? contentDescription?
                }
        ) {
            IconButton(onClick = { /* no-op */ }) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null // keep null if you set description on parent
                )
            }
            Text(
                "Products"
                // TODO(3): Ensure TalkBack does not read this separately if you merged above
            )
        }
    }
}