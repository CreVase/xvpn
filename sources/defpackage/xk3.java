package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public abstract class xk3 {
    public static int a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean b(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean c(View view) {
        return view.isLaidOut();
    }

    public static boolean d(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static void f(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static void g(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
