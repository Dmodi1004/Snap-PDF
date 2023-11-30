// Generated by view binder compiler. Do not edit!
package com.example.snappdf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snappdf.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailsBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView authorName;

  @NonNull
  public final TextView bookDesc;

  @NonNull
  public final TextView bookDescText;

  @NonNull
  public final ImageView bookImage;

  @NonNull
  public final TextView bookTitle;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final MaterialCardView materialCardView;

  @NonNull
  public final MaterialDivider materialDivider;

  @NonNull
  public final MaterialCardView playAudio;

  @NonNull
  public final MaterialButton readBook;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  private ActivityDetailsBinding(@NonNull NestedScrollView rootView, @NonNull TextView authorName,
      @NonNull TextView bookDesc, @NonNull TextView bookDescText, @NonNull ImageView bookImage,
      @NonNull TextView bookTitle, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout,
      @NonNull MaterialCardView materialCardView, @NonNull MaterialDivider materialDivider,
      @NonNull MaterialCardView playAudio, @NonNull MaterialButton readBook, @NonNull View view,
      @NonNull View view2) {
    this.rootView = rootView;
    this.authorName = authorName;
    this.bookDesc = bookDesc;
    this.bookDescText = bookDescText;
    this.bookImage = bookImage;
    this.bookTitle = bookTitle;
    this.imageView = imageView;
    this.linearLayout = linearLayout;
    this.materialCardView = materialCardView;
    this.materialDivider = materialDivider;
    this.playAudio = playAudio;
    this.readBook = readBook;
    this.view = view;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.authorName;
      TextView authorName = ViewBindings.findChildViewById(rootView, id);
      if (authorName == null) {
        break missingId;
      }

      id = R.id.bookDesc;
      TextView bookDesc = ViewBindings.findChildViewById(rootView, id);
      if (bookDesc == null) {
        break missingId;
      }

      id = R.id.bookDescText;
      TextView bookDescText = ViewBindings.findChildViewById(rootView, id);
      if (bookDescText == null) {
        break missingId;
      }

      id = R.id.bookImage;
      ImageView bookImage = ViewBindings.findChildViewById(rootView, id);
      if (bookImage == null) {
        break missingId;
      }

      id = R.id.bookTitle;
      TextView bookTitle = ViewBindings.findChildViewById(rootView, id);
      if (bookTitle == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.materialCardView;
      MaterialCardView materialCardView = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView == null) {
        break missingId;
      }

      id = R.id.materialDivider;
      MaterialDivider materialDivider = ViewBindings.findChildViewById(rootView, id);
      if (materialDivider == null) {
        break missingId;
      }

      id = R.id.playAudio;
      MaterialCardView playAudio = ViewBindings.findChildViewById(rootView, id);
      if (playAudio == null) {
        break missingId;
      }

      id = R.id.readBook;
      MaterialButton readBook = ViewBindings.findChildViewById(rootView, id);
      if (readBook == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityDetailsBinding((NestedScrollView) rootView, authorName, bookDesc,
          bookDescText, bookImage, bookTitle, imageView, linearLayout, materialCardView,
          materialDivider, playAudio, readBook, view, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}