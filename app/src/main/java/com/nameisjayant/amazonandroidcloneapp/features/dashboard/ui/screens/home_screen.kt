package com.nameisjayant.amazonandroidcloneapp.features.dashboard.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nameisjayant.amazonandroidcloneapp.common.AppIconButtonFromImageVector
import com.nameisjayant.amazonandroidcloneapp.common.AppSearchView


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen() {

    var search by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan.copy(alpha = 0.2f))
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
                modifier = Modifier.align(CenterVertically).padding(end = 5.dp)
            ) {

            }

        }
    }


}

