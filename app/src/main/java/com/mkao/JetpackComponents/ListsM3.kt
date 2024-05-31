package com.mkao.JetpackComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListsM3 (
    item: String,
    onItemClicked: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clickable { onItemClicked(item) }
            .padding(16.dp)
    ) {
        Text(text = item, modifier = Modifier.weight(1f))
        Icon(
            imageVector = Icons.Filled.ArrowForward,
            contentDescription = "Go",
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}
@Composable
fun StatelessList(
    items: List<String>,
    onItemClicked: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(items) { item ->
            ListsM3(item = item, onItemClicked = onItemClicked)
        }
    }
}
@Composable
fun ListScreen() {
    val items = remember { mutableStateOf(listOf("Item 1", "Item 2", "Item 3")) }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        StatelessList(
            items = items.value,
            onItemClicked = { selectedItem ->

                println("Clicked on: $selectedItem")
            },
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    MaterialTheme {
        ListScreen()
    }
}
