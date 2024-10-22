package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class cl1 {
    public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
        return popupWindow.getMaxAvailableHeight(view, i, z);
    }
}
