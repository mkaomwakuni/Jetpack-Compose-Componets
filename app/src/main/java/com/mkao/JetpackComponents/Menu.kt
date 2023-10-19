package com.mkao.JetpackComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
 fun Menu (){
 var expanded by remember {
     mutableStateOf(false)
 }
     Box(modifier = Modifier.wrapContentSize()) {
         IconButton( onClick = {expanded = true}) {
             Icon(Icons.Default.MoreVert, contentDescription = "Menu Icons")

         }
         DropdownMenu(
             expanded = expanded,
             onDismissRequest = { expanded = false})
         {
             DropdownMenuItem(
                 text = { Text(text = "Edit")  },
                 onClick = { /*TODO*/ },
                 leadingIcon = {
                    Icon(Icons.Default.Edit,contentDescription = null)
                 }
             )
             DropdownMenuItem(
                 text = { Text(text = "Settings")  },
                 onClick = { /*TODO*/ },
                 leadingIcon = {
                     Icon(Icons.Default.Settings,contentDescription = null)
                 }
             )
             DropdownMenuItem(
                 text = { Text(text = "Close")  },
                 onClick = { /*TODO*/ },
                 leadingIcon = {
                     Icon(Icons.Default.Close,contentDescription = null)
                 },
                 trailingIcon = { Text(text = "Fill")}
             )
         }
     }
 }
@Preview
@Composable
fun Menupreview(){
    Menu()
}

