package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes2.dex */
public final class xw2 extends yo {
    public static final int[] B = {he2.snackbarButtonStyle, he2.snackbarTextViewStyle};
    public boolean A;
    public final AccessibilityManager z;

    public xw2(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
