package com.mkao.JetpackComponents.Dialog

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun NavigationBarWithScaffold(){
    Scaffold (
        bottomBar = { NavigationBarM3()},
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null )
            }
        }
    ){padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ){
            items(50){
                androidx.compose.material3.ListItem(
                    headlineContent = { Text(text = "item $it") },
                    leadingContent = {
                        Icon(imageVector = Icons.Default.Favorite,contentDescription = null)
                    })
            }
        }
    }

}
@Composable
fun NavigationBarM3() {

    var selectedItem by remember {
        mutableStateOf(0)
    }
    val barlistitems = listOf(

        BarItem(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unSelectedIcon = Icons.Filled.Home,
            route = "Home"
        ),
        BarItem(
            title = "Collection",
            selectedIcon = Icons.Filled.Favorite,
            unSelectedIcon = Icons.Filled.Favorite,
            route = "Favourites"
        ),
        BarItem(
            title = "Likes",
            selectedIcon = Icons.Filled.ThumbUp,
            unSelectedIcon = Icons.Filled.ThumbUp,
            route = "Liked"
        ),
        BarItem(
            title = "info",
            selectedIcon = Icons.Filled.Info,
            unSelectedIcon = Icons.Filled.Info,
            route = "infoSettings"
        ),

    )
androidx.compose.material3.NavigationBar {
    barlistitems.forEachIndexed { index, barItem ->
        val selected = selectedItem == index
        NavigationBarItem(
            selected = selectedItem==index,
            onClick = {
                selectedItem=index },
            icon = {
                Icon(
                    imageVector = if (selectedItem==index)barItem.selectedIcon
                    else barItem.unSelectedIcon,
                    contentDescription =barItem.title )
            },
            label = { Text(text = barItem.title) },
            alwaysShowLabel = selected)
    }
}

}
data class BarItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val route: String
)

@Preview
@Composable
fun NavigationPreview(){
    NavigationBarM3()
}