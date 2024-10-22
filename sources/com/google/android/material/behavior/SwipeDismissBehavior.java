package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a3;
import defpackage.a43;
import defpackage.h90;
import defpackage.ja1;
import defpackage.ll3;
import defpackage.uk3;
import defpackage.v51;
import defpackage.vl3;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends h90 {

    /* renamed from: a, reason: collision with root package name */
    public vl3 f1526a;

    /* renamed from: b, reason: collision with root package name */
    public ja1 f1527b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public final float f = 0.5f;
    public float g = 0.0f;
    public float h = 0.5f;
    public final a43 i = new a43(this);

    @Override // defpackage.h90
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.c = false;
            }
        } else {
            z = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        }
        if (!z) {
            return false;
        }
        if (this.f1526a == null) {
            this.f1526a = new vl3(coordinatorLayout.getContext(), coordinatorLayout, this.i);
        }
        if (!this.d && this.f1526a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h90
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ll3.f3151a;
        if (uk3.c(view) == 0) {
            uk3.s(view, 1);
            ll3.m(view, 1048576);
            ll3.i(view, 0);
            if (t(view)) {
                ll3.n(view, a3.l, new v51(this, 28));
            }
        }
        return false;
    }

    @Override // defpackage.h90
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f1526a != null) {
            if (!this.d || motionEvent.getActionMasked() != 3) {
                this.f1526a.k(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean t(View view) {
        return true;
    }
}
