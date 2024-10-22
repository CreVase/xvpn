package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.h90;
import defpackage.hx2;
import defpackage.ll3;
import defpackage.p71;
import defpackage.xk3;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends h90 {
    public ExpandableBehavior() {
    }

    @Override // defpackage.h90
    public abstract boolean b(View view, View view2);

    @Override // defpackage.h90
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        p71.C(view2);
        throw null;
    }

    @Override // defpackage.h90
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ll3.f3151a;
        if (!xk3.c(view)) {
            ArrayList e = coordinatorLayout.e(view);
            int size = e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                View view2 = (View) e.get(i2);
                if (b(view, view2)) {
                    hx2.w(view2);
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
