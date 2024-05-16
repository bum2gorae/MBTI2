package com.example.mbti2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.mbti2.ui.theme.MBTI2Theme

class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTI2Theme {
                Column {
                    val context = LocalContext.current as? Activity
                    val mbtiList = MbtiEnum.values()
                    Text(text = " 새로운화면")
                    Row {
                        for (i in 1..mbtiList.size) {
                            var mbtiTitle = mbtiList[i-1].name
                            MbtiBtn(name = mbtiTitle, context)
                        }
                    }
                }
            }
        }
    }
    @Composable
    fun MbtiBtn(name: String, context: Activity?) {
        val mbtiKey =MbtiValue2(name).mbtiEnumStr
        val mbtiName = mbtiKey.getMbtiTitle()
        val mbtiDescribe = mbtiKey.getMbtiDescribe()
        Button(onClick = {
            val intent = Intent(
                context, SubActivity_2::class.java
            )
            intent.putExtra("mbtiName", mbtiName)
            intent.putExtra("mbtiDescribe", mbtiDescribe)
            context?.startActivity(intent)
        }) {
            Text(text = "$name")
        }
    }
}