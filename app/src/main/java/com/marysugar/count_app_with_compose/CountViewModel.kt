package com.marysugar.count_app_with_compose

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountViewModel: ViewModel() {
    /**
     * カウントの回数を保持する
     */
    val count: MutableState<Int> = mutableStateOf(0)

    /**
     * カウントアップボタンのクリックイベントを処理する
     * [count]の値を1増やし、表示を更新する
     */
    fun onCountUpTapped() {
        val currentValue = requireNotNull(count.value)
        count.value = currentValue + 1
    }
}