package com.example.snappdf.Fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.snappdf.AppDatabase
import com.example.snappdf.Entities.BookmarksEntity
import com.example.snappdf.Entities.NotesEntity
import com.example.snappdf.PdfActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ToolsViewModel(val pdfActivity: PdfActivity) : ViewModel() {

    private var nightMode = false
    val database = AppDatabase.getDatabase(pdfActivity)

    fun toggleNightMode() {
        nightMode = !nightMode
        pdfActivity.binding.pdfView.setNightMode(nightMode)
    }

    fun jumpToPage(pageNub: Int) {
        pdfActivity.binding.pdfView.jumpTo(pageNub, true)
    }

    fun addBookmark() {
        CoroutineScope(Dispatchers.IO).launch {
            val entity =
                BookmarksEntity(0, pdfActivity.bookId, pdfActivity.binding.pdfView.currentPage)
            database?.bookmarksDao()?.addBookmarks(entity)
        }
    }

    fun addNote(note: String){
        CoroutineScope(Dispatchers.IO).launch {
            val entity = NotesEntity(0, pdfActivity.bookId, note)
            database?.notesDao()?.addNotes(entity)
        }
    }

}