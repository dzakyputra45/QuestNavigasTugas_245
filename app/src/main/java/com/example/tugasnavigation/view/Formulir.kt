package com.example.tugasnavigation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Formulir(navController : NavHostController) {
    var nama by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    val genderOptions = listOf("Laki-laki", "Perempuan")
    val statusOptions = listOf("Janda", "Lajang", "Duda")

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F6F6)) // warna lembut abu muda
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Formulir Pendaftaran",
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .background(Color.Cyan)
                    .padding(vertical = 14.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "NAMA LENGKAP",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)
            )
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                label = { Text("Isian nama lengkap") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "JENIS KELAMIN",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)
            )
            genderOptions.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .selectable(
                            selected = jenisKelamin == item,
                            onClick = { jenisKelamin = item }
                        )
                        .padding(vertical = 4.dp)
                ) {
                    RadioButton(
                        selected = jenisKelamin == item,
                        onClick = { jenisKelamin = item }
                    )
                    Text(text = item)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "STATUS PERKAWINAN",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)
            )
            statusOptions.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .selectable(
                            selected = status == item,
                            onClick = { status = item }
                        )
                        .padding(vertical = 4.dp)
                ) {
                    RadioButton(
                        selected = status == item,
                        onClick = { status = item }
                    )
                    Text(text = item)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "ALAMAT",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)
            )
            OutlinedTextField(
                value = alamat,
                onValueChange = { alamat = it },
                label = { Text("Alamat") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))


            Button(
                onClick = {  },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
            ) {
                Text("Submit", fontSize = 18.sp, color = Color.White)
            }
        }
    }
}
