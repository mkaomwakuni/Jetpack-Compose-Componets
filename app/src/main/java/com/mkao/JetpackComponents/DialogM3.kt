package com.mkao.JetpackComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

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

@Composable
fun DialogM3Custom() {
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
        Dialog(
            onDismissRequest = { operationOpenDialog = false }) {
            Surface {
                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text(
                        text = "Congratulations",
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Text(
                        text = "You won the competitions",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "View Results"
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CustomDialog(){
    DialogM3Custom()
}
