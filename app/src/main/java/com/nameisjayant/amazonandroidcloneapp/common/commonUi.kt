package com.nameisjayant.amazonandroidcloneapp.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.amazonandroidcloneapp.R


@Composable
fun AppSearchView(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {

    BasicTextField(
        value = search,
        onValueChange = { onValueChange(it) },
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(8.dp))
        ,
        singleLine = true,
        cursorBrush = SolidColor(MaterialTheme.colors.primary),
        textStyle = LocalTextStyle.current.copy(
            color = MaterialTheme.colors.onSurface,
            fontSize = 16.sp
        ),
        decorationBox = { innerTextField ->
            Row(
                modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.Search, contentDescription = "")
                Box(Modifier.weight(1f).padding(start = 10.dp)) {
                    if (search.isEmpty()) Text(
                        "Search Amazon.in",
                        style = LocalTextStyle.current.copy(
                            color = Color.DarkGray,
                            fontSize = 14.sp,
                        )
                    )
                    innerTextField()
                }
                Icon(Icons.Default.QrCode, contentDescription = "")
            }
        }
    )


}

@Composable
fun AppIconButtonFromDrawable(
    modifier: Modifier = Modifier,
    icon: Int,
    tint: Color = Color.Unspecified,
    onClick: () -> Unit
) {
    IconButton(onClick = { onClick() }, modifier = modifier.size(24.dp)) {
        Icon(painter = painterResource(id = icon), contentDescription = "", tint = tint)
    }
}


@Composable
fun AppIconButtonFromImageVector(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    tint: Color = Color.Unspecified,
    onClick: () -> Unit
) {
    IconButton(onClick = { onClick() }, modifier = modifier.size(24.dp)) {
        Icon(imageVector = icon, contentDescription = "", tint = tint)
    }
}