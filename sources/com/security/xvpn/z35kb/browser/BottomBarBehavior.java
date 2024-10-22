package com.security.xvpn.z35kb.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.bx3;
import defpackage.h90;

/* loaded from: classes2.dex */
public class BottomBarBehavior extends h90 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1596a;

    public BottomBarBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f1596a = (int) (bx3.z(context) * 24);
    }

    @Override // defpackage.h90
    public final boolean b(View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // defpackage.h90
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view.setTranslationY(((Math.abs(view2.getTop()) * 1.0f) / this.f1596a) * view.getHeight());
        return true;
    }
}
