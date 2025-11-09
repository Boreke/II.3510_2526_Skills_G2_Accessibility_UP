package com.example.unfinished_project_presentation.interactions

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TouchTargetAndContrastExercise() {
    Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {

        // Bad example (leave as-is for comparison)
        Text("Low contrast?", fontSize = 12.sp)
        Box(
            modifier = Modifier
                .size(24.dp) // too small to tap
                .background(Color.LightGray)
                .clickable { /* ... */ }
        )

        // TODOs below
        Text(
            "Fix me",
            // TODO(1): Use a text style with adequate contrast (theme-appropriate)
            // Hint: MaterialTheme.typography.bodyLarge
        )
        Box(
            modifier = Modifier
                // TODO(2): Ensure at least 48x48dp hit target
                // TODO(3): Keep visual size reasonable but hitbox large (sizeIn + padding)
                // TODO(4): Replace Color.LightGray with something that increases contrast
                .background(Color.LightGray) // replace
                .clickable { /* ... */ }
        ) {
            Text("Tap", modifier = Modifier.align(Alignment.Center))
        }
    }
}

/* Acceptance:
 * - Second box minimum tap area 48x48dp.
 * - Text uses a readable body style.
 * - Background/foreground pairing is clearly more legible than the bad example.
 */