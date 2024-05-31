package com.mkao.JetpackComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun  SearchBarM3(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: (String) -> Unit,
    modifier: Modifier = Modifier
    ) {
        var isHintDisplayed by remember { mutableStateOf(query.isEmpty()) }

        Box(modifier = modifier) {
            TextField(
                value = query,
                onValueChange = {
                    onQueryChange(it)
                    isHintDisplayed = it.isEmpty()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(56.dp),
                singleLine = true,
                placeholder = {
                    if (isHintDisplayed) {
                        Text("Search here...")
                    }
                },
                trailingIcon = {
                    IconButton(onClick = { onSearch(query) }) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                    }
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.LightGray,
                    unfocusedContainerColor = Color.LightGray,
                    disabledContainerColor = Color.LightGray,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            )
        }
    }

    @Composable
    fun SearchScreen() {
        var query by remember { mutableStateOf("") }

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            SearchBarM3(
                query = query,
                onQueryChange = { query = it },
                onSearch = { searchQuery ->

                    println("Searching for: $searchQuery")
                },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

@Preview
@Composable
fun SearchBarPreview(){
    SearchScreen()
}