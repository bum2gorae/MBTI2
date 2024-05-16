package com.example.mbti2

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.mbti2.ui.theme.MBTI2Theme

class SubActivity_2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTI2Theme {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val context = LocalContext.current as? Activity
                    var mbtiTitle = getString(intent.getIntExtra("mbtiName", -1))
                    var mbtiBody = getString(intent.getIntExtra("mbtiDescribe", -1))
                    Text(text = mbtiTitle)
                    Spacer(modifier = Modifier.size(50.dp))
                    Text(text = mbtiBody)
                    Button(onClick = { context?.finish() }) {
                        Text(text = "닫기")
                }
                }
            }
        }
    }
}