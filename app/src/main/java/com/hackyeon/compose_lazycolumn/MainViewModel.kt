package com.hackyeon.compose_lazycolumn

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var _list = mutableStateListOf<MainItem>()
    val list: List<MainItem> = _list

    var count = 0

    fun add() {
        _list.add(MainItem(count, "name $count"))
        count++
    }


}