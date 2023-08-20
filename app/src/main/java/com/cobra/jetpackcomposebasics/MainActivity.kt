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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextOverflow
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

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MyApp() {
    val keyboard_controller = LocalSoftwareKeyboardController.current
    val context = LocalContext.current
    val mycolor = Color.Green
    var changet_text by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Card(
            modifier = Modifier
                .width(200.dp)
                .heightIn(270.dp),
            shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
            backgroundColor = Color.White,
            elevation = 10.dp

        ) {
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.photo),
                    contentDescription = "spong pop ",
                    modifier = Modifier
                        .heightIn(150.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.padding(16.dp)

                ) {
                    Text(text = "Title", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Text(text = "sponge pop is a cartoon for kids and most kids are love this cartoon "
                    , color = Color.DarkGray, maxLines = 2, overflow = TextOverflow.Ellipsis)


                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MyApp()

}
