package com.cobra.jetpackcomposebasics

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridCells.Fixed
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cobra.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // بنادى هنا عشان تتنفذ فى الابب
            var sizestate =  remember { mutableListOf(200.dp) }
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "increse style ")
                }
            }
//animation here
            //  MyApp()
            //   nav()
        }
    }
}

@Composable
fun Greating(name: String) {
    Text(text = "HEllo $name")

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {


    MyApp()
    Greating(name = "android")

}
/*  val keyboard_controller = LocalSoftwareKeyboardController.current
     val context = LocalContext.current
     val mycolor = Color.Green
     var changet_text by remember {
         mutableStateOf("")
     }*/
/*Column() {
    val gamelist = listOf(
        "HORIZEN", "ShadowsocksR", "Tivi", "Plaid", "FoldingCell", "Anvil"
    )
    LazyRow( contentPadding = PaddingValues(20.dp)) {
        items(gamelist) { item -> MYCard(gamename = item) }
    }
    LazyColumn( contentPadding = PaddingValues(20.dp)) {
        items(gamelist) { item -> MYCard(gamename = item) }
    }
}*/

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MyApp() {

}

@Composable
fun Mycard(mytext: String) {
    Card(
        modifier = Modifier
            .heightIn(75.dp)
            .padding(6.dp),
        backgroundColor = Color(
            Random.nextFloat(),
            Random.nextFloat(),
            Random.nextFloat(),
            alpha = 1f
        ),
        elevation = 6.dp
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = mytext)
        }
    }
}

@Composable
fun MYCard(gamename: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(120.dp)
            .padding(6.dp),

        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        elevation = 10.dp
    ) {
        Row(
            modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = gamename, fontSize = 22.sp)
        }
    }
}
