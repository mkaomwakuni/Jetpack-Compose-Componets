package com.mkao.JetpackComponents.Dialog

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomAppBarScreen(){
	Scaffold(
		bottomBar = {BottomAppBar()}
	) {padding ->
	 LazyColumn(
		 modifier = Modifier
			 .fillMaxSize()
			 .padding(padding),
		 contentPadding = PaddingValues(16.dp)
	 ){
		 items(50){
			 ListItem(
				 headlineContent = { Text(text = "Item $it")},
				 leadingContent = {
					 Icon(imageVector = Icons.Default.Face, contentDescription = null)
				 }
			 )
		 }
	 }
	}
}
@Composable
fun BottomAppBar() {
	androidx.compose.material3.BottomAppBar(
		actions = {
			IconButton(onClick = { /*TODO*/ }) {
				Icon(Icons.Filled.Home, contentDescription = null )
			}
			IconButton(onClick = { /*TODO*/ }) {
				Icon(Icons.Filled.Search, contentDescription = null )
			}
			IconButton(onClick = { /*TODO*/ }) {
				Icon(Icons.Filled.List, contentDescription = null )
			}
			IconButton(onClick = { /*TODO*/ }) {
				Icon(Icons.Filled.Person, contentDescription = null )
			}
			
		},
		floatingActionButton = {
		FloatingActionButton (
			onClick = { /*TODO*/ },
		    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(),
		    contentColor = BottomAppBarDefaults.bottomAppBarFabColor)
		{
			Icon(Icons.Filled.Add, contentDescription = "null" )
		}
    })
}

@Preview
@Composable
fun preViewBottomBar(){
	BottomAppBar()

}