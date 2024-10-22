package com.security.xvpn.z35kb.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.h90;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class BrowserScrollingBehavior extends h90 {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f1597a;

    public BrowserScrollingBehavior() {
    }

    @Override // defpackage.h90
    public final boolean b(View view, View view2) {
        if (view2 instanceof BrowserToolbar) {
            this.f1597a = new WeakReference((BrowserToolbar) view2);
            return true;
        }
        return false;
    }

    @Override // defpackage.h90
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        view.setTranslationY(((BrowserToolbar) this.f1597a.get()).getToolbarHeight());
        return false;
    }

    @Override // defpackage.h90
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    @Override // defpackage.h90
    public final void m() {
    }

    @Override // defpackage.h90
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public BrowserScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
