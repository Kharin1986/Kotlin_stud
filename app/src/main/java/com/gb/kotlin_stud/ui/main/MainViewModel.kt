package com.gb.kotlin_stud.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gb.kotlin_stud.data.NotesRepository

class MainViewModel:ViewModel(){
    var count=0
    private val viewStateLiveData = MutableLiveData<MainViewState>()
    init {
        viewStateLiveData.value= MainViewState(NotesRepository.getNotes())
    }
    fun viewState(): LiveData<MainViewState> = viewStateLiveData

}