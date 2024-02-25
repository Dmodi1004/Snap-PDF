package com.example.snappdf.DAOs

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.snappdf.Entities.BookmarksEntity

@Dao
interface BookmarksDao {

    @Query("SELECT * FROM bookmarks WHERE bookId == :bookId")
    suspend fun getBookmarks(bookId: String): List<BookmarksEntity>

    @Insert
    suspend fun addBookmarks(entity: BookmarksEntity)

}