package com.example.snappdf.Utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0010\u0011\u0012B)\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/snappdf/Utils/MyResponses;", "T", "", "data", "errorMessage", "", "progress", "", "(Ljava/lang/Object;Ljava/lang/String;I)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorMessage", "()Ljava/lang/String;", "getProgress", "()I", "Error", "Loading", "Success", "Lcom/example/snappdf/Utils/MyResponses$Error;", "Lcom/example/snappdf/Utils/MyResponses$Loading;", "Lcom/example/snappdf/Utils/MyResponses$Success;", "app_debug"})
public abstract class MyResponses<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable
    private final T data = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errorMessage = null;
    private final int progress = 0;
    
    private MyResponses(T data, java.lang.String errorMessage, int progress) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final int getProgress() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/snappdf/Utils/MyResponses$Error;", "T", "Lcom/example/snappdf/Utils/MyResponses;", "mErrMessage", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.example.snappdf.Utils.MyResponses<T> {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String mErrMessage = null;
        
        public Error(@org.jetbrains.annotations.Nullable
        java.lang.String mErrMessage) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/snappdf/Utils/MyResponses$Loading;", "T", "Lcom/example/snappdf/Utils/MyResponses;", "mProgress", "", "(I)V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.example.snappdf.Utils.MyResponses<T> {
        private final int mProgress = 0;
        
        public Loading(int mProgress) {
        }
        
        public Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/snappdf/Utils/MyResponses$Success;", "T", "Lcom/example/snappdf/Utils/MyResponses;", "mData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.example.snappdf.Utils.MyResponses<T> {
        @org.jetbrains.annotations.Nullable
        private final T mData = null;
        
        public Success(@org.jetbrains.annotations.Nullable
        T mData) {
        }
    }
}