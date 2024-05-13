package com.mkao.JetpackComponents

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnrememberedMutableState")
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
            },
            colors = CheckboxDefaults.colors (
                checkedColor = Color.Green,
                uncheckedColor = Color.LightGray
            )
        )
        Text(text = "BMW Series")
    }
}
@Preview
@Composable
fun CheckedPreview(){
    CheckBoxesM3()
}

@Composable
fun ListofCheckBoxes() {
    val toppings: List<String> = listOf("BMW M3", "BMW M5", "BMW E5", "BMW M6")

    val context = LocalContext.current.applicationContext

    Column(horizontalAlignment = Alignment.Start) {
        toppings.forEach { toppingsName ->
            var checked by remember {
                mutableStateOf(true)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = checked,
                    onCheckedChange = { checkedStatus ->
                        checked = checkedStatus
                        Toast.makeText(
                            context,
                            "You Checked $toppingsName $checked",
                            Toast.LENGTH_LONG
                        ).show()
                    })
                Text(text = toppingsName)
            }
        }
    }
}
@Preview
@Composable
fun ListChecksPreview(){
    ListofCheckBoxes()
}