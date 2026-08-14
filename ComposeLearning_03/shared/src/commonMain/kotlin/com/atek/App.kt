package com.atek

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import composelearning_03.shared.generated.resources.Res

@Composable
fun App0(){
    MaterialTheme (
        colorScheme = lightColorScheme(primary = Color.Red)
    ) {
        Text(
            text = "Hello Kotlin",
            modifier = Modifier
                .padding(8.dp)
                .background(Color.LightGray)
                .fillMaxWidth()
                .shadow(2.dp)
                .border(1.dp, Color.Black),
            color = Color.White,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
        )
    }

}

@Composable
fun App1() {
    MaterialTheme{
        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Text("First")
            Text("Second")

            Button(onClick = {  }) {
                Text("Click Me")
            }
            Button(onClick = {  }) {
                Text("Click Me")
            }

            Text("Third")

        }
    }
}

@Composable
fun App3() {
    MaterialTheme {
        Row(
           modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
        )
        {
            Text("Row Kotlin")
            Text("Row Kotlin")
            Text("Row Kotlin")
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text("Column Kotlin")
            Text("Column Kotlin")
            Text("Column Kotlin")
        }
    }

}

@Composable
fun App() {
    MaterialTheme {
            Column(
                modifier = Modifier.border(1.dp, Color.Black)
                    .background(Color.LightGray),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,

                ){
                    Text("Name")
                    Text("Age")
                }

                Button(onClick = {  }) {
                    Text("Submit")
                }
            }
    }
}