package com.example.practiseviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelDemo : ViewModel(){
//    var count =0
    var count =MutableLiveData<Int>()

    init {
        count.value =0
    }
    fun updateCount(){

//        count++
        count.value =(count.value)?.plus(1)

    }
}