package org.example.composelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// Text & Modifier
@Composable
@Preview
fun App1() {
    Text(
        text = "Hello Kotlin",
        modifier = Modifier.background(Color.Red).fillMaxWidth(),
    )
}

//Material Theme
@Composable
@Preview
fun App2() {
    MaterialTheme {
        Text(
            text = "Hello Kotlin",
            modifier = Modifier
        )
    }
}


//Column & Row
@Composable
@Preview
fun App3() {
    MaterialTheme {
        Column {
            Text("Hello Kotlin")
            Text("Hello Kotlin")
            Text("Hello Kotlin")
            Button(onClick = { }) {
                Text("Click Me")
            }
        }
        Row {
            Text("Hello Kotlin i am abhinav")
            Button(onClick = { }) {
                Text("Click Me")
            }

        }
    }

}

//Box
@Composable
@Preview
fun App4() {
    MaterialTheme {
        Box {
            Text("Hello Kotlin")
            Button(onClick = { }) {
                Text("Click Me")
            }
        }
    }

}

//State
@Composable
@Preview
fun App5() {
    MaterialTheme {
//        var count = remember { mutableStateOf(0) }
        var count by remember { mutableStateOf(0) }
        Column {
//            Text("Count: ${count.value}")
            Text("Count: ${count}")
            Button(onClick = {
//                count.value++;
                count++;
            }) {
                Text("Increment");
            }
        }
    }
}


//Show Hide & enable Disable
@Composable
@Preview
fun App6() {
    MaterialTheme {
        var showText by remember { mutableStateOf(false) }
        var enabled by remember { mutableStateOf(true) }
        var message by remember { mutableStateOf("") }
        Column {
            Button(onClick = {
                showText = !showText
            }) {
                Text("Show / Hide")
            }
            if (showText) {
                Text("Hello Kotlin")
            }

            Button(onClick = {
                message = ""
                enabled = !enabled


            }) {
                Text("Toggle")
            }
            Button(
                onClick = {
                    message = "Login Successfully"
                },
                enabled = enabled
            ) {
                Text("Login")
            }
            Text(message)
        }
    }

}

//padding , size , width , height , fillMaxWidth , fillMaxSize
@Composable
@Preview
fun App7() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        )
        Column {
            Text(
                text = "Hello Kotlin1",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
                    .padding(16.dp)
            )
            Text(
                text = "Hello Kotlin2",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(16.dp)
            )
            Text(
                text = "Hello Kotlin3",
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Red)
            )
            Text(
                text = "Hello Kotlin4",
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Red)
            )
            Text(
                text = "Width",
                modifier = Modifier
                    .width(200.dp)
                    .background(Color.Blue)
            )
            Text(
                text = "Height",
                modifier = Modifier
                    .height(50.dp)
                    .background(Color.Red)
            )
            Text(
                text = "fillMaxWidth",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
            )
        }
    }
}

//Alignment
@Composable
@Preview
fun App8() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            horizontalAlignment = Alignment.Start,
//            horizontalAlignment = Alignment.CenterHorizontally,
//            horizontalAlignment = Alignment.End
        ) {
            Text("One")
            Text("Two")
            Text("Three")
        }
    }
}

//Arrangment
@Composable
@Preview
fun App9() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),

//            verticalArrangement = Arrangement.Top,
//            verticalArrangement = Arrangement.Center,
//            verticalArrangement = Arrangement.Bottom,
//            verticalArrangement = Arrangement.SpaceBetween,
//            verticalArrangement = Arrangement.SpaceAround,
//            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Text("One")
            Text("Two")
            Text("Three")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("One")
            Text("Two")
            Text("Three")
        }
    }
}

@Composable
@Preview
fun App() {
    MaterialTheme {
//        Column{
//            Column {
//                Text("Title")
//                Column {
//                    Text("Name")
//                    Text("Age")
//                }
//            }
//            Row {
//                Text("Name")
//                Row {
//                    Text("Name")
//                    Text("Age")
//                }
//            }
//        }

//        Row (
//            modifier = Modifier.border(2.dp, Color.Black).fillMaxWidth()
//        )
//        {
//            Column (
//                modifier = Modifier.background(Color.Gray).border(2.dp, Color.Black).padding(8.dp)
//            ){
//                Text("Id")
//                Column {
//                    Text("1")
//                    Text("2")
//                    Text("3")
//                    Text("4")
//                    Text("5")
//                }
//            }
//            Column (
//                modifier = Modifier.background(Color.DarkGray).padding(8.dp)
//            ){
//                Text("Name")
//                Column {
//                    Text("AKASH")
//                    Text("ABHINAV")
//                    Text("SHUBHAM")
//                    Text("Apii")
//                    Text("Shivam")
//                }
//            }
//        }

        Row (
            modifier = Modifier.fillMaxWidth().border(2.dp, Color.Black),
        ) {
            Column {
                Text("Hello")
                Text("Hello")
            }
            Column {
                Text("Hello")
                Text("Hello")
            }
        }
    }
}