package com.cobra.jetpackcomposebasics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(myname : String?,myage : String?){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column {
            Text(text = "Your name is : $myname" , fontSize = 20.sp )
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "Your age is : $myage" , fontSize = 20.sp )

        }
    }
}