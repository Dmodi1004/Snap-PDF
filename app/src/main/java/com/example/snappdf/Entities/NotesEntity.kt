package com.example.snappdf.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("notes")
data class NotesEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val bookId: String,
    val note: String
)