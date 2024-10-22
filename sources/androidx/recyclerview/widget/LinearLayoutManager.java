package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.hx2;
import defpackage.jk1;
import defpackage.kk1;
import defpackage.lk1;
import defpackage.nk1;
import defpackage.oh2;
import defpackage.p10;
import defpackage.u32;
import defpackage.v32;
import defpackage.vh2;
import defpackage.wh2;
import defpackage.ya0;

/* loaded from: classes.dex */
public class LinearLayoutManager extends c implements vh2 {
    public final jk1 A;
    public final kk1 B;
    public final int C;
    public final int[] D;
    public int p;
    public lk1 q;
    public u32 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public SavedState z;

    public LinearLayoutManager() {
        this(1, false);
    }

    public void A0(wh2 wh2Var, int[] iArr) {
        boolean z;
        int i;
        int i2;
        if (wh2Var.f5010a != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.r.i();
        } else {
            i = 0;
        }
        if (this.q.f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void B0(wh2 wh2Var, lk1 lk1Var, p10 p10Var) {
        int i = lk1Var.d;
        if (i >= 0 && i < wh2Var.b()) {
            p10Var.f(i, Math.max(0, lk1Var.g));
        }
    }

    public final int C0(wh2 wh2Var) {
        if (v() == 0) {
            return 0;
        }
        G0();
        u32 u32Var = this.r;
        boolean z = !this.w;
        return ya0.M(wh2Var, u32Var, J0(z), I0(z), this, this.w);
    }

    public final int D0(wh2 wh2Var) {
        if (v() == 0) {
            return 0;
        }
        G0();
        u32 u32Var = this.r;
        boolean z = !this.w;
        return ya0.N(wh2Var, u32Var, J0(z), I0(z), this, this.w, this.u);
    }

    public final int E0(wh2 wh2Var) {
        if (v() == 0) {
            return 0;
        }
        G0();
        u32 u32Var = this.r;
        boolean z = !this.w;
        return ya0.O(wh2Var, u32Var, J0(z), I0(z), this, this.w);
    }

    public final int F0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.p != 1 && T0()) {
                return -1;
            }
            return 1;
        }
        if (this.p == 1 || !T0()) {
            return -1;
        }
        return 1;
    }

    public final void G0() {
        if (this.q == null) {
            this.q = new lk1();
        }
    }

    public final int H0(e eVar, lk1 lk1Var, wh2 wh2Var, boolean z) {
        boolean z2;
        int i = lk1Var.c;
        int i2 = lk1Var.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                lk1Var.g = i2 + i;
            }
            W0(eVar, lk1Var);
        }
        int i3 = lk1Var.c + lk1Var.h;
        while (true) {
            if (!lk1Var.l && i3 <= 0) {
                break;
            }
            int i4 = lk1Var.d;
            if (i4 >= 0 && i4 < wh2Var.b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            kk1 kk1Var = this.B;
            kk1Var.f2962a = 0;
            kk1Var.f2963b = false;
            kk1Var.c = false;
            kk1Var.d = false;
            U0(eVar, wh2Var, lk1Var, kk1Var);
            if (!kk1Var.f2963b) {
                int i5 = lk1Var.f3144b;
                int i6 = kk1Var.f2962a;
                lk1Var.f3144b = (lk1Var.f * i6) + i5;
                if (!kk1Var.c || lk1Var.k != null || !wh2Var.g) {
                    lk1Var.c -= i6;
                    i3 -= i6;
                }
                int i7 = lk1Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    lk1Var.g = i8;
                    int i9 = lk1Var.c;
                    if (i9 < 0) {
                        lk1Var.g = i8 + i9;
                    }
                    W0(eVar, lk1Var);
                }
                if (z && kk1Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - lk1Var.c;
    }

    public final View I0(boolean z) {
        if (this.u) {
            return N0(0, v(), z);
        }
        return N0(v() - 1, -1, z);
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean J() {
        return true;
    }

    public final View J0(boolean z) {
        if (this.u) {
            return N0(v() - 1, -1, z);
        }
        return N0(0, v(), z);
    }

    public final int K0() {
        View N0 = N0(0, v(), false);
        if (N0 == null) {
            return -1;
        }
        return c.F(N0);
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return c.F(N0);
    }

    public final View M0(int i, int i2) {
        char c;
        int i3;
        int i4;
        G0();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return u(i);
        }
        if (this.r.d(u(i)) < this.r.h()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.p == 0) {
            return this.c.g(i, i2, i3, i4);
        }
        return this.d.g(i, i2, i3, i4);
    }

    public final View N0(int i, int i2, boolean z) {
        int i3;
        G0();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.p == 0) {
            return this.c.g(i, i2, i3, 320);
        }
        return this.d.g(i, i2, i3, 320);
    }

    public View O0(e eVar, wh2 wh2Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        G0();
        int v = v();
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
            i3 = 1;
        }
        int b2 = wh2Var.b();
        int h = this.r.h();
        int f = this.r.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int F = c.F(u);
            int d = this.r.d(u);
            int b3 = this.r.b(u);
            if (F >= 0 && F < b2) {
                if (((d) u.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = u;
                    }
                } else {
                    if (b3 <= h && d < h) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (d >= f && b3 > f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return u;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.c
    public final void P(RecyclerView recyclerView) {
    }

    public final int P0(int i, e eVar, wh2 wh2Var, boolean z) {
        int f;
        int f2 = this.r.f() - i;
        if (f2 > 0) {
            int i2 = -Z0(-f2, eVar, wh2Var);
            int i3 = i + i2;
            if (z && (f = this.r.f() - i3) > 0) {
                this.r.l(f);
                return f + i2;
            }
            return i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.c
    public View Q(View view, int i, e eVar, wh2 wh2Var) {
        int F0;
        View M0;
        View R0;
        Y0();
        if (v() == 0 || (F0 = F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        d1(F0, (int) (this.r.i() * 0.33333334f), false, wh2Var);
        lk1 lk1Var = this.q;
        lk1Var.g = Integer.MIN_VALUE;
        lk1Var.f3143a = false;
        H0(eVar, lk1Var, wh2Var, true);
        if (F0 == -1) {
            if (this.u) {
                M0 = M0(v() - 1, -1);
            } else {
                M0 = M0(0, v());
            }
        } else if (this.u) {
            M0 = M0(0, v());
        } else {
            M0 = M0(v() - 1, -1);
        }
        if (F0 == -1) {
            R0 = S0();
        } else {
            R0 = R0();
        }
        if (R0.hasFocusable()) {
            if (M0 == null) {
                return null;
            }
            return R0;
        }
        return M0;
    }

    public final int Q0(int i, e eVar, wh2 wh2Var, boolean z) {
        int h;
        int h2 = i - this.r.h();
        if (h2 > 0) {
            int i2 = -Z0(h2, eVar, wh2Var);
            int i3 = i + i2;
            if (z && (h = i3 - this.r.h()) > 0) {
                this.r.l(-h);
                return i2 - h;
            }
            return i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.c
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(K0());
            accessibilityEvent.setToIndex(L0());
        }
    }

    public final View R0() {
        int v;
        if (this.u) {
            v = 0;
        } else {
            v = v() - 1;
        }
        return u(v);
    }

    public final View S0() {
        int i;
        if (this.u) {
            i = v() - 1;
        } else {
            i = 0;
        }
        return u(i);
    }

    public final boolean T0() {
        if (A() == 1) {
            return true;
        }
        return false;
    }

    public void U0(e eVar, wh2 wh2Var, lk1 lk1Var, kk1 kk1Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View b2 = lk1Var.b(eVar);
        if (b2 == null) {
            kk1Var.f2963b = true;
            return;
        }
        d dVar = (d) b2.getLayoutParams();
        if (lk1Var.k == null) {
            boolean z3 = this.u;
            if (lk1Var.f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                b(b2, false, -1);
            } else {
                b(b2, false, 0);
            }
        } else {
            boolean z4 = this.u;
            if (lk1Var.f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                b(b2, true, -1);
            } else {
                b(b2, true, 0);
            }
        }
        d dVar2 = (d) b2.getLayoutParams();
        Rect N = this.f275b.N(b2);
        int i5 = N.left + N.right + 0;
        int i6 = N.top + N.bottom + 0;
        int w = c.w(this.n, this.l, D() + C() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) dVar2).width, d());
        int w2 = c.w(this.o, this.m, B() + E() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) dVar2).height, e());
        if (u0(b2, w, w2, dVar2)) {
            b2.measure(w, w2);
        }
        kk1Var.f2962a = this.r.c(b2);
        if (this.p == 1) {
            if (T0()) {
                i4 = this.n - D();
                i = i4 - this.r.m(b2);
            } else {
                i = C();
                i4 = this.r.m(b2) + i;
            }
            if (lk1Var.f == -1) {
                i2 = lk1Var.f3144b;
                i3 = i2 - kk1Var.f2962a;
            } else {
                i3 = lk1Var.f3144b;
                i2 = kk1Var.f2962a + i3;
            }
        } else {
            int E = E();
            int m = this.r.m(b2) + E;
            if (lk1Var.f == -1) {
                int i7 = lk1Var.f3144b;
                int i8 = i7 - kk1Var.f2962a;
                i4 = i7;
                i2 = m;
                i = i8;
                i3 = E;
            } else {
                int i9 = lk1Var.f3144b;
                int i10 = kk1Var.f2962a + i9;
                i = i9;
                i2 = m;
                i3 = E;
                i4 = i10;
            }
        }
        c.L(b2, i, i3, i4, i2);
        if (dVar.c() || dVar.b()) {
            kk1Var.c = true;
        }
        kk1Var.d = b2.hasFocusable();
    }

    public void V0(e eVar, wh2 wh2Var, jk1 jk1Var, int i) {
    }

    public final void W0(e eVar, lk1 lk1Var) {
        if (lk1Var.f3143a && !lk1Var.l) {
            int i = lk1Var.g;
            int i2 = lk1Var.i;
            if (lk1Var.f == -1) {
                int v = v();
                if (i >= 0) {
                    int e = (this.r.e() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < v; i3++) {
                            View u = u(i3);
                            if (this.r.d(u) < e || this.r.k(u) < e) {
                                X0(eVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = v - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View u2 = u(i5);
                        if (this.r.d(u2) < e || this.r.k(u2) < e) {
                            X0(eVar, i4, i5);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i >= 0) {
                int i6 = i - i2;
                int v2 = v();
                if (this.u) {
                    int i7 = v2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View u3 = u(i8);
                        if (this.r.b(u3) > i6 || this.r.j(u3) > i6) {
                            X0(eVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < v2; i9++) {
                    View u4 = u(i9);
                    if (this.r.b(u4) > i6 || this.r.j(u4) > i6) {
                        X0(eVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void X0(e eVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u = u(i);
                j0(i);
                eVar.i(u);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                View u2 = u(i2);
                j0(i2);
                eVar.i(u2);
            } else {
                return;
            }
        }
    }

    public final void Y0() {
        if (this.p != 1 && T0()) {
            this.u = !this.t;
        } else {
            this.u = this.t;
        }
    }

    public final int Z0(int i, e eVar, wh2 wh2Var) {
        int i2;
        if (v() == 0 || i == 0) {
            return 0;
        }
        G0();
        this.q.f3143a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        d1(i2, abs, true, wh2Var);
        lk1 lk1Var = this.q;
        int H0 = H0(eVar, lk1Var, wh2Var, false) + lk1Var.g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i = i2 * H0;
        }
        this.r.l(-i);
        this.q.j = i;
        return i;
    }

    @Override // defpackage.vh2
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < c.F(u(0))) {
            z = true;
        }
        if (z != this.u) {
            i2 = -1;
        }
        if (this.p == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0233  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.recyclerview.widget.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a0(androidx.recyclerview.widget.e r18, defpackage.wh2 r19) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.a0(androidx.recyclerview.widget.e, wh2):void");
    }

    public final void a1(int i, int i2) {
        this.x = i;
        this.y = i2;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.f265a = -1;
        }
        l0();
    }

    @Override // androidx.recyclerview.widget.c
    public void b0(wh2 wh2Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.f();
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(hx2.m("invalid orientation:", i));
        }
        c(null);
        if (i != this.p || this.r == null) {
            u32 a2 = v32.a(this, i);
            this.r = a2;
            this.A.f = a2;
            this.p = i;
            l0();
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        l0();
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean d() {
        if (this.p == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.c
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.z = savedState;
            if (this.x != -1) {
                savedState.f265a = -1;
            }
            l0();
        }
    }

    public final void d1(int i, int i2, boolean z, wh2 wh2Var) {
        boolean z2;
        int i3;
        int h;
        int B;
        lk1 lk1Var = this.q;
        boolean z3 = false;
        int i4 = 1;
        if (this.r.g() == 0 && this.r.e() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        lk1Var.l = z2;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(wh2Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        lk1 lk1Var2 = this.q;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        lk1Var2.h = i3;
        if (!z3) {
            max = max2;
        }
        lk1Var2.i = max;
        if (z3) {
            u32 u32Var = this.r;
            int i5 = u32Var.d;
            c cVar = u32Var.f4775a;
            switch (i5) {
                case 0:
                    B = cVar.D();
                    break;
                default:
                    B = cVar.B();
                    break;
            }
            lk1Var2.h = B + i3;
            View R0 = R0();
            lk1 lk1Var3 = this.q;
            if (this.u) {
                i4 = -1;
            }
            lk1Var3.e = i4;
            int F = c.F(R0);
            lk1 lk1Var4 = this.q;
            lk1Var3.d = F + lk1Var4.e;
            lk1Var4.f3144b = this.r.b(R0);
            h = this.r.b(R0) - this.r.f();
        } else {
            View S0 = S0();
            lk1 lk1Var5 = this.q;
            lk1Var5.h = this.r.h() + lk1Var5.h;
            lk1 lk1Var6 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            lk1Var6.e = i4;
            int F2 = c.F(S0);
            lk1 lk1Var7 = this.q;
            lk1Var6.d = F2 + lk1Var7.e;
            lk1Var7.f3144b = this.r.d(S0);
            h = (-this.r.d(S0)) + this.r.h();
        }
        lk1 lk1Var8 = this.q;
        lk1Var8.c = i2;
        if (z) {
            lk1Var8.c = i2 - h;
        }
        lk1Var8.g = h;
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean e() {
        if (this.p == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.c
    public final Parcelable e0() {
        SavedState savedState = this.z;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (v() > 0) {
            G0();
            boolean z = this.s ^ this.u;
            savedState2.c = z;
            if (z) {
                View R0 = R0();
                savedState2.f266b = this.r.f() - this.r.b(R0);
                savedState2.f265a = c.F(R0);
            } else {
                View S0 = S0();
                savedState2.f265a = c.F(S0);
                savedState2.f266b = this.r.d(S0) - this.r.h();
            }
        } else {
            savedState2.f265a = -1;
        }
        return savedState2;
    }

    public final void e1(int i, int i2) {
        int i3;
        this.q.c = this.r.f() - i2;
        lk1 lk1Var = this.q;
        if (this.u) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        lk1Var.e = i3;
        lk1Var.d = i;
        lk1Var.f = 1;
        lk1Var.f3144b = i2;
        lk1Var.g = Integer.MIN_VALUE;
    }

    public final void f1(int i, int i2) {
        int i3;
        this.q.c = i2 - this.r.h();
        lk1 lk1Var = this.q;
        lk1Var.d = i;
        if (this.u) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        lk1Var.e = i3;
        lk1Var.f = -1;
        lk1Var.f3144b = i2;
        lk1Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.c
    public final void h(int i, int i2, wh2 wh2Var, p10 p10Var) {
        int i3;
        if (this.p != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            G0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            d1(i3, Math.abs(i), true, wh2Var);
            B0(wh2Var, this.q, p10Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.recyclerview.widget.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r7, defpackage.p10 r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f265a
            if (r4 < 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.c
            goto L22
        L13:
            r6.Y0()
            boolean r0 = r6.u
            int r4 = r6.x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = 0
        L22:
            if (r0 == 0) goto L25
            r1 = -1
        L25:
            r0 = 0
        L26:
            int r2 = r6.C
            if (r0 >= r2) goto L35
            if (r4 < 0) goto L35
            if (r4 >= r7) goto L35
            r8.f(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, p10):void");
    }

    @Override // androidx.recyclerview.widget.c
    public final int j(wh2 wh2Var) {
        return C0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public int k(wh2 wh2Var) {
        return D0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public int l(wh2 wh2Var) {
        return E0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final int m(wh2 wh2Var) {
        return C0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public int m0(int i, e eVar, wh2 wh2Var) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, eVar, wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public int n(wh2 wh2Var) {
        return D0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final void n0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.f265a = -1;
        }
        l0();
    }

    @Override // androidx.recyclerview.widget.c
    public int o(wh2 wh2Var) {
        return E0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public int o0(int i, e eVar, wh2 wh2Var) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, eVar, wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int F = i - c.F(u(0));
        if (F >= 0 && F < v) {
            View u = u(F);
            if (c.F(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // androidx.recyclerview.widget.c
    public d r() {
        return new d(-2, -2);
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean v0() {
        boolean z;
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int v = v();
        int i = 0;
        while (true) {
            if (i < v) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.c
    public void x0(RecyclerView recyclerView, int i) {
        nk1 nk1Var = new nk1(recyclerView.getContext());
        nk1Var.f3477a = i;
        y0(nk1Var);
    }

    @Override // androidx.recyclerview.widget.c
    public boolean z0() {
        if (this.z == null && this.s == this.v) {
            return true;
        }
        return false;
    }

    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new jk1();
        this.B = new kk1();
        this.C = 2;
        this.D = new int[2];
        b1(i);
        c(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        l0();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f265a;

        /* renamed from: b, reason: collision with root package name */
        public int f266b;
        public boolean c;

        public SavedState(Parcel parcel) {
            this.f265a = parcel.readInt();
            this.f266b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f265a);
            parcel.writeInt(this.f266b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(SavedState savedState) {
            this.f265a = savedState.f265a;
            this.f266b = savedState.f266b;
            this.c = savedState.c;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new jk1();
        this.B = new kk1();
        this.C = 2;
        this.D = new int[2];
        oh2 G = c.G(context, attributeSet, i, i2);
        b1(G.f3663a);
        boolean z = G.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            l0();
        }
        c1(G.d);
    }
}
