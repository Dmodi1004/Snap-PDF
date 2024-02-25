package com.example.snappdf.Utils;

/**
 * Usage: ```SpringScrollHelper().attachToRecyclerView(recyclerView)```
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004J\b\u0010\u0013\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/snappdf/Utils/SpringScrollHelper;", "", "()V", "MAX_VELOCITY", "", "flingVx", "", "flingVy", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerViewFlingListener", "Landroidx/recyclerview/widget/RecyclerView$OnFlingListener;", "recyclerViewScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "attachToRecyclerView", "", "remove", "setMaxVelocity", "maxVelocity", "setup", "app_debug"})
public final class SpringScrollHelper {
    @org.jetbrains.annotations.Nullable
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private int flingVx = 0;
    private int flingVy = 0;
    private float MAX_VELOCITY = 2.0F;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView.OnFlingListener recyclerViewFlingListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener recyclerViewScrollListener = null;
    
    public SpringScrollHelper() {
        super();
    }
    
    /**
     * Adds a snappy spring effect to recyclerView.
     *
     * Passing null will remove it.
     */
    public final void attachToRecyclerView(@org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    public final void setMaxVelocity(float maxVelocity) {
    }
    
    private final void setup() {
    }
    
    private final void remove() {
    }
}