package com.mkao.JetpackComponents

import android.content.ClipData.Item
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.input.key.Key.Companion.I
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  BottomSheet() {
	var  onOpenBottomsheet by remember{ mutableStateOf(false) }
	
	Button(onClick = { onOpenBottomsheet = true }) {
		Text(text = "Show Sheet")
	}
	if (onOpenBottomsheet){
		ModalBottomSheet(onDismissRequest = { onOpenBottomsheet= false }) {
		}
	}
	
}
@Composable
fun BottomSheetContent (){
	LazyColumn(
		contentPadding = PaddingValues(16.dp)){
		I
		
			
		}
		
	}
}