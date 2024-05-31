package com.mkao.JetpackComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
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
import androidx.compose.ui.unit.sp

@Composable
fun RadioButtonM3(
    selected: Boolean,
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable { onClick() }
            .padding(8.dp)
    ) {
        RadioButton(
            selected = selected,
            onClick = onClick
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 18.sp)
    }
}

@Composable
fun RadioButtonScreen() {
    var selectedOption by remember { mutableStateOf("Option 1") }

    Column(modifier = Modifier.padding(16.dp)) {
        RadioButtonM3(
            selected = selectedOption == "Option 1",
            onClick = { selectedOption = "Option 1" },
            text = "Option 1"
        )
        RadioButtonM3(
            selected = selectedOption == "Option 2",
            onClick = { selectedOption = "Option 2" },
            text = "Option 2"
        )
        RadioButtonM3(
            selected = selectedOption == "Option 3",
            onClick = { selectedOption = "Option 3" },
            text = "Option 3"
        )

        Text(text = "Selected option: $selectedOption", modifier = Modifier.padding(top = 16.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun RadioButtonScreenPreview() {
    MaterialTheme {
        RadioButtonScreen()
    }
}

