package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.h90;
import defpackage.he2;
import defpackage.mk1;
import defpackage.o4;
import defpackage.p71;
import defpackage.pb;
import defpackage.zf3;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends h90 {
    public static final int i = he2.motionDurationLong2;
    public static final int j = he2.motionDurationMedium4;
    public static final int k = he2.motionEasingEmphasizedInterpolator;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1524a;

    /* renamed from: b, reason: collision with root package name */
    public int f1525b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f;
    public int g;
    public ViewPropertyAnimator h;

    public HideBottomViewOnScrollBehavior() {
        this.f1524a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
    }

    @Override // defpackage.h90
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1525b = zf3.c0(view.getContext(), i, 225);
        this.c = zf3.c0(view.getContext(), j, 175);
        Context context = view.getContext();
        mk1 mk1Var = pb.d;
        int i3 = k;
        this.d = zf3.d0(context, i3, mk1Var);
        this.e = zf3.d0(view.getContext(), i3, pb.c);
        return false;
    }

    @Override // defpackage.h90
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        boolean z;
        LinkedHashSet linkedHashSet = this.f1524a;
        boolean z2 = false;
        if (i3 > 0) {
            if (this.g == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator = this.h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    t(view, this.f + 0, this.c, this.e);
                    return;
                } else {
                    p71.C(it.next());
                    throw null;
                }
            }
            return;
        }
        if (i3 < 0) {
            if (this.g == 2) {
                z2 = true;
            }
            if (!z2) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.h;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.g = 2;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    t(view, 0, this.f1525b, this.d);
                } else {
                    p71.C(it2.next());
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.h90
    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public final void t(View view, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.h = view.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new o4(this, 3));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f1524a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
    }
}
