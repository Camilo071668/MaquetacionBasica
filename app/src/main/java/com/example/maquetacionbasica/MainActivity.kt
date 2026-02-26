package com.example.maquetacionbasica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.maquetacionbasica.ui.theme.MaquetacionBasicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}
//Primera actividad
@Preview(showSystemUi = true)
@Composable
fun PrimeraActividad (){
    Text("Hola mundo")
}

// Segunda actividad
@Preview(showSystemUi = true)
@Composable
fun SegundaActividad (){
    Text("Hola mundo")
}

// Tercera actividad
@Preview(showSystemUi = true)
@Composable
fun TerceraActividad (){
    Text("Hola mundo")
}