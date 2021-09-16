package com.company.triviaapp.presentation

import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.company.triviaapp.domain.SpeechHelper
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.channels.ChannelResult.Companion.success
import kotlin.Result.Companion.success

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    lateinit var speechHelper: SpeechHelper
    @ExperimentalAnimationApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            speechHelper = SpeechHelper(this)
            // https://proandroiddev.com/jetpack-compose-navigation-architecture-with-viewmodels-1de467f19e1c
            // https://developer.android.com/jetpack/compose/navigation#getting-started
            // https://proandroiddev.com/exploring-jetpack-compose-with-dagger-hilt-and-viewmodels-3e0ca939daa7
                val navController = rememberAnimatedNavController()
                // Invoke Navigation, which contains NavHost with routes for each of our screens
                Navigation(navController, speechHelper)
            }
    }
}

// Previews are non-functional for now, will come back to
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
}