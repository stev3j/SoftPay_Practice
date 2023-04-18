package com.example.softpaypractice.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainFragmentViewModel : ViewModel() {
    private val _currentValue = MutableLiveData<Int>()

    // getter : 다른 곳에서 쓰이기 위한 변수
    val currentValue : LiveData<Int> get() = _currentValue

    init{
        _currentValue.value = 0
    }

    fun plusValue(){
        _currentValue.value = _currentValue.value?.plus(1)
    }
}