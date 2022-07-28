package com.gamecrawl.mutablestatelist

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel: ViewModel() {
    private val _listOfElements: MutableList<Int> = mutableStateListOf()
    val listOfElements: MutableList<Int> = _listOfElements

    fun addElement() {
        val randomElement = Random.nextInt(from = 0, until = 100)
        _listOfElements.add(randomElement)

        Log.d("test", "Added element: ${_listOfElements}")
    }
}
