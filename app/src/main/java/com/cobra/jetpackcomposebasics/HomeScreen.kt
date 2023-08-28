package com.cobra.jetpackcomposebasics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController) {

    var nameValue by remember { mutableStateOf(" ") }
    var ageValue by remember { mutableStateOf(" ") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = nameValue, onValueChange = { nameValue = it },
            modifier = Modifier.padding(bottom = 20.dp),
            placeholder = { Text(text = "Enter Your name ", color = Color.Magenta) }
        )
        TextField(
            value = ageValue, onValueChange = { ageValue = it },
            modifier = Modifier.padding(bottom = 20.dp),
            placeholder = { Text(text = "Enter Your age ", color = Color.Magenta) })

        Button(onClick = { navController.navigate("second?name=$nameValue&age=$ageValue") }) {
            Text(text = "pass")

        }

    }
}