package com.mkao.JetpackComponents.Dialog

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DialogM3() {
    var operationOpenDialog by remember {
        mutableStateOf(false)}

    IconButton(
        onClick = { operationOpenDialog = true}) {
        Icon(
            imageVector = Icons.Outlined.Build,
            contentDescription = null
        )

    }
    if (operationOpenDialog){
        AlertDialog(
            onDismissRequest = { operationOpenDialog = false },
            title = {
                Text(text = "Run Kernels")
            },
            text = {
                Text(text = "Running the scripts in the kernels")
            },
            confirmButton = {
                TextButton(
                    onClick = { operationOpenDialog = false},
                    ) {
                    Text(text = "Yes")
              }
            },
            dismissButton = {
                TextButton(
                    onClick = { operationOpenDialog = false }) {
                    Text(text = "No")
                }
            }
        )
    }
}
@Preview
@Composable
fun AlerDialogPreview(){
    DialogM3()
}