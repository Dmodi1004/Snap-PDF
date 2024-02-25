package com.example.snappdf.ViewModels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/example/snappdf/ViewModels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/snappdf/Repository/MainRepo;", "(Lcom/example/snappdf/Repository/MainRepo;)V", "homeLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/snappdf/Utils/MyResponses;", "Ljava/util/ArrayList;", "Lcom/example/snappdf/Models/HomeModel;", "getHomeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getRepo", "()Lcom/example/snappdf/Repository/MainRepo;", "getHomeData", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.snappdf.Repository.MainRepo repo = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.snappdf.Repository.MainRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.snappdf.Repository.MainRepo getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.snappdf.Utils.MyResponses<java.util.ArrayList<com.example.snappdf.Models.HomeModel>>> getHomeLiveData() {
        return null;
    }
    
    public final void getHomeData() {
    }
}