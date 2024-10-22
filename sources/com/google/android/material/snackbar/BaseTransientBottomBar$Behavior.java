package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.ax2;
import defpackage.uo;
import defpackage.vo;
import defpackage.xo;
import defpackage.zw2;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final uo j = new uo((SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.h90
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        uo uoVar = this.j;
        uoVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                ax2.b().e((vo) uoVar.f4707a);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            ax2 b2 = ax2.b();
            vo voVar = (vo) uoVar.f4707a;
            synchronized (b2.f359a) {
                if (b2.c(voVar)) {
                    zw2 zw2Var = b2.c;
                    if (!zw2Var.c) {
                        zw2Var.c = true;
                        b2.f360b.removeCallbacksAndMessages(zw2Var);
                    }
                }
            }
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean t(View view) {
        this.j.getClass();
        return view instanceof xo;
    }
}
