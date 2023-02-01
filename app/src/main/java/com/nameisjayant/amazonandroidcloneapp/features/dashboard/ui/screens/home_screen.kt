package com.nameisjayant.amazonandroidcloneapp.features.dashboard.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.LocationCity
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.amazonandroidcloneapp.common.AppIconButtonFromImageVector
import com.nameisjayant.amazonandroidcloneapp.common.AppSearchView
import com.nameisjayant.amazonandroidcloneapp.common.SpacerWidth
import com.nameisjayant.amazonandroidcloneapp.ui.theme.HeaderColor
import com.nameisjayant.amazonandroidcloneapp.ui.theme.Teal200


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen() {

    var search by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(HeaderColor)
            ) {
                AppSearchView(
                    search = search,
                    onValueChange = { search = it },
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(0.7f)
                )

                AppIconButtonFromImageVector(
                    icon = Icons.Default.Mic,
                    modifier = Modifier
                        .align(CenterVertically)
                        .padding(end = 5.dp)
                ) {

                }

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                Teal200.copy(alpha = 0.3f),
                                Teal200.copy(alpha = 0.2f),
                                Teal200.copy(alpha = 0.1f)
                            )
                        )
                    )
            ) {
                Row(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Icon(Icons.Outlined.LocationOn, contentDescription = "")
                    SpacerWidth()
                    Text(
                        text = "Delivery to Jayant - New Delhi 110033", style = LocalTextStyle.current.copy(
                            color = Color.Black,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                    )
                    Icon(Icons.Outlined.KeyboardArrowDown, contentDescription = "")
                }
            }
        }
    }


}

