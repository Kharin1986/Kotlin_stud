package com.gb.kotlin_stud

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel (val something:String="something"):ViewModel(){
    var count=0
    private val viewStateLiveData = MutableLiveData<String>()
    init {
        viewStateLiveData.value="Hello World!"
    }
    fun viewState(): LiveData<String> = viewStateLiveData
    fun buttonClick(){
        count++
        viewStateLiveData.value=count.toString()
    }
}