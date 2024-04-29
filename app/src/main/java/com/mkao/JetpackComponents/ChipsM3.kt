package com.mkao.JetpackComponents


import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ChipsM3() {
    AssistChip(
        onClick = { /*TODO*/ },
        label = { Text("Assistant Chip") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@Preview
@Composable
fun ChipPreview() {
    ChipsM3()
}

@Composable
fun ElevateChipM3() {
    ElevatedAssistChip(
        onClick = { /*TODO*/ },
        label = { Text("Assistant Chip") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@Preview
@Composable
fun ChipPreview2() {
    ElevateChipM3()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterChipM3() {
    var selected by remember {
        mutableStateOf(false)
    }
    FilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter Chip") },
        trailingIcon = {
            if (selected) {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = null,
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        }
    )
}

@Preview
@Composable
fun ChipPreview3() {
    FilterChipM3()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ElevatedFilterChipM3() {
    var selected by remember {
        mutableStateOf(false)
    }
    ElevatedFilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter Chip") },
        trailingIcon = {
            if (selected) {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = null,
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        }
    )
}

@Preview
@Composable
fun ElevatedChipPreview4() {
    ElevatedFilterChipM3()
}

@Composable
fun SuggestionChipM3() {
    SuggestionChip(
        onClick = { /*TODO*/ },
        label = { Text("Suggestion Chip") },
        icon = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(SuggestionChipDefaults.IconSize)
            )
        }
    )
}

@Preview
@Composable
fun SuggestionPreview4() {
    SuggestionChipM3()
}

@Composable
fun ElevatedSuggestionChipM3() {
    ElevatedSuggestionChip(
        onClick = { /*TODO*/ },
        label = { Text("ElevatedSuggestion Chip") },
        icon = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(SuggestionChipDefaults.IconSize)
            )
        }
    )
}

@Preview
@Composable
fun ElevatedSuggestionPreview4() {
    ElevatedSuggestionChipM3()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputChipM3() {
    var selected by remember {
        mutableStateOf(false)
    }
    InputChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Input Chip") },
        trailingIcon = {
            if (selected) {
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = null,
                    modifier = Modifier.size(InputChipDefaults.IconSize)
                )
            }
        }
    )
}

@Preview
@Composable
fun InputChipPreview4() {
    InputChipM3()
}