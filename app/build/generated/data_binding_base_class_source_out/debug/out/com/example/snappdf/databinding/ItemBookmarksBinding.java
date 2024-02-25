// Generated by view binder compiler. Do not edit!
package com.example.snappdf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.snappdf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemBookmarksBinding implements ViewBinding {
  @NonNull
  private final MaterialButton rootView;

  @NonNull
  public final MaterialButton mBtnBookmark;

  private ItemBookmarksBinding(@NonNull MaterialButton rootView,
      @NonNull MaterialButton mBtnBookmark) {
    this.rootView = rootView;
    this.mBtnBookmark = mBtnBookmark;
  }

  @Override
  @NonNull
  public MaterialButton getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBookmarksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBookmarksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_bookmarks, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBookmarksBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    MaterialButton mBtnBookmark = (MaterialButton) rootView;

    return new ItemBookmarksBinding((MaterialButton) rootView, mBtnBookmark);
  }
}