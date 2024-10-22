package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import defpackage.ao2;
import defpackage.p71;

/* loaded from: classes2.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ao2(this, 1);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.h90
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        p71.w(view);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.h90
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        p71.w(view);
        throw null;
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ao2(this, 1);
        new Rect();
    }
}
