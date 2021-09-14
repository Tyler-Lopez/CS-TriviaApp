package com.company.triviaapp.presentation

import androidx.compose.animation.*
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.company.triviaapp.data.courses.datastructures.DataStructures
import com.company.triviaapp.rememberSwipeState
import com.company.triviaapp.swiper
import com.company.triviaapp.presentation.theme.roboto
import kotlin.math.roundToInt


@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun FlashcardView(navController: NavController, listID: String?, index: Int, onSwiped: () -> Unit) {

    val list = remember {
        sections[listID]?.shuffled() ?: DataStructures().chapterOne.shuffled()
    }

    var activeState = remember {
        mutableStateOf(value = 0)
    }

    var slideLeft = remember {
        mutableStateOf(value = false)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Current Quiz Status

        Box(modifier = Modifier.padding(horizontal = 20.dp)) {
            Column() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(75.dp)
                        .padding(top = 15.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        //        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(end = 4.dp)
                            .border(
                                width = 3.dp,
                                color = Color(26, 29, 40, 100),
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = {
                            navController.navigate(Screen.MainScreen.route)
                        }) {
                        Icon(
                            Icons.Rounded.Edit,
                            contentDescription = "HOME",
                            modifier = Modifier.fillMaxSize(),
                            tint = MaterialTheme.colors.onSurface,
                        )
                    }
                    Button(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(horizontal = 4.dp)
                            .border(
                                width = 3.dp,
                                color = Color(26, 29, 40, 100),
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondaryVariant),
                        onClick = {
                            slideLeft.value = false
                            activeState.value = safeDecrement(list, activeState.value)
                        }) {
                        Icon(
                            Icons.Rounded.KeyboardArrowLeft,
                            contentDescription = "BACK",
                            modifier = Modifier.size(160.dp),
                            tint = MaterialTheme.colors.onSecondary,
                        )
                    }
                    Button(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(start = 4.dp)
                            .border(
                                width = 3.dp,
                                color = Color(26, 29, 40, 100),
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondaryVariant),
                        onClick = {
                            slideLeft.value = true
                            activeState.value = safeIncrement(list, activeState.value)
                        }) {
                        Icon(
                            Icons.Rounded.KeyboardArrowRight,
                            contentDescription = "NEXT",
                            modifier = Modifier.fillMaxSize(),
                            tint = MaterialTheme.colors.onSecondary,
                        )
                    }
                }
                // FLASHCARD SECTION
                Box(modifier = Modifier.fillMaxSize()) {

                    /*

                    Much work left to do on animation still

                    Come back to this! Make it so the flashcard is seen behind and it doesnt animate into the padding



                    // https://developer.android.com/jetpack/compose/animation#animatedcontent






                    FlashCardComposable(
                        list = list,
                        activeIndex = Pair(activeState.value + 1, list.size),
                        onIncrement = {
                            activeState.value = safeIncrement(list, activeState.value)
                        })
                     */
                    FlashCardComposableNonInteractable(
                        list = list,
                        activeIndex = Pair(safeIncrement(list, index), list.size)
                    )
                    FlashCardComposableTEST(
                        list = list,
                        activeIndex = Pair(index + 1, list.size),
                        onIncrement = {
                            navController.navigate(Screen.FlashCard.withArgs(listID!!))
                            //activeState.value = safeIncrement(list, activeState.value)
                        })
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun FlashCardComposableTEST(
    list: List<Pair<String, String>>,
    activeIndex: Pair<Int, Int>,
    onIncrement: (Unit) -> Unit
) {
    // Used to remove clickable effect https://stackoverflow.com/questions/66703448/how-to-disable-ripple-effect-when-clicking-in-jetpack-compose
    val interactionSource = remember { MutableInteractionSource() }

    var isQuestion = remember { mutableStateOf(value = true) }

    // Some variables based on if it is or is not a question
    val text = if (isQuestion.value)
        list[activeIndex.first - 1].first // Question Text
    else
        list[activeIndex.first - 1].second // Answer Text
    val textColor = if (isQuestion.value)
        MaterialTheme.colors.onSurface
    else
        MaterialTheme.colors.onSecondary
    val fontWeight = if (isQuestion.value)
        FontWeight.Medium
    else
        FontWeight.Medium


    /*

     Swipe implementation experiment

     If an animation is running, and that animation's target value is NOT the 0 initial spot, then progress to next card

     */
    val swiped = remember { mutableStateOf(false) }


    BoxWithConstraints() {
        val swipeState = rememberSwipeState(
            maxWidth = constraints.maxWidth.toFloat(),
            maxHeight = constraints.maxHeight.toFloat()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .swiper(
                    state = swipeState,
                    onDragAccepted = {
                        swiped.value = true
                        onIncrement(Unit)
                    },
                ),
        ) {
            Card(
                modifier = Modifier
                    //.fillMaxSize()
                    .padding(top = 10.dp, bottom = 20.dp)
                    .border(
                        width = 3.dp,
                        color = Color(26, 29, 40, 100),
                    )
                    .clickable(
                        interactionSource = interactionSource,
                        indication = null
                    ) { isQuestion.value = !isQuestion.value },
                elevation = 5.dp,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.surface)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(
                            text = text,
                            color = textColor,
                            fontSize = 28.sp,
                            fontWeight = fontWeight,
                            fontFamily = roboto,
                            modifier = Modifier.padding(20.dp),
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.h4.copy(
                                shadow = Shadow(
                                    color = Color(0.1f, 0.1f, 0.1f, 0.7f),
                                    offset = Offset(3f, 3f),
                                    blurRadius = 5f
                                )
                            ),
                        )
                    }
                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Card(
                            shape = RoundedCornerShape(12.dp),
                            backgroundColor = MaterialTheme.colors.background,
                            modifier = Modifier
                                .padding(10.dp),
                        ) {
                            Text(
                                text = "${activeIndex.first} / ${activeIndex.second}", // Example: 12/45 cards
                                color = MaterialTheme.colors.primary,
                                fontSize = 18.sp,
                                fontFamily = roboto,
                                fontWeight = FontWeight.Bold,
                                style = MaterialTheme.typography.h4.copy(
                                    shadow = Shadow(
                                        color = Color(0.05f, 0.05f, 0.05f, 0.1f),
                                        offset = Offset(4f, 4f),
                                        blurRadius = 2f
                                    )
                                ),
                                modifier = Modifier.padding(
                                    vertical = 6.dp,
                                    horizontal = 6.dp
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun FlashCardComposable(
    list: List<Pair<String, String>>,
    activeIndex: Pair<Int, Int>,
    onIncrement: (Unit) -> Unit
) {
    // Used to remove clickable effect https://stackoverflow.com/questions/66703448/how-to-disable-ripple-effect-when-clicking-in-jetpack-compose
    val interactionSource = remember { MutableInteractionSource() }

    var isQuestion = remember { mutableStateOf(value = true) }

    // Some variables based on if it is or is not a question
    val text = if (isQuestion.value)
        list[activeIndex.first - 1].first // Question Text
    else
        list[activeIndex.first - 1].second // Answer Text
    val textColor = if (isQuestion.value)
        MaterialTheme.colors.onSurface
    else
        MaterialTheme.colors.onSecondary
    val fontWeight = if (isQuestion.value)
        FontWeight.Medium
    else
        FontWeight.Medium


    /*

     Swipe implementation experiment

     If an animation is running, and that animation's target value is NOT the 0 initial spot, then progress to next card

     */
    var swipeableState = rememberSwipeableState(initialValue = 0)
    val sizePxLeft = with(LocalDensity.current) { -200.dp.toPx() } // This is spaghetti code
    val sizePx = with(LocalDensity.current) { 200.dp.toPx() }
    val anchors =
        mapOf(sizePxLeft to -1, 0f to 0, sizePx to 1) // Maps anchor points (in px) to states
    println(swipeableState.offset.value)
    // This iswhat actual detects if a swipe has taken place
    if (swipeableState.isAnimationRunning && swipeableState.targetValue != 0) {
        // https://developer.android.com/jetpack/compose/side-effects
        LaunchedEffect(swipeableState) {
            isQuestion.value = true
            onIncrement(Unit)
            swipeableState.snapTo(0)
        }
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .swipeable(
            state = swipeableState,
            anchors = anchors,
            thresholds = { _, _ -> FractionalThreshold(0.3f) },
            orientation = Orientation.Horizontal
        )
        .offset { IntOffset(swipeableState.offset.value.roundToInt(), 0) }
    ) {
        Card(
            modifier = Modifier
                //.fillMaxSize()
                .padding(top = 10.dp, bottom = 20.dp)
                .border(
                    width = 3.dp,
                    color = Color(26, 29, 40, 100),
                )
                .clickable(
                    interactionSource = interactionSource,
                    indication = null
                ) { isQuestion.value = !isQuestion.value },
            elevation = 5.dp,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.surface)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(
                        text = text,
                        color = textColor,
                        fontSize = 28.sp,
                        fontWeight = fontWeight,
                        fontFamily = roboto,
                        modifier = Modifier.padding(20.dp),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.h4.copy(
                            shadow = Shadow(
                                color = Color(0.1f, 0.1f, 0.1f, 0.7f),
                                offset = Offset(3f, 3f),
                                blurRadius = 5f
                            )
                        ),
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = MaterialTheme.colors.background,
                        modifier = Modifier
                            .padding(10.dp),
                    ) {
                        Text(
                            text = "${activeIndex.first} / ${activeIndex.second}", // Example: 12/45 cards
                            color = MaterialTheme.colors.primary,
                            fontSize = 18.sp,
                            fontFamily = roboto,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h4.copy(
                                shadow = Shadow(
                                    color = Color(0.05f, 0.05f, 0.05f, 0.1f),
                                    offset = Offset(4f, 4f),
                                    blurRadius = 2f
                                )
                            ),
                            modifier = Modifier.padding(
                                vertical = 6.dp,
                                horizontal = 6.dp
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FlashCardComposableNonInteractable(
    list: List<Pair<String, String>>,
    activeIndex: Pair<Int, Int>,
) {
    val text = list[activeIndex.first].first // Question Text

    val textColor = MaterialTheme.colors.onSurface

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                //.fillMaxSize()
                .padding(top = 10.dp, bottom = 20.dp)
                .border(
                    width = 3.dp,
                    color = Color(26, 29, 40, 100),
                ),
            elevation = 5.dp,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.surface)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(
                        text = text,
                        color = textColor,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = roboto,
                        modifier = Modifier.padding(20.dp),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.h4.copy(
                            shadow = Shadow(
                                color = Color(0.1f, 0.1f, 0.1f, 0.7f),
                                offset = Offset(3f, 3f),
                                blurRadius = 5f
                            )
                        ),
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0.1f, 0.1f, 0.1f, 0.5f))
                ) {
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = MaterialTheme.colors.background,
                        modifier = Modifier
                            .padding(10.dp),
                    ) {
                        Text(
                            text = "${activeIndex.first + 1} / ${activeIndex.second}", // Example: 12/45 cards
                            color = MaterialTheme.colors.primary,
                            fontSize = 18.sp,
                            fontFamily = roboto,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h4.copy(
                                shadow = Shadow(
                                    color = Color(0.05f, 0.05f, 0.05f, 0.1f),
                                    offset = Offset(4f, 4f),
                                    blurRadius = 2f
                                )
                            ),
                            modifier = Modifier.padding(
                                vertical = 6.dp,
                                horizontal = 6.dp
                            )
                        )
                    }
                }
            }
        }
    }

}

fun safeIncrement(array: List<Any>, currentIndex: Int): Int {
    return when (currentIndex) {
        array.lastIndex -> 0
        else -> currentIndex + 1
    }
}

fun safeDecrement(array: List<Any>, currentIndex: Int): Int {
    return when (currentIndex) {
        0 -> array.lastIndex
        else -> currentIndex - 1
    }
}