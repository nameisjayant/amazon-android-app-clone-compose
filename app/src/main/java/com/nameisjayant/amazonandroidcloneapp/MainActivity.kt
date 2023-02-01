package com.nameisjayant.amazonandroidcloneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nameisjayant.amazonandroidcloneapp.features.dashboard.ui.screens.HomeScreen
import com.nameisjayant.amazonandroidcloneapp.features.dashboard.ui.screens.ProfileScreen
import com.nameisjayant.amazonandroidcloneapp.ui.theme.AmazonAndroidCloneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmazonAndroidCloneAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProfileScreen()
                }
            }
        }
    }
}
