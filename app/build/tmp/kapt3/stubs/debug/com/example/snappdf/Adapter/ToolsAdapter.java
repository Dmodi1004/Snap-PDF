package com.example.snappdf.Adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001)B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\u001c\u0010\"\u001a\u00020 2\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\u001eH\u0016J\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001eH\u0016R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/example/snappdf/Adapter/ToolsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/snappdf/Adapter/ToolsAdapter$ViewHolder;", "list", "", "Lcom/example/snappdf/Models/ToolsModel;", "viewModel", "Lcom/example/snappdf/Fragments/ToolsViewModel;", "fragment", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "context", "Landroid/content/Context;", "(Ljava/util/List;Lcom/example/snappdf/Fragments/ToolsViewModel;Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;Landroid/content/Context;)V", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getFragment", "()Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "setFragment", "(Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;)V", "getViewModel", "()Lcom/example/snappdf/Fragments/ToolsViewModel;", "setViewModel", "(Lcom/example/snappdf/Fragments/ToolsViewModel;)V", "getItemCount", "", "handleClickEvent", "", "model", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ToolsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.snappdf.Adapter.ToolsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.snappdf.Models.ToolsModel> list;
    @org.jetbrains.annotations.NotNull
    private com.example.snappdf.Fragments.ToolsViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    private com.google.android.material.bottomsheet.BottomSheetDialogFragment fragment;
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    public ToolsAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.snappdf.Models.ToolsModel> list, @org.jetbrains.annotations.NotNull
    com.example.snappdf.Fragments.ToolsViewModel viewModel, @org.jetbrains.annotations.NotNull
    com.google.android.material.bottomsheet.BottomSheetDialogFragment fragment, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.snappdf.Fragments.ToolsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.example.snappdf.Fragments.ToolsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.bottomsheet.BottomSheetDialogFragment getFragment() {
        return null;
    }
    
    public final void setFragment(@org.jetbrains.annotations.NotNull
    com.google.android.material.bottomsheet.BottomSheetDialogFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    private final void handleClickEvent(com.example.snappdf.Models.ToolsModel model) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.snappdf.Adapter.ToolsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.snappdf.Adapter.ToolsAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/snappdf/Adapter/ToolsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/snappdf/databinding/ItemToolBinding;", "(Lcom/example/snappdf/Adapter/ToolsAdapter;Lcom/example/snappdf/databinding/ItemToolBinding;)V", "bind", "", "model", "Lcom/example/snappdf/Models/ToolsModel;", "context", "Landroid/content/Context;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.snappdf.databinding.ItemToolBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.snappdf.databinding.ItemToolBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.snappdf.Models.ToolsModel model, @org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
}