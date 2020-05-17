package com.example.advancedrecycler

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advancedrecycler.data.ColorRepository
import com.example.advancedrecycler.model.ColorItem

class MainActivityViewModel : ViewModel(){
    private val colorRepository = ColorRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}