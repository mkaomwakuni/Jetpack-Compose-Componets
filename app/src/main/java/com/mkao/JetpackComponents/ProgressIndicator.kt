package com.mkao.JetpackComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
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

@Composable
fun ProgressIndicator (
    progress: Float,
    modifier: Modifier = Modifier,
    isCircular: Boolean = true
) {
    if (isCircular) {
        CircularProgressIndicator(
            progress = progress,
            modifier = modifier
        )
    } else {
        LinearProgressIndicator(
            progress = progress,
            modifier = modifier
        )
    }
}
@Composable
fun ProgressIndicatorScreen() {
    var progress by remember { mutableStateOf(0.5f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProgressIndicator(
            progress = progress,
            modifier = Modifier.size(100.dp),
            isCircular = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        ProgressIndicator(
            progress = progress,
            modifier = Modifier.fillMaxWidth(),
            isCircular = false
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (progress < 1f) progress += 0.1f
        }) {
            Text(text = "Increase Progress")
        }
    }
}

@Preview
@Composable
fun ProgressIndicator () {
    ProgressIndicatorScreen()
}
