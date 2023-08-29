package com.cobra.jetpackcomposebasics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cobra.jetpackcomposebasics.navigation.Screens

@Composable
fun OneScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "1", fontSize = 30.sp)
        Spacer(modifier = Modifier.size(30.dp))
        Button(onClick = {
            navController.navigate(Screens.LetterRoute.route){  }

        }
        ) {
            Text(text = "Go To A ")
        }
    }
}