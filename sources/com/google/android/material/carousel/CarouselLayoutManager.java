package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import defpackage.av;
import defpackage.bi1;
import defpackage.hx2;
import defpackage.j42;
import defpackage.pb;
import defpackage.uy0;
import defpackage.vh2;
import defpackage.wh2;
import defpackage.zu;
import java.util.List;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends c implements vh2 {
    public int p;
    public av q;

    public CarouselLayoutManager() {
        new zu();
        l0();
        F0(0);
    }

    public static float A0(float f, uy0 uy0Var) {
        bi1 bi1Var = (bi1) uy0Var.f4757b;
        bi1Var.getClass();
        bi1 bi1Var2 = (bi1) uy0Var.c;
        bi1Var2.getClass();
        bi1Var.getClass();
        bi1Var2.getClass();
        return pb.a(0.0f, 0.0f, 0.0f, 0.0f, f);
    }

    public static uy0 B0(float f, List list, boolean z) {
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((bi1) list.get(i5)).getClass();
            float abs = Math.abs(0.0f - f);
            if (0.0f <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (0.0f > f && abs <= f3) {
                i3 = i5;
                f3 = abs;
            }
            if (0.0f <= f4) {
                i2 = i5;
                f4 = 0.0f;
            }
            if (0.0f > f5) {
                i4 = i5;
                f5 = 0.0f;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new uy0((bi1) list.get(i), (bi1) list.get(i3));
    }

    public final boolean C0() {
        if (this.q.f3342b == 0) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        if (C0() && A() == 1) {
            return true;
        }
        return false;
    }

    public final int E0(int i, e eVar, wh2 wh2Var) {
        if (v() != 0 && i != 0) {
            int i2 = this.p;
            int i3 = i2 + i;
            if (i3 < 0 || i3 > 0) {
                i = 0 - i2;
            }
            this.p = i2 + i;
            G0();
            throw null;
        }
        return 0;
    }

    public final void F0(int i) {
        av avVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(hx2.m("invalid orientation:", i));
        }
        c(null);
        av avVar2 = this.q;
        if (avVar2 == null || i != avVar2.f3342b) {
            if (i != 0) {
                if (i == 1) {
                    avVar = new av(1, this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
            } else {
                avVar = new av(0, this, 1);
            }
            this.q = avVar;
            l0();
        }
    }

    public final void G0() {
        D0();
        throw null;
    }

    @Override // androidx.recyclerview.widget.c
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(c.F(u(0)));
            accessibilityEvent.setToIndex(c.F(u(v() - 1)));
        }
    }

    @Override // defpackage.vh2
    public final PointF a(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.c
    public final void a0(e eVar, wh2 wh2Var) {
        if (wh2Var.b() <= 0) {
            g0(eVar);
        } else {
            D0();
            eVar.d(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void b0(wh2 wh2Var) {
        if (v() != 0) {
            c.F(u(0));
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean d() {
        return C0();
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean e() {
        return !C0();
    }

    @Override // androidx.recyclerview.widget.c
    public final int j(wh2 wh2Var) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.c
    public final int k(wh2 wh2Var) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.c
    public final int l(wh2 wh2Var) {
        return 0 - 0;
    }

    @Override // androidx.recyclerview.widget.c
    public final int m(wh2 wh2Var) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.c
    public final int m0(int i, e eVar, wh2 wh2Var) {
        if (C0()) {
            E0(i, eVar, wh2Var);
            return 0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.c
    public final int n(wh2 wh2Var) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.c
    public final void n0(int i) {
    }

    @Override // androidx.recyclerview.widget.c
    public final int o(wh2 wh2Var) {
        return 0 - 0;
    }

    @Override // androidx.recyclerview.widget.c
    public final int o0(int i, e eVar, wh2 wh2Var) {
        if (e()) {
            E0(i, eVar, wh2Var);
            return 0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.c
    public final d r() {
        return new d(-2, -2);
    }

    @Override // androidx.recyclerview.widget.c
    public final void x0(RecyclerView recyclerView, int i) {
        j42 j42Var = new j42(this, recyclerView.getContext(), 1);
        j42Var.f3477a = i;
        y0(j42Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerX();
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new zu();
        F0(c.G(context, attributeSet, i, i2).f3663a);
        l0();
    }
}
