package com.example.snappdf.Fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.snappdf.PdfActivity

class ToolsViewModelFactory(private val activity: PdfActivity): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return ToolsViewModel(activity) as T
    }
}