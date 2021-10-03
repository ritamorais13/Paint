// Generated by view binder compiler. Do not edit!
package com.example.paint.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.Button;
import android.widget.TextView;
import com.example.paint.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShowSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button10;

  @NonNull
  public final Button button11;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button7;

  @NonNull
  public final Button button8;

  @NonNull
  public final Button button9;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  private ActivityShowSettingsBinding(@NonNull ConstraintLayout rootView, @NonNull Button button10,
      @NonNull Button button11, @NonNull Button button3, @NonNull Button button4,
      @NonNull Button button5, @NonNull Button button6, @NonNull Button button7,
      @NonNull Button button8, @NonNull Button button9, @NonNull TextView textView2,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.button10 = button10;
    this.button11 = button11;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.button8 = button8;
    this.button9 = button9;
    this.textView2 = textView2;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShowSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShowSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_show_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShowSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button10;
      Button button10 = ViewBindings.findChildViewById(rootView, id);
      if (button10 == null) {
        break missingId;
      }

      id = R.id.button11;
      Button button11 = ViewBindings.findChildViewById(rootView, id);
      if (button11 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.button8;
      Button button8 = ViewBindings.findChildViewById(rootView, id);
      if (button8 == null) {
        break missingId;
      }

      id = R.id.button9;
      Button button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityShowSettingsBinding((ConstraintLayout) rootView, button10, button11,
          button3, button4, button5, button6, button7, button8, button9, textView2, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
