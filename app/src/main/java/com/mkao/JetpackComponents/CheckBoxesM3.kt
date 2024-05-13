package com.mkao.JetpackComponents

import android.widget.Toast
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxesM3 () {
    var checked by mutableStateOf(true)
    val ctx = LocalContext.current.applicationContext
    Row(verticalAlignment = Alignment.CenterVertically) {

        Checkbox(
            checked = checked,
            onCheckedChange = { checkedStatus ->
                checked = checkedStatus
                Toast.makeText(ctx, "You Choose : $checkedStatus", Toast.LENGTH_LONG).show()
            }
        )
        Text(text = "BMW")
    }
}
@Preview
@Composable
fun CheckedPreview(){
    CheckBoxesM3()
}