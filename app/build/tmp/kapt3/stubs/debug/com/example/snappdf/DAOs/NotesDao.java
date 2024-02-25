package com.example.snappdf.DAOs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/snappdf/DAOs/NotesDao;", "", "addNotes", "", "entity", "Lcom/example/snappdf/Entities/NotesEntity;", "(Lcom/example/snappdf/Entities/NotesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "", "bookId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface NotesDao {
    
    @androidx.room.Query(value = "SELECT * FROM notes WHERE bookId == :bookId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNotes(@org.jetbrains.annotations.NotNull
    java.lang.String bookId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.snappdf.Entities.NotesEntity>> $completion);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addNotes(@org.jetbrains.annotations.NotNull
    com.example.snappdf.Entities.NotesEntity entity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}