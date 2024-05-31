package com.mkao.JetpackComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun SnackbarM3 (
    snackbarHostState: SnackbarHostState,
    modifier: Modifier = Modifier,
    message: String,
    actionLabel: String? = null,
    actionOnClick: (() -> Unit)? = null
) {
    SnackbarHost(
        hostState = snackbarHostState,
        modifier = modifier
    ) { snackbarData ->
        Snackbar(
            action = {
                actionLabel?.let { label ->
                    Button(onClick = {
                        actionOnClick?.invoke()
                        snackbarData.dismiss()
                    }) {
                        Text(text = label)
                    }
                }
            }
        ) {
            Text(text = message)
        }
    }
}
@Composable
fun SnackbarScreen() {
    val snackbarHostState = remember { SnackbarHostState() }
    var message by remember { mutableStateOf("Hello, Snackbar!") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            message = "Hello, Snackbar!"
            CoroutineScope(Dispatchers.Main).launch {
                snackbarHostState.showSnackbar(message)
            }
        }) {
            Text(text = "Show Snackbar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            message = "Action Snackbar!"
            CoroutineScope(Dispatchers.Main).launch {
                snackbarHostState.showSnackbar(
                    message = message,
                    actionLabel = "Undo"
                )
            }
        }) {
            Text(text = "Show Snackbar with Action")
        }
    }
    SnackbarM3(
        snackbarHostState = snackbarHostState,
        message = message,
        actionLabel = "Undo",
        actionOnClick = {
            // Handle the action click
        }
    )
}
@Preview(showBackground = true)
@Composable
fun PreviewSnackbar(){
    MaterialTheme {
        SnackbarScreen()
    }
}