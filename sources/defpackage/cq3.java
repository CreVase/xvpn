package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cq3 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final sc1 f1655a;

    /* renamed from: b, reason: collision with root package name */
    public wq3 f1656b;

    public cq3(View view, sc1 sc1Var) {
        wq3 wq3Var;
        nq3 kq3Var;
        this.f1655a = sc1Var;
        wq3 h = ll3.h(view);
        if (h != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                kq3Var = new mq3(h);
            } else if (i >= 29) {
                kq3Var = new lq3(h);
            } else {
                kq3Var = new kq3(h);
            }
            wq3Var = kq3Var.b();
        } else {
            wq3Var = null;
        }
        this.f1656b = wq3Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f1656b = wq3.h(view, windowInsets);
            return dq3.i(view, windowInsets);
        }
        wq3 h = wq3.h(view, windowInsets);
        if (this.f1656b == null) {
            this.f1656b = ll3.h(view);
        }
        if (this.f1656b == null) {
            this.f1656b = h;
            return dq3.i(view, windowInsets);
        }
        sc1 j = dq3.j(view);
        if (j != null && Objects.equals(j.f4313a, windowInsets)) {
            return dq3.i(view, windowInsets);
        }
        wq3 wq3Var = this.f1656b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!h.a(i2).equals(wq3Var.a(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return dq3.i(view, windowInsets);
        }
        wq3 wq3Var2 = this.f1656b;
        if ((i & 8) != 0) {
            if (h.a(8).d > wq3Var2.a(8).d) {
                interpolator = dq3.e;
            } else {
                interpolator = dq3.f;
            }
        } else {
            interpolator = dq3.g;
        }
        iq3 iq3Var = new iq3(i, interpolator, 160L);
        hq3 hq3Var = iq3Var.f2634a;
        hq3Var.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(hq3Var.a());
        rc1 a2 = h.a(i);
        rc1 a3 = wq3Var2.a(i);
        int min = Math.min(a2.f4129a, a3.f4129a);
        int i3 = a2.f4130b;
        int i4 = a3.f4130b;
        int min2 = Math.min(i3, i4);
        int i5 = a2.c;
        int i6 = a3.c;
        int min3 = Math.min(i5, i6);
        int i7 = a2.d;
        int i8 = i;
        int i9 = a3.d;
        x50 x50Var = new x50(8, rc1.b(min, min2, min3, Math.min(i7, i9)), rc1.b(Math.max(a2.f4129a, a3.f4129a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        dq3.f(view, windowInsets, false);
        duration.addUpdateListener(new aq3(iq3Var, h, wq3Var2, i8, view));
        duration.addListener(new pm3(1, this, iq3Var, view));
        d32.a(view, new bq3(this, view, iq3Var, x50Var, duration, 0));
        this.f1656b = h;
        return dq3.i(view, windowInsets);
    }
}
