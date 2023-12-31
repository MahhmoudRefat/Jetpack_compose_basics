package com.cobra.jetpackcomposebasics

class `Code_examples` {
    /*
   *******   امثلة للموديفير الى ممكن نكتبها
     @Composable
fun FirstApp() {
    Surface(
        modifier = Modifier
            .height(150.dp)
            .width(250.dp).padding(20.dp),
        color = Color.Green,
        shape = CutCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = Color.DarkGray),
        elevation = 20.dp
    ) {
        Text(text = "Hello world !!", modifier = Modifier.padding(16.dp))
    }
}
     */
/*

//this function preview to show the ui in panel
//عشان كدة نادينا على الفانكشن بتاع الفيرست ابب غبها
@Preview(name = "THis is preview", showBackground = true)
@Composable
fun AppPreview() {
    FirstApp()
}
 */
    /*
    ***** modifier ******

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
     */

/*
 ****************** Button lesson  *************************
 *  Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //simple Button
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Button")
        }
        //outlineButton
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "outlineButton")
        }
        //text Button
        TextButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = null,
                modifier = Modifier.size(ButtonDefaults.IconSize), tint = Color.Red
            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))//space between icon and text
            Text(text = "textButton ")
        }
        //icon button
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Icon",
                tint = Color.Green
            )

        }
        //Button
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xA8AE91E0),
                contentColor = Color.White
            )
        ) {
            Icon(imageVector = Icons.Filled.Add, contentDescription = null)
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "ADD")
        }
 */
    /*
    ************button ***************
    *
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

     */
    /*
    ************* making a toast *****************
    *  Button(onClick = {
            Toast.makeText(context, "Here is your new toast", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Showing toast ")

        }
        *
     */

    /*
    ************************** state ***********

     var context = LocalContext.current
    var count = rememberSaveable { mutableStateOf(0) }

     Button(onClick = {
            Toast.makeText(context, "Here is the toast ", Toast.LENGTH_SHORT).show();
            count.value++
            Log.d("Tag", "${count.value}")
        }) {

            Text(text = "cont : ${count.value}")
        }


     */

    /*

    ******************************checkbox**********************


     //  Checkbox(checked =checkstate.value , onCheckedChange = {checkstate.value = it}   )
        val fruitlist = arrayListOf("apple", "mango", "orange")
        var ischeacked = remember { mutableStateOf(false) }

        fruitlist.forEach { option: String ->
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = ischeacked.value, onCheckedChange = {ischeacked.value = it})
                Spacer(modifier = Modifier.size(16.dp))
                Text(text = option)
            }

     */
    /*
    ******************* radio button **************
    * var radio_option = listOf("apple","banana","orange")
    var checkstate by remember { mutableStateOf(0) }
    *
    *  radio_option.forEachIndexed { i, option : String ->
         Row() {
             RadioButton(selected =  checkstate == i, onClick = { checkstate = i  })
             Spacer(modifier = Modifier.size(16.dp))
             Text(text = option)
         }
     }

     */
    /*
    ******************* switch ******************
    * var switchStat by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(if (switchStat) Color.Magenta else Color.Yellow),
        Alignment.Center
    ) {
        Switch(checked = switchStat, onCheckedChange = { switchStat = it })


    }
     */
    /*
    ******************* image ****************
    * Column() {
            Image(
                painter = painterResource(id = R.drawable.photo), contentDescription = "Image",
                modifier = Modifier
                    .size(230.dp)
                    .clip(RoundedCornerShape(10.dp)),
                // alignment = Alignment . BottomEnd,
                contentScale = ContentScale.Fit
            )
        }
     */
    /*

     *********************** text field ****************
    OutlinedTextField(
            value = changet_text,
            onValueChange = { changet_text = it },
            label = { Text(text = "Enter Your Name") },
            modifier = Modifier.width(270.dp),
            maxLines = 2,
            placeholder = { Text(text = "example ") },
            leadingIcon = { Icon(imageVector = Icons.Filled.Edit, contentDescription = "icon") },
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Send, contentDescription = "snd")
                }
            },
            keyboardActions = KeyboardActions(
                onDone = { keyboard_controller?.hide()
                Toast.makeText(context,"welcome ya houda ",Toast.LENGTH_SHORT).show()
                }
            )
        )
     */
    /*

    ******************** colored text field *********************
    {

        TextField(
            value = changet_text,
            onValueChange = { changet_text = it },
            label = { Text(text = "enter your name ", color = Color.DarkGray) },
            leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "icon") },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = mycolor,
                focusedLabelColor = mycolor,
                backgroundColor = mycolor.copy(TextFieldDefaults.BackgroundOpacity),
                focusedIndicatorColor = mycolor,
                cursorColor = mycolor,
                textColor = Color.DarkGray
            ), shape = CutCornerShape(topStart = 15.dp, topEnd = 15.dp)


        )
        TextField(
            value = changet_text,
            onValueChange = { changet_text = it },
            label = { Text(text = "enter your name ", color = Color.DarkGray) },
            leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "icon") },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.Blue,
                focusedLabelColor = Color.Blue,
                backgroundColor = Color.Blue.copy(TextFieldDefaults.BackgroundOpacity),
                focusedIndicatorColor = Color.Blue,
                cursorColor = Color.Blue,
                textColor = Color.Blue
            ), shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp)
        )

    }
     */
    /*
    ****************************** Card *************************
    *        //First Column Scope
        Card( //card properities -- > شكل الكارد نفسه
            modifier = Modifier
                .width(200.dp)
                .heightIn(270.dp),
            shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
            backgroundColor = Color.White,
            elevation = 10.dp

        ) {  // داخل هذا الكارد
            Column() {
                Image( // الصورة ومواصفتها
                    painter = painterResource(id = R.drawable.photo),
                    contentDescription = "spong pop ",
                    modifier = Modifier
                        .heightIn(150.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column( //جوة الكولم الى فيه الصورة عملنا كولوم جديد
                    modifier = Modifier.padding(16.dp)
                ) {
                    //ده الكتابة جوة الكولوم الجدسد
                    Text(text = "Title", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Text(text = "sponge pop is a cartoon for kids and most kids are love this cartoon "
                    , color = Color.DarkGray, maxLines = 2, overflow = TextOverflow.Ellipsis)


                }
            }
        }
     */
    /*
    ********************* lazy column and lazy row *******************
    *
    Column() {
        val gamelist = listOf(
            "HORIZEN", "ShadowsocksR", "Tivi", "Plaid", "FoldingCell", "Anvil"
        )
        LazyRow( contentPadding = PaddingValues(20.dp)) {
            items(gamelist) { item -> MYCard(gamename = item) }
        }
        LazyColumn( contentPadding = PaddingValues(20.dp)) {
            items(gamelist) { item -> MYCard(gamename = item) }
        }
    }
}

@Composable
fun MYCard(gamename: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(120.dp).padding(6.dp),

        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        elevation = 10.dp
    ) {
        Row(
            modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
        Text(text = gamename , fontSize = 22.sp)
        }
    }
}
     */
    /*
    ***************************** Lazy Vertical Grid ***********************
    *  val gamelist = listOf(
        "HORIZEN", "ShadowsocksR", "Tivi", "Plaid", "FoldingCell", "Anvil" )

    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 100.dp),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(count = 200) { num -> Mycard(mytext = "$num") }
    }

}

@Composable
fun Mycard(mytext: String) {
    Card(
        modifier = Modifier
            .heightIn(75.dp)
            .padding(6.dp),
        backgroundColor = Color(Random.nextFloat(),Random.nextFloat(),Random.nextFloat(), alpha = 1f),
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

     */
    /*
    ****************** Top App bar ***********************
    *
     Scaffold(topBar = {
        TopAppBar(
            title = {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    Alignment.Center
                ) { Text(text = "Top App Bar ") }
            }, navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "")
                }
            },
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .clip(RoundedCornerShape(10.dp)),
            backgroundColor = Color.Gray,
            contentColor = Color.White,
            elevation = 8.dp,
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
                }
            }
        )
    }
    ) {
    }

     */
    /*
    ****************  bottom navigation bat  **********************
    *   var bottom_state by remember {
        mutableStateOf("Home")
    }
    Scaffold(
        content = {
        Box(modifier = Modifier.fillMaxSize(), Alignment.Center) {
        Text(text = bottom_state, fontSize = 25.sp, fontWeight =FontWeight.Bold)

        }
    }, bottomBar = {
        BottomNavigation() {
            BottomNavigationItem(
                selected = bottom_state == "Home",
                onClick = { bottom_state = "Home" },
                label = { Text(text = "Home") },
                icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "icon") })
            BottomNavigationItem(
                selected = bottom_state == "Account",
                onClick = { bottom_state = "Account" },
                label = { Text(text = "Account") },
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Account"
                    )
                })
            BottomNavigationItem(
                selected = bottom_state == "Search",
                onClick = { bottom_state = "Search" },
                label = { Text(text = "Search") },
                icon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") })
            BottomNavigationItem(
                selected = bottom_state == "setting",
                onClick = { bottom_state = "setting" },
                label = { Text(text = "setting") },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "setting"
                    )
                })

        }
    })


     */
    /*
    *************** floating action bar ***************************
    * Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color.Magenta,
            shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp)
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "icon")
        }
    },
        bottomBar = { BottomAppBar() {} }


    )
     */
}

/*
Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            )

             Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
 */

/*
********************** text style ************************
            Box(modifier = Modifier
                .background(Color.Black)
                .fillMaxSize()){
                Text(text = buildAnnotatedString { withStyle(
                    style= SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("J")
                }
                    append("etpack")
                                                 },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Monospace,
                    textDecoration = TextDecoration.Underline
                )




 */
