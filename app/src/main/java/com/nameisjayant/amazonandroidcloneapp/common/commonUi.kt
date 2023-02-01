package com.nameisjayant.amazonandroidcloneapp.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.nameisjayant.amazonandroidcloneapp.R


@Composable
fun AppSearchView(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.Gray)
    ) {
        TextField(
            value = search, onValueChange = { onValueChange(it) },
            placeholder = { Text(text = stringResource(R.string.search_amazon_in)) },
            leadingIcon = {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "",
                    tint = Color.DarkGray
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                Icon(
                    Icons.Default.QrCodeScanner,
                    contentDescription = "",
                    tint = Color.DarkGray
                )
            }
        )
    }

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