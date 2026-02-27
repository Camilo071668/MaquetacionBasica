package com.example.maquetacionbasica

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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip

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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFEFEF))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Tarjeta Blanca
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(16.dp))
        ) {

            //IMagen MAS icono
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ){
                Image(
                    painter = painterResource(id = R.drawable.computador),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                )

                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = Color.Yellow,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            //Column Textos

            Column {

                Text(
                    text = "Nombre del Producto",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "$99.99",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF00C853)
                )

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "Descripción del producto con detalles importantes, caracterisitcas y benficios",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Row botones
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Button(
                onClick = { },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6A1B9A)
                )
            ) {
                Icon(Icons.Default.Edit, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Editar")
            }

            Button(
                onClick = {  },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                )
            ) {
                Icon(Icons.Default.Delete, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Eliminar")

            }

        }

    }
}

// Segunda actividad
@Preview(showSystemUi = true)
@Composable
fun SegundaActividad (){
    Column() {
        Image(
            painter = painterResource(id= R.drawable.Background2),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 30.dp)
        )
        Text(
            text="Jetpack compose tutorial",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text="Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, nd intuitive Kotlin APIS.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify

        )
        Text(
            text="In this tutorial, you build a simple Ul component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the Ul's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

// Tercera actividad
@Preview(showSystemUi = true)
@Composable
fun TerceraActividad (){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2F2F2))
            .padding(16.dp)
    ) {

        // FOTO + NOMBRE + DESCRIPCIÓN
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Juan Camilo",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Desarrollador Android apasionado por la tecnología y el diseño.",
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ESTADÍSTICAS
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("150", fontWeight = FontWeight.Bold)
                    Text("Posts", fontSize = 12.sp)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("2.3K", fontWeight = FontWeight.Bold)
                    Text("Seguidores", fontSize = 12.sp)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("980", fontWeight = FontWeight.Bold)
                    Text("Likes", fontSize = 12.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // BOTONES (hechos con Box)
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {

                Box(
                    modifier = Modifier
                        .background(Color(0xFF6A1B9A))
                        .padding(horizontal = 32.dp, vertical = 10.dp)
                ) {
                    Text("Seguir", color = Color.White)
                }

                Box(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .padding(horizontal = 32.dp, vertical = 10.dp)
                ) {
                    Text("Mensaje")
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // INTERESES
        Text(
            text = "Intereses",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Column {

            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()) {

                Box(modifier = Modifier.background(Color.LightGray).padding(8.dp)) {
                    Text("Ciclismo")
                }

                Box(modifier = Modifier.background(Color.LightGray).padding(8.dp)) {
                    Text("Programación")
                }

                Box(modifier = Modifier.background(Color.LightGray).padding(8.dp)) {
                    Text("UI/UX")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()) {

                Box(modifier = Modifier.background(Color.LightGray).padding(8.dp)) {
                    Text("Música")
                }

                Box(modifier = Modifier.background(Color.LightGray).padding(8.dp)) {
                    Text("Viajes")
                }

                Box(modifier = Modifier.background(Color.LightGray).padding(8.dp)) {
                    Text("Gaming")
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // PROYECTOS RECIENTES
        Text(
            text = "Proyectos Recientes",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(8.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {

                Text(
                    text = "App de Ciclismo",
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Box(
                    modifier = Modifier
                        .background(Color(0xFF6A1B9A))
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text("Ver más", color = Color.White)
                }
            }
        }
    }
}