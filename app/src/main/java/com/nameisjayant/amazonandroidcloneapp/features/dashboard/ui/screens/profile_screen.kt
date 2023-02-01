package com.nameisjayant.amazonandroidcloneapp.features.dashboard.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.amazonandroidcloneapp.common.AppIconButtonFromImageVector
import com.nameisjayant.amazonandroidcloneapp.common.SpacerHeight
import com.nameisjayant.amazonandroidcloneapp.common.SpacerWidth
import com.nameisjayant.amazonandroidcloneapp.ui.theme.HeaderColor


@Composable
fun ProfileScreen() {

    val username = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = 20.sp,
                color = Color.Black
            )
        ) {
            append("Hello,")
        }
        withStyle(
            style = SpanStyle(
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
        ) {
            append(" Jayant")
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(HeaderColor)
            ) {
                Column(
                    modifier = Modifier.padding(15.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = com.nameisjayant.amazonandroidcloneapp.R.drawable.amazon_logo),
                            contentDescription = "",
                            modifier = Modifier
                                .width(100.dp)
                        )

                        Row(
                            modifier = Modifier.align(CenterVertically)
                        ) {
                            Box {
                                AppIconButtonFromImageVector(icon = Icons.Outlined.Notifications) {}
                                Box(
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .size(6.dp)
                                        .align(Alignment.TopEnd)
                                        .clip(CircleShape)
                                        .background(
                                            Color.Red
                                        )
                                )
                            }
                            SpacerWidth(10.dp)
                            AppIconButtonFromImageVector(icon = Icons.Default.Search) {

                            }
                        }
                    }
                    SpacerHeight(15.dp)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = username, modifier = Modifier.align(CenterVertically))
                        AppIconButtonFromImageVector(
                            icon = Icons.Outlined.Person,
                            modifier = Modifier.size(40.dp),
                            tint = Color.White
                        ) {

                        }
                    }
                }
            }
        }

    }

}