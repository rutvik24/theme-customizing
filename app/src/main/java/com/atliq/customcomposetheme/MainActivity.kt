package com.atliq.customcomposetheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.atliq.customcomposetheme.ui.LocalSpacing
import com.atliq.customcomposetheme.ui.spacing
import com.atliq.customcomposetheme.ui.theme.CustomComposeThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomComposeThemeTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.padding(
                        MaterialTheme.spacing.medium
//                      alternate
//                      LocalSpacing.current.medium
                    )
                ) {

                }
            }
        }
    }
}