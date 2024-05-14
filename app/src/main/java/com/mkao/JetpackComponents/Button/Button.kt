package com.mkao.JetpackComponents.Button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonM3() {
Button(
    modifier = Modifier
        .fillMaxWidth()
        .height(60.dp),
    onClick = { /*TODO*/ }) {
    Text(text = "Submit")
    
}
}
@Preview
@Composable
fun ButtonPreview(){
    ButtonM3()
}