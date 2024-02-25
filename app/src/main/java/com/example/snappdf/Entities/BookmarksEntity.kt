package com.example.snappdf.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("bookmarks")
data class BookmarksEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val bookId: String,
    val pageNub: Int
)