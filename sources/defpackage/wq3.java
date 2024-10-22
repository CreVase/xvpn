package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wq3 {

    /* renamed from: b, reason: collision with root package name */
    public static final wq3 f5058b;

    /* renamed from: a, reason: collision with root package name */
    public final uq3 f5059a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5058b = tq3.q;
        } else {
            f5058b = uq3.f4718b;
        }
    }

    public wq3(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5059a = new tq3(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f5059a = new sq3(this, windowInsets);
        } else if (i >= 28) {
            this.f5059a = new rq3(this, windowInsets);
        } else {
            this.f5059a = new pq3(this, windowInsets);
        }
    }

    public static rc1 f(rc1 rc1Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, rc1Var.f4129a - i);
        int max2 = Math.max(0, rc1Var.f4130b - i2);
        int max3 = Math.max(0, rc1Var.c - i3);
        int max4 = Math.max(0, rc1Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return rc1Var;
        }
        return rc1.b(max, max2, max3, max4);
    }

    public static wq3 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        wq3 wq3Var = new wq3(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = ll3.f3151a;
            if (xk3.b(view)) {
                wq3 h = ll3.h(view);
                uq3 uq3Var = wq3Var.f5059a;
                uq3Var.p(h);
                uq3Var.d(view.getRootView());
            }
        }
        return wq3Var;
    }

    public final rc1 a(int i) {
        return this.f5059a.f(i);
    }

    public final int b() {
        return this.f5059a.j().d;
    }

    public final int c() {
        return this.f5059a.j().f4129a;
    }

    public final int d() {
        return this.f5059a.j().c;
    }

    public final int e() {
        return this.f5059a.j().f4130b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq3)) {
            return false;
        }
        return w12.a(this.f5059a, ((wq3) obj).f5059a);
    }

    public final WindowInsets g() {
        uq3 uq3Var = this.f5059a;
        if (uq3Var instanceof oq3) {
            return ((oq3) uq3Var).c;
        }
        return null;
    }

    public final int hashCode() {
        uq3 uq3Var = this.f5059a;
        if (uq3Var == null) {
            return 0;
        }
        return uq3Var.hashCode();
    }

    public wq3() {
        this.f5059a = new uq3(this);
    }
}
