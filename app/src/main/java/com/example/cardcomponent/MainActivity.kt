package com.example.cardcomponent

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardComponent() {
    Column {
        Text(text = "Card component", fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(all=10.dp)

        )
        Box{
            Card(colors =  CardDefaults.cardColors(Color.Cyan),

                modifier = Modifier

                    .padding(all = 30.dp)

                    .height(300.dp)
                    .width(800.dp)
                    .shadow(5.dp,
                        shape = RoundedCornerShape(CornerSize(40.dp))
                    )
            )
            {
                Image(
                    painter = painterResource
                        (id = R.drawable.drawing_image),
                    contentDescription = "drawing card",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(all = 30.dp)
                        .height(150.dp)
                        .width(300.dp)
                        .clip(RoundedCornerShape(20.dp))
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .padding(top = 215.dp, start = 60.dp)
                    .background(Color.Transparent)
                    .height(30.dp)
                    .width(220.dp)
            )

            {

                Column() {

                    Text(
                        text = "Drawing Image",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )


                }
            }





            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .padding(top = 250.dp, start = 60.dp)
                    .background(Color.Transparent)
                    .height(80.dp)
                    .width(300.dp)
            )

            {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {

                    Text(
                        text = "This card picture shows us" +
                                " a little deer cartoon" +
                                " take rest on a piece of wood.",
                        color = Color.Black,
                        fontSize = 20.sp,
                    )


                }
            }


        }
    }
}