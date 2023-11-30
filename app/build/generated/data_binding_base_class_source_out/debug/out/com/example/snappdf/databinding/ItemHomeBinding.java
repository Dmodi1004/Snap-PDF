// Generated by view binder compiler. Do not edit!
package com.example.snappdf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snappdf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView categoryTitle;

  @NonNull
  public final RecyclerView childRvBooks;

  @NonNull
  public final MaterialButton seeAllBtn;

  private ItemHomeBinding(@NonNull ConstraintLayout rootView, @NonNull TextView categoryTitle,
      @NonNull RecyclerView childRvBooks, @NonNull MaterialButton seeAllBtn) {
    this.rootView = rootView;
    this.categoryTitle = categoryTitle;
    this.childRvBooks = childRvBooks;
    this.seeAllBtn = seeAllBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.categoryTitle;
      TextView categoryTitle = ViewBindings.findChildViewById(rootView, id);
      if (categoryTitle == null) {
        break missingId;
      }

      id = R.id.childRvBooks;
      RecyclerView childRvBooks = ViewBindings.findChildViewById(rootView, id);
      if (childRvBooks == null) {
        break missingId;
      }

      id = R.id.seeAllBtn;
      MaterialButton seeAllBtn = ViewBindings.findChildViewById(rootView, id);
      if (seeAllBtn == null) {
        break missingId;
      }

      return new ItemHomeBinding((ConstraintLayout) rootView, categoryTitle, childRvBooks,
          seeAllBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}