package com.company.triviaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.company.triviaapp.ui.theme.TriviaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                

            // Enclose content within a Box with a background corresponding with the theme for purposes of transitions
            Box(
                modifier = Modifier
                    .background(Color(19, 20, 27))
            ) {
                // Invoke Navigation, which contains NavHost
                Navigation()
              }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
}