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
}