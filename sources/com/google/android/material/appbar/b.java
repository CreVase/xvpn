package com.google.android.material.appbar;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.g3;
import defpackage.l2;

/* loaded from: classes2.dex */
public final class b extends l2 {
    public final /* synthetic */ AppBarLayout.BaseBehavior d;

    public b(AppBarLayout.BaseBehavior baseBehavior) {
        this.d = baseBehavior;
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(this.d.p);
        g3Var.i(ScrollView.class.getName());
    }
}
