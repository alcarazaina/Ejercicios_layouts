package com.dam2v.ejercicios_layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dam2v.ejercicios_layouts.ui.theme.Ejercicios_layoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicios_layoutsTheme {
                    MiBox()
                }
            }
        }
    }


/* @Composable
fun BoxActivity(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 20.dp, horizontal = 20.dp)
    ) {
        Row(modifier = Modifier.padding(20.dp)) {
            Box (
                modifier = modifier.padding(vertical = 20.dp, horizontal = 20.dp),

            ){
                Column (
                    modifier = Modifier.padding().background(MaterialTheme.colorScheme.secondary),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Hola")

                }
            }
        }
        Row(modifier = Modifier.padding(20.dp)) {
            Column(
                modifier = modifier.weight(20f).padding(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Esto es un ejemplo")
            }
        }
    }
}

 */

@Composable
fun MiBox() {
    Box(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .background(Color.Blue)
                .align(Alignment.Center)
        ) {
            Row(modifier = Modifier.padding(20.dp)) {
                Column(
                    modifier = Modifier.padding(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Esto es un ejemplo",
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Composable
fun MiBox2(){
    Box(modifier = Modifier
        .background(Color.Green)
        .size(300.dp)){
        Box(modifier = Modifier
            .background(Color.Red)
            .align(Alignment.Center)
            .size(240.dp)){
            Box(modifier = Modifier
                .background(Color.Blue)
                .align(Alignment.Center)
                .size(180.dp)){
                Box(modifier = Modifier
                    .background(Color.Yellow)
                    .align(Alignment.Center)
                    .size(120.dp)){
                    Box(modifier = Modifier
                        .background(Color.Black)
                        .align(Alignment.Center)
                        .size(60.dp)){}
                }
            }
        }
    }
}

@Composable
fun MiBox3(){
    Box(modifier = Modifier
        .background(Color.Green)
        .size(300.dp)){
        Box(modifier = Modifier
            .background(Color.Red)
            .align(Alignment.TopEnd)
            .size(240.dp)){
            Box(modifier = Modifier
                .background(Color.Blue)
                .align(Alignment.BottomStart)
                .size(180.dp)){
                Box(modifier = Modifier
                    .background(Color.Yellow)
                    .align(Alignment.BottomEnd)
                    .size(120.dp)){
                    Box(modifier = Modifier
                        .background(Color.Black)
                        .align(Alignment.TopStart)
                        .size(60.dp)){}
                }
            }
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicios_layoutsTheme {
        BoxActivity()
    }
}

 */

/*
@Preview(showBackground = true)
@Composable
fun MiBoxPreview(){
    MiBox()
}

 */

/*
@Preview(showBackground = true)
@Composable
fun MiBox2Preview(){
    MiBox2()
}
 */

@Preview(showBackground = true)
@Composable
fun MiBox3Preview(){
    MiBox3()
}