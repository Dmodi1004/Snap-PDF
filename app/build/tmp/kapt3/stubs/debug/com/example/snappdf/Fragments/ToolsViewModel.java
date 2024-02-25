package com.example.snappdf.Fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/snappdf/Fragments/ToolsViewModel;", "Landroidx/lifecycle/ViewModel;", "pdfActivity", "Lcom/example/snappdf/PdfActivity;", "(Lcom/example/snappdf/PdfActivity;)V", "database", "Lcom/example/snappdf/AppDatabase;", "getDatabase", "()Lcom/example/snappdf/AppDatabase;", "nightMode", "", "getPdfActivity", "()Lcom/example/snappdf/PdfActivity;", "addBookmark", "", "addNote", "note", "", "jumpToPage", "pageNub", "", "toggleNightMode", "app_debug"})
public final class ToolsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.snappdf.PdfActivity pdfActivity = null;
    private boolean nightMode = false;
    @org.jetbrains.annotations.Nullable
    private final com.example.snappdf.AppDatabase database = null;
    
    public ToolsViewModel(@org.jetbrains.annotations.NotNull
    com.example.snappdf.PdfActivity pdfActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.snappdf.PdfActivity getPdfActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.snappdf.AppDatabase getDatabase() {
        return null;
    }
    
    public final void toggleNightMode() {
    }
    
    public final void jumpToPage(int pageNub) {
    }
    
    public final void addBookmark() {
    }
    
    public final void addNote(@org.jetbrains.annotations.NotNull
    java.lang.String note) {
    }
}