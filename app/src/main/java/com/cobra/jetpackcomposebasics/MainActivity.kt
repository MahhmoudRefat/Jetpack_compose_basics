package com.cobra.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        //rounded button
        Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(15.dp)) {
            Text(text = "Rounded button ")
        }
        //cutted button
        Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10.dp)) {
            Text(text = "cutet corner")
        }
        Button(onClick = { /*TODO*/ }, shape = CircleShape, modifier = Modifier.size(100.dp)) {
            Text(text = "Circle")
        }
        Button(
            onClick = { /*TODO*/ },
            elevation = ButtonDefaults.elevation(20.dp),
            colors = ButtonDefaults.buttonColors(Color(0xF3EDECF0))
        ) {
            Text(text = "Button")
        }


    }


}

@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MyApp()

}
