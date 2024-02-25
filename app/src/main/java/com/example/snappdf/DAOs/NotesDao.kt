package com.example.snappdf.DAOs

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.snappdf.Entities.BookmarksEntity
import com.example.snappdf.Entities.NotesEntity

@Dao
interface NotesDao {

    @Query("SELECT * FROM notes WHERE bookId == :bookId")
    suspend fun getNotes(bookId: String): List<NotesEntity>

    @Insert
    suspend fun addNotes(entity: NotesEntity)

}