package com.octagon_technologies.covid19_statistics_app.ui.currentCountry

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CurrentCountryViewModelFactory(
    private val context: Context
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CurrentCountryViewModel::class.java)) {
            return CurrentCountryViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}