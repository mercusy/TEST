package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.ui.theme.TESTTheme
import com.example.test.ui.theme.lightWhite
import com.example.test.ui.theme.navigation
import com.example.test.ui.theme.transparent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.navigationBarColor = navigation.toArgb()
        setContent {
            TESTTheme {
                Content()
            }
        }
    }
}

@Composable
fun Content(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .layoutId("hello")
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .paint(painterResource(id = R.drawable.back), contentScale = ContentScale.Crop)
        ) {
            Text(text = "Hello",
                modifier = Modifier
                    .padding(30.dp, 20.dp)
                    .wrapContentWidth()
                    .wrapContentHeight()
                ,
                fontSize = 40.sp,
                color = Color.Black,
                fontFamily = FontFamily.Cursive
            )
            Text(text = "Welcome to the test app, you can solve tests created by other users",
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(20.dp, 10.dp),
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center
            )
            Space(height = 80.dp)
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(20.dp, 10.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color(0x11FFFFFF))

            ) {
                Text(text = "Last score",
                    fontSize = 20.sp,
                    color = lightWhite,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .wrapContentWidth(align = Alignment.End)
                        .wrapContentHeight()
                        .padding(10.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .padding(horizontal = 10.dp)

                )
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(transparent)
                        .padding(horizontal = 50.dp)
                ) {}
                Space(height = 15.dp)
                Text(text = "English 01",
                    fontSize = 18.sp,
                    color = lightWhite,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 10.dp, bottom = 10.dp),

                )
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(text = "Number of questions : ",
                        fontSize = 17.sp,
                        color = lightWhite,
                        modifier = Modifier.width(260.dp)
                    )
                    Text(text = "30",
                        fontSize = 17.sp,
                        color = lightWhite)
                }
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(text = "True answers : ",
                        fontSize = 17.sp,
                        color = lightWhite,
                        modifier = Modifier.width(260.dp)
                    )
                    Text(text = "30",
                        fontSize = 17.sp,
                        color = lightWhite)
                }
            }
            Space(height = 40.dp)
            Button(onClick = {

            },
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = 40.dp)
                    .padding(horizontal = 20.dp)

            ) {
                Text(text = "Start test",
                    color = Color.White)
            }
        }
    }
}

@Preview
@Composable
fun Preview(){
    Content()
}

@Composable
fun Space(width : Dp = 10.dp, height : Dp = 10.dp){
    Spacer(modifier = Modifier
        .width(width)
        .height(height)
        .background(Color.Transparent))
}



