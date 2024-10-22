package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class f73 extends l2 {
    public final TextInputLayout d;

    public f73(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        CharSequence charSequence;
        boolean z;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean z2 = !TextUtils.isEmpty(charSequence);
        boolean z3 = !TextUtils.isEmpty(hint);
        boolean z4 = !textInputLayout.F0;
        boolean z5 = !TextUtils.isEmpty(error);
        if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
            z = false;
        } else {
            z = true;
        }
        if (z3) {
            str = hint.toString();
        } else {
            str = "";
        }
        u03 u03Var = textInputLayout.f1561b;
        AppCompatTextView appCompatTextView = u03Var.f4610b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            accessibilityNodeInfo.setTraversalAfter(u03Var.d);
        }
        if (z2) {
            g3Var.k(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            g3Var.k(str);
            if (z4 && placeholderText != null) {
                g3Var.k(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            g3Var.k(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                g3Var.j(str);
            } else {
                if (z2) {
                    str = ((Object) charSequence) + ", " + str;
                }
                g3Var.k(str);
            }
            boolean z6 = true ^ z2;
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(z6);
            } else {
                g3Var.h(4, z6);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z) {
            if (!z5) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.j.y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.c.b().n(g3Var);
    }

    @Override // defpackage.l2
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.c.b().o(accessibilityEvent);
    }
}
