package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00853a {
    public static final C3Z A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new EK();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new ZK();
        } else {
            A00 = new C3Z();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
