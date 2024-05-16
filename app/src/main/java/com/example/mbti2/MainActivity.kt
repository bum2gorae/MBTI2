package com.example.mbti2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.mbti2.ui.theme.MBTI2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTI2Theme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        Row {
            val context = LocalContext.current
            Button(onClick = {
                val intent = Intent(
                    context, SubActivity::class.java
                )
                context.startActivity(intent)
            }) {
                Text(text = "Sub1")
            }
        }
    }
}
