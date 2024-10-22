package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.facebook.ads.redexgen.X.2u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00792u {
    public View.AccessibilityDelegate A00(final C00802v c00802v) {
        return new View.AccessibilityDelegate() { // from class: com.facebook.ads.redexgen.X.2t
            @Override // android.view.View.AccessibilityDelegate
            public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return c00802v.A05(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c00802v.A07(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                c00802v.A08(view, C00913g.A01(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c00802v.A03(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return c00802v.A06(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEvent(View view, int i) {
                c00802v.A02(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                c00802v.A04(view, accessibilityEvent);
            }
        };
    }

    public C00933i A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return null;
    }

    public boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return false;
    }
}
