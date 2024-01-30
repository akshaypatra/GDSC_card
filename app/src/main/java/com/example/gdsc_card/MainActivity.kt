package com.example.gdsc_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.weight
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc_card.ui.theme.GDSC_cardTheme
import com.example.gdsc_card.ui.theme.Purple1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GDSC_cardTheme {
               MyScreen()

            }
        }
    }
}


@Composable
fun MyScreen(){
   Column (verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = Modifier.fillMaxSize()){

      Card(
          modifier = Modifier
              .fillMaxWidth()
              .padding(26.dp)
              .height(250.dp),
          backgroundColor = Purple1,
          elevation = 10.dp,
          shape = RoundedCornerShape(30.dp)
      ){
          Myrow1()

          Myrow2()
      }

   }
}

@Composable
fun Myrow1(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){


        Text(
            text="Hi \nAkshay",
            fontSize = 25.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(16.dp))

        Image(painter = painterResource(id = R.drawable.gdsc_logo),
            contentDescription ="gdsc logo" )
    }
}

@Composable
fun Myrow2(){
    Row (
        verticalAlignment = Alignment.Bottom


    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
        )

        Spacer(modifier = Modifier.padding(1.dp))

        Text(
            text = "Attended \nGDSC Event",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )


    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GDSC_cardTheme {
                MyScreen()
    }
}