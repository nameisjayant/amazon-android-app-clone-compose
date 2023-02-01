package com.nameisjayant.amazonandroidcloneapp.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val HeaderColor = Brush.horizontalGradient(
    listOf(
        Teal200.copy(alpha = 0.9f),
        Teal200.copy(alpha = 0.6f),
        Teal200.copy(alpha = 0.3f)
    )
)