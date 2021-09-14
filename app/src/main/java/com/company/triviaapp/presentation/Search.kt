package com.company.triviaapp.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.company.triviaapp.presentation.theme.roboto

@Composable
fun SearchScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Current Quiz Status
        Box(modifier = Modifier.padding(horizontal = 20.dp)) {
            Column(
                //  verticalArrangement = Arrangement.Center,
                //  horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(state = rememberScrollState())
            ) {
                Text(
                    text = "Search",
                    color = MaterialTheme.colors.onBackground,
                    fontFamily = roboto,
                    fontSize = 33.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    text = "Coming Soon",
                    color = MaterialTheme.colors.secondary,
                    fontFamily = roboto,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(top = 2.dp, end = 10.dp, bottom = 5.dp)
                )
            }
        }
    }
}


