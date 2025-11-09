package com.example.unfinished_project_presentation.useranderror

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp

@Composable
fun AccessibleDialogExercise() {
    var show by remember { mutableStateOf(false) }

    Button(onClick = { show = true }, modifier = Modifier.padding(16.dp)) {
        Text("Open dialog")
    }

    if (show) {
        // TODO(1): Use AlertDialog.
        // TODO(2): Provide onDismissRequest to allow Back/outside tap dismiss.
        // TODO(3): Provide both confirm and dismiss actions with clear labels.
        // TODO(4): Ensure TalkBack can exit the dialog using the system Back.
    }
}

/* Acceptance:
 * - Dialog announces title and text.
 * - Back/outside tap dismiss works.
 * - Buttons are clearly labeled (OK / Cancel).
 */