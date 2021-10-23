package com.marysugar.count_app_with_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<CountViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountUp(viewModel = viewModel)
        }
    }
}

/**
 * カウントアップボタンとカウントの回数を表示する
 */
@Composable
fun CountUp(viewModel: CountViewModel) {
    val count: Int by viewModel.count
    
    Column {
        Text(text = "$count")
        Button(onClick = {
            viewModel.onCountUpTapped()
        }
        ) {
            Text(
                text = "Count Up!"
            )
        }
    }
}