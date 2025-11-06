package com.example.tugasnavigation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.tugasnavigation.R

@Composable
fun TampilData(navController: NavHostController) {
    val pesertaList = stringArrayResource(id = R.array.data_peserta)
    val gradient = Brush.verticalGradient(
        colors = listOf(Color(0xFFBB86FC), Color(0xFFEFB8C8))
    )


}
