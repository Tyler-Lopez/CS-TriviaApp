package com.company.triviaapp.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
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
fun SettingsScreen(navController: NavController, onToggleTheme: (Unit) -> Unit) {
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
                    text = "Settings",
                    color = MaterialTheme.colors.onBackground,
                    fontFamily = roboto,
                    fontSize = 33.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    text = "More Coming Soon",
                    fontFamily = roboto,
                    color = MaterialTheme.colors.secondary,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(top = 2.dp, end = 10.dp, bottom = 5.dp)
                )
                Button(
                    onClick = {
                        onToggleTheme(Unit)
                    }, colors = buttonColors(backgroundColor = MaterialTheme.colors.surface)
                ) {
                    Text(
                        text = "Toggle Dark Mode", fontSize = 25.sp, color = MaterialTheme.colors.onSurface,
                    )
                }
            }
        }
    }
}


