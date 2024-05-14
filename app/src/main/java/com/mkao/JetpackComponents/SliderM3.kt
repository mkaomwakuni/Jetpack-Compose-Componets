package com.mkao.JetpackComponents

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun SliderM3() {
    var sliderPosition by remember {
        mutableStateOf(0f)
    }
    Column (modifier = Modifier.padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = sliderPosition.toString())
    }
    Slider(
        value = sliderPosition,
        onValueChange = {sliderPosition= it},
        steps = 10,
        valueRange = 0f..5f,
        onValueChangeFinished = {
            //ViewModel.updateSelectedSliderValue(sliderPosition)
        },
        thumb = {
            Icon(
                imageVector = Icons.Outlined.ShoppingCart ,
                contentDescription = null,
                modifier = Modifier.size(ButtonDefaults.IconSize),
                tint = Color.DarkGray)
        }

    )
}


@Composable
fun PriceRangeSlider() {
    var sliderPosition by remember {
        mutableStateOf(10f..100f)
    }
    Column (
        modifier = Modifier.padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(text = sliderPosition.toString())
        RangeSlider(
            value = sliderPosition,
            onValueChange = {sliderPosition = it},
            valueRange = 0f..100f)

    }
}
@Preview(showBackground = true)
@Composable
fun RangeSliderPreviews(){
    PriceRangeSlider()
}
@Preview(showBackground = true)
@Composable
fun SliderPreview(){
  SliderM3( )
}

