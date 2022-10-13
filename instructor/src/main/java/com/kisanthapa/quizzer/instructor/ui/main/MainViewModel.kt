package com.kisanthapa.quizzer.instructor.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _mainText: MutableLiveData<String> = MutableLiveData()
    val mainText: LiveData<String>
        get() = _mainText

    init {
        _mainText.value = "Hello World from View Model!"
    }

}