package com.cobra.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cobra.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // بنادى هنا عشان تتنفذ فى الابب
            MyApp()

        }
    }
}

@Composable
fun MyApp() {

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Text(
            text = "test Modifier", modifier = Modifier
                .padding(10.dp)
                .background(Color.Green)
                .padding(10.dp)
                //.size(width = 200.dp, height = 150.dp)
                .fillMaxWidth() // equal to match parent
        )
        Box(modifier = Modifier
            .padding(start = 30.dp, top = 30.dp)
            .rotate(45f)
            .clip(shape = RoundedCornerShape(16.dp))
            .size(150.dp)
            .alpha(0.7f)
            .background(Color.Cyan)
            .border(width = 2.dp, color = Color.DarkGray, RoundedCornerShape(16.dp))
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MyApp()

}
