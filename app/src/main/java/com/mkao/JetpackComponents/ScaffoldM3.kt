package com.mkao.JetpackComponents

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.ListItem
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldM3() {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

        Scaffold (
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
            topBar = { CentreTopAppBar(scrollBehavior = scrollBehavior) })
        {paddingValues ->
            LazyColumn (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(16.dp)
            ){
                items(50){
                    androidx.compose.material3.ListItem(
                        headlineContent = { Text(text = "Item $it") },
                        leadingContent = {
                            Icon(
                                imageVector =Icons.Outlined.Info ,
                                contentDescription = null)
                        })
                }

            }

        }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarM3(
    scrollBehavior: TopAppBarScrollBehavior
) {
   TopAppBar(
       scrollBehavior = scrollBehavior,
       title = { Text(text = "Top Secret")},
       navigationIcon = {
           IconButton(
               onClick = { /*TODO*/ }) {
               Icon(imageVector = Icons.Outlined.Menu, contentDescription = null)
           }
       },
       actions = {
           IconButton(
               onClick = { /*TODO*/ }) {
               Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Likes"
               )
           }
           IconButton(
               onClick = { /*TODO*/ }) {
               Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings"
               )
           }
       })
}

@Preview
@Composable
fun PreviewScaffold(){
    ScaffoldM3()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CentreTopAppBar(scrollBehavior: TopAppBarScrollBehavior){
    CenterAlignedTopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(text = "Top Secret")},
        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Likes"
                )
            }
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MediumTopAppBarM3(scrollBehavior: TopAppBarScrollBehavior){
    MediumTopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(text = "Top Secret")},
        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Likes"
                )
            }
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings"
                )
            }
        }
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LargeTopAppBarM3(scrollBehavior: TopAppBarScrollBehavior){
    LargeTopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(
            text = "Top Secret of the night",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis)},
        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Likes"
                )
            }
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings"
                )
            }
        }
    )
}