package com.example.snappdf.View;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/snappdf/View/BookViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/snappdf/Repository/BookRepo;", "(Lcom/example/snappdf/Repository/BookRepo;)V", "downloadLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/snappdf/Utils/MyResponses;", "Lcom/example/snappdf/Repository/BookRepo$DownloadModel;", "getDownloadLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getRepo", "()Lcom/example/snappdf/Repository/BookRepo;", "downloadFile", "", "url", "", "fileName", "app_debug"})
public final class BookViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.snappdf.Repository.BookRepo repo = null;
    
    public BookViewModel(@org.jetbrains.annotations.NotNull
    com.example.snappdf.Repository.BookRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.snappdf.Repository.BookRepo getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.snappdf.Utils.MyResponses<com.example.snappdf.Repository.BookRepo.DownloadModel>> getDownloadLiveData() {
        return null;
    }
    
    public final void downloadFile(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
    }
}