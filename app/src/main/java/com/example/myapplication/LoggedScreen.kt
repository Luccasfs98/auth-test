package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

@Composable
fun LoggedScreen(
    modifier: Modifier
){
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp)
    ){
        Text(
            modifier = Modifier,
            text = "You are authenticated, welcome!"
        )
    }
}