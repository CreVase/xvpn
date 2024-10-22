package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bg2;
import defpackage.h90;
import defpackage.k90;
import defpackage.p71;

/* loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior<T> extends h90 {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // defpackage.h90
    public final boolean a(View view) {
        p71.w(view);
        throw null;
    }

    @Override // defpackage.h90
    public final void c(k90 k90Var) {
        if (k90Var.h == 0) {
            k90Var.h = 80;
        }
    }

    @Override // defpackage.h90
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        p71.w(view);
        throw null;
    }

    @Override // defpackage.h90
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        p71.w(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.FloatingActionButton_Behavior_Layout);
        obtainStyledAttributes.getBoolean(bg2.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        obtainStyledAttributes.recycle();
    }
}
