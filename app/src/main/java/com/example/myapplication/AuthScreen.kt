package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
@Composable
fun AuthScreen(
    modifier: Modifier,
    navigateToLoggedScreen: () -> Unit
){
    var email by remember { mutableStateOf("") }
    var password by remember {  mutableStateOf("")}

    val loginButtonEnabled by remember { mutableStateOf( email.isNotEmpty() && password.isNotEmpty()) }

    Column(
        modifier = modifier.fillMaxSize().padding(16.dp)
    ){
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-mail") },
            maxLines = 2,
            textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            maxLines = 2,
            textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        )

        Button(
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            enabled = loginButtonEnabled,
            onClick = {
                navigateToLoggedScreen.invoke()
            }
        ) {
            Text("Login")
        }
    }
}