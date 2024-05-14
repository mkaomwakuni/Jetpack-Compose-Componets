package com.mkao.JetpackComponents


import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FloatingActionButton() {
    var localContext = LocalContext.current.applicationContext
    Box(modifier = Modifier.fillMaxWidth()){
    androidx.compose.material3.FloatingActionButton(
        modifier = Modifier
            .padding(10.dp)
            .align(alignment = Alignment.BottomEnd),
        onClick = {
            Toast.makeText(localContext,"Fab Is Ready",Toast.LENGTH_LONG).show()
        })
    {
        Icon(
            imageVector = Icons.Outlined.Add ,
            contentDescription = "Add"
        )
    }
    }
}
@Preview
@Composable
fun FloatingBPreview(){
    FloatingActionButton()
}