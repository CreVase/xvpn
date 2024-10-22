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
import defpackage.k03;
import defpackage.l03;
import defpackage.ll3;
import defpackage.m03;
import defpackage.nk1;
import defpackage.oh2;
import defpackage.p10;
import defpackage.ti1;
import defpackage.uk3;
import defpackage.v32;
import defpackage.vh2;
import defpackage.wh2;
import defpackage.wv0;
import defpackage.ya0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends c implements vh2 {
    public final j B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final k03 H;
    public final boolean I;
    public int[] J;
    public final wv0 K;
    public int p;
    public m03[] q;
    public v32 r;
    public v32 s;
    public int t;
    public int u;
    public final ti1 v;
    public boolean w;
    public BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        j jVar = new j(0);
        this.B = jVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new k03(this);
        this.I = true;
        this.K = new wv0(this, 1);
        oh2 G = c.G(context, attributeSet, i, i2);
        int i3 = G.f3663a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            v32 v32Var = this.r;
            this.r = this.s;
            this.s = v32Var;
            l0();
        }
        int i4 = G.f3664b;
        c(null);
        if (i4 != this.p) {
            jVar.e();
            l0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new m03[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new m03(this, i5);
            }
            l0();
        }
        boolean z = G.c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.w = z;
        l0();
        this.v = new ti1();
        this.r = v32.a(this, this.t);
        this.s = v32.a(this, 1 - this.t);
    }

    public static int d1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    public final int A0(int i) {
        boolean z;
        if (v() == 0) {
            if (!this.x) {
                return -1;
            }
            return 1;
        }
        if (i < K0()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.x) {
            return -1;
        }
        return 1;
    }

    public final boolean B0() {
        int K0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                K0 = L0();
                K0();
            } else {
                K0 = K0();
                L0();
            }
            if (K0 == 0 && P0() != null) {
                this.B.e();
                this.f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int C0(wh2 wh2Var) {
        if (v() == 0) {
            return 0;
        }
        v32 v32Var = this.r;
        boolean z = this.I;
        return ya0.M(wh2Var, v32Var, H0(!z), G0(!z), this, this.I);
    }

    public final int D0(wh2 wh2Var) {
        if (v() == 0) {
            return 0;
        }
        v32 v32Var = this.r;
        boolean z = this.I;
        return ya0.N(wh2Var, v32Var, H0(!z), G0(!z), this, this.I, this.x);
    }

    public final int E0(wh2 wh2Var) {
        if (v() == 0) {
            return 0;
        }
        v32 v32Var = this.r;
        boolean z = this.I;
        return ya0.O(wh2Var, v32Var, H0(!z), G0(!z), this, this.I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final int F0(e eVar, ti1 ti1Var, wh2 wh2Var) {
        int i;
        int h;
        boolean z;
        int M0;
        int i2;
        boolean z2;
        m03 m03Var;
        ?? r8;
        int i3;
        int c;
        int h2;
        int c2;
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        this.y.set(0, this.p, true);
        ti1 ti1Var2 = this.v;
        if (ti1Var2.i) {
            if (ti1Var.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (ti1Var.e == 1) {
            i = ti1Var.g + ti1Var.f4513b;
        } else {
            i = ti1Var.f - ti1Var.f4513b;
        }
        int i8 = ti1Var.e;
        for (int i9 = 0; i9 < this.p; i9++) {
            if (!this.q[i9].f3215a.isEmpty()) {
                c1(this.q[i9], i8, i);
            }
        }
        if (this.x) {
            h = this.r.f();
        } else {
            h = this.r.h();
        }
        boolean z3 = false;
        while (true) {
            int i10 = ti1Var.c;
            if (i10 >= 0 && i10 < wh2Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!ti1Var2.i && this.y.isEmpty())) {
                break;
            }
            View d = eVar.d(ti1Var.c);
            ti1Var.c += ti1Var.d;
            l03 l03Var = (l03) d.getLayoutParams();
            int a2 = l03Var.a();
            j jVar = this.B;
            int[] iArr = (int[]) jVar.f284b;
            if (iArr != null && a2 < iArr.length) {
                i2 = iArr[a2];
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (T0(ti1Var.e)) {
                    i5 = this.p - i7;
                    i4 = -1;
                    i6 = -1;
                } else {
                    i4 = this.p;
                    i5 = 0;
                    i6 = 1;
                }
                m03 m03Var2 = null;
                if (ti1Var.e == i7) {
                    int h3 = this.r.h();
                    int i11 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        m03 m03Var3 = this.q[i5];
                        int f = m03Var3.f(h3);
                        if (f < i11) {
                            i11 = f;
                            m03Var2 = m03Var3;
                        }
                        i5 += i6;
                    }
                } else {
                    int f2 = this.r.f();
                    int i12 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        m03 m03Var4 = this.q[i5];
                        int i13 = m03Var4.i(f2);
                        if (i13 > i12) {
                            m03Var2 = m03Var4;
                            i12 = i13;
                        }
                        i5 += i6;
                    }
                }
                m03Var = m03Var2;
                jVar.f(a2);
                ((int[]) jVar.f284b)[a2] = m03Var.e;
            } else {
                m03Var = this.q[i2];
            }
            l03Var.e = m03Var;
            if (ti1Var.e == 1) {
                r8 = 0;
                b(d, false, -1);
            } else {
                r8 = 0;
                b(d, false, 0);
            }
            if (this.t == 1) {
                R0(d, c.w(this.u, this.l, r8, ((ViewGroup.MarginLayoutParams) l03Var).width, r8), c.w(this.o, this.m, B() + E(), ((ViewGroup.MarginLayoutParams) l03Var).height, true), r8);
            } else {
                R0(d, c.w(this.n, this.l, D() + C(), ((ViewGroup.MarginLayoutParams) l03Var).width, true), c.w(this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) l03Var).height, false), false);
            }
            if (ti1Var.e == 1) {
                c = m03Var.f(h);
                i3 = this.r.c(d) + c;
            } else {
                i3 = m03Var.i(h);
                c = i3 - this.r.c(d);
            }
            if (ti1Var.e == 1) {
                m03 m03Var5 = l03Var.e;
                m03Var5.getClass();
                l03 l03Var2 = (l03) d.getLayoutParams();
                l03Var2.e = m03Var5;
                ArrayList arrayList = m03Var5.f3215a;
                arrayList.add(d);
                m03Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    m03Var5.f3216b = Integer.MIN_VALUE;
                }
                if (l03Var2.c() || l03Var2.b()) {
                    m03Var5.d = m03Var5.f.r.c(d) + m03Var5.d;
                }
            } else {
                m03 m03Var6 = l03Var.e;
                m03Var6.getClass();
                l03 l03Var3 = (l03) d.getLayoutParams();
                l03Var3.e = m03Var6;
                ArrayList arrayList2 = m03Var6.f3215a;
                arrayList2.add(0, d);
                m03Var6.f3216b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    m03Var6.c = Integer.MIN_VALUE;
                }
                if (l03Var3.c() || l03Var3.b()) {
                    m03Var6.d = m03Var6.f.r.c(d) + m03Var6.d;
                }
            }
            if (Q0() && this.t == 1) {
                c2 = this.s.f() - (((this.p - 1) - m03Var.e) * this.u);
                h2 = c2 - this.s.c(d);
            } else {
                h2 = this.s.h() + (m03Var.e * this.u);
                c2 = this.s.c(d) + h2;
            }
            if (this.t == 1) {
                c.L(d, h2, c, c2, i3);
            } else {
                c.L(d, c, h2, i3, c2);
            }
            c1(m03Var, ti1Var2.e, i);
            V0(eVar, ti1Var2);
            if (ti1Var2.h && d.hasFocusable()) {
                this.y.set(m03Var.e, false);
            }
            i7 = 1;
            z3 = true;
        }
        if (!z3) {
            V0(eVar, ti1Var2);
        }
        if (ti1Var2.e == -1) {
            M0 = this.r.h() - N0(this.r.h());
        } else {
            M0 = M0(this.r.f()) - this.r.f();
        }
        if (M0 > 0) {
            return Math.min(ti1Var.f4513b, M0);
        }
        return 0;
    }

    public final View G0(boolean z) {
        int h = this.r.h();
        int f = this.r.f();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int d = this.r.d(u);
            int b2 = this.r.b(u);
            if (b2 > h && d < f) {
                if (b2 > f && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z) {
        int h = this.r.h();
        int f = this.r.f();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int d = this.r.d(u);
            if (this.r.b(u) > h && d < f) {
                if (d < h && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final void I0(e eVar, wh2 wh2Var, boolean z) {
        int f;
        int M0 = M0(Integer.MIN_VALUE);
        if (M0 != Integer.MIN_VALUE && (f = this.r.f() - M0) > 0) {
            int i = f - (-Z0(-f, eVar, wh2Var));
            if (z && i > 0) {
                this.r.l(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean J() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final void J0(e eVar, wh2 wh2Var, boolean z) {
        int h;
        int N0 = N0(Integer.MAX_VALUE);
        if (N0 != Integer.MAX_VALUE && (h = N0 - this.r.h()) > 0) {
            int Z0 = h - Z0(h, eVar, wh2Var);
            if (z && Z0 > 0) {
                this.r.l(-Z0);
            }
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return c.F(u(0));
    }

    public final int L0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return c.F(u(v - 1));
    }

    @Override // androidx.recyclerview.widget.c
    public final void M(int i) {
        super.M(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            m03 m03Var = this.q[i2];
            int i3 = m03Var.f3216b;
            if (i3 != Integer.MIN_VALUE) {
                m03Var.f3216b = i3 + i;
            }
            int i4 = m03Var.c;
            if (i4 != Integer.MIN_VALUE) {
                m03Var.c = i4 + i;
            }
        }
    }

    public final int M0(int i) {
        int f = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int f2 = this.q[i2].f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.c
    public final void N(int i) {
        super.N(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            m03 m03Var = this.q[i2];
            int i3 = m03Var.f3216b;
            if (i3 != Integer.MIN_VALUE) {
                m03Var.f3216b = i3 + i;
            }
            int i4 = m03Var.c;
            if (i4 != Integer.MIN_VALUE) {
                m03Var.c = i4 + i;
            }
        }
    }

    public final int N0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.c
    public final void O() {
        this.B.e();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L9
            int r0 = r7.L0()
            goto Ld
        L9:
            int r0 = r7.K0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.j r4 = r7.B
            r4.h(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.k(r8, r5)
            r4.j(r9, r5)
            goto L39
        L32:
            r4.k(r8, r9)
            goto L39
        L36:
            r4.j(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.x
            if (r8 == 0) goto L45
            int r8 = r7.K0()
            goto L49
        L45:
            int r8 = r7.L0()
        L49:
            if (r3 > r8) goto L4e
            r7.l0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.c
    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f275b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:            if (r10 == r11) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:            r10 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:            r10 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:            if (r10 == r11) goto L51;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View P0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0():android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004a, code lost:            if (r8.t == 1) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x004f, code lost:            if (r8.t == 0) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005e, code lost:            if (Q0() == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006a, code lost:            if (Q0() == false) goto L54;     */
    @Override // androidx.recyclerview.widget.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View Q(android.view.View r9, int r10, androidx.recyclerview.widget.e r11, defpackage.wh2 r12) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q(android.view.View, int, androidx.recyclerview.widget.e, wh2):android.view.View");
    }

    public final boolean Q0() {
        if (A() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.c
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(false);
            View G0 = G0(false);
            if (H0 != null && G0 != null) {
                int F = c.F(H0);
                int F2 = c.F(G0);
                if (F < F2) {
                    accessibilityEvent.setFromIndex(F);
                    accessibilityEvent.setToIndex(F2);
                } else {
                    accessibilityEvent.setFromIndex(F2);
                    accessibilityEvent.setToIndex(F);
                }
            }
        }
    }

    public final void R0(View view, int i, int i2, boolean z) {
        RecyclerView recyclerView = this.f275b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        l03 l03Var = (l03) view.getLayoutParams();
        int d1 = d1(i, ((ViewGroup.MarginLayoutParams) l03Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) l03Var).rightMargin + rect.right);
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) l03Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) l03Var).bottomMargin + rect.bottom);
        if (u0(view, d1, d12, l03Var)) {
            view.measure(d1, d12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x040c, code lost:            if (B0() != false) goto L254;     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S0(androidx.recyclerview.widget.e r17, defpackage.wh2 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(androidx.recyclerview.widget.e, wh2, boolean):void");
    }

    public final boolean T0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.t == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.x) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == Q0()) {
            return true;
        }
        return false;
    }

    public final void U0(int i, wh2 wh2Var) {
        int K0;
        int i2;
        if (i > 0) {
            K0 = L0();
            i2 = 1;
        } else {
            K0 = K0();
            i2 = -1;
        }
        ti1 ti1Var = this.v;
        ti1Var.f4512a = true;
        b1(K0, wh2Var);
        a1(i2);
        ti1Var.c = K0 + ti1Var.d;
        ti1Var.f4513b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.c
    public final void V(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void V0(e eVar, ti1 ti1Var) {
        int min;
        int min2;
        if (ti1Var.f4512a && !ti1Var.i) {
            if (ti1Var.f4513b == 0) {
                if (ti1Var.e == -1) {
                    W0(ti1Var.g, eVar);
                    return;
                } else {
                    X0(ti1Var.f, eVar);
                    return;
                }
            }
            int i = 1;
            if (ti1Var.e == -1) {
                int i2 = ti1Var.f;
                int i3 = this.q[0].i(i2);
                while (i < this.p) {
                    int i4 = this.q[i].i(i2);
                    if (i4 > i3) {
                        i3 = i4;
                    }
                    i++;
                }
                int i5 = i2 - i3;
                if (i5 < 0) {
                    min2 = ti1Var.g;
                } else {
                    min2 = ti1Var.g - Math.min(i5, ti1Var.f4513b);
                }
                W0(min2, eVar);
                return;
            }
            int i6 = ti1Var.g;
            int f = this.q[0].f(i6);
            while (i < this.p) {
                int f2 = this.q[i].f(i6);
                if (f2 < f) {
                    f = f2;
                }
                i++;
            }
            int i7 = f - ti1Var.g;
            if (i7 < 0) {
                min = ti1Var.f;
            } else {
                min = Math.min(i7, ti1Var.f4513b) + ti1Var.f;
            }
            X0(min, eVar);
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void W() {
        this.B.e();
        l0();
    }

    public final void W0(int i, e eVar) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            if (this.r.d(u) >= i && this.r.k(u) >= i) {
                l03 l03Var = (l03) u.getLayoutParams();
                l03Var.getClass();
                if (l03Var.e.f3215a.size() == 1) {
                    return;
                }
                m03 m03Var = l03Var.e;
                ArrayList arrayList = m03Var.f3215a;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                l03 h = m03.h(view);
                h.e = null;
                if (h.c() || h.b()) {
                    m03Var.d -= m03Var.f.r.c(view);
                }
                if (size == 1) {
                    m03Var.f3216b = Integer.MIN_VALUE;
                }
                m03Var.c = Integer.MIN_VALUE;
                i0(u, eVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void X(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void X0(int i, e eVar) {
        while (v() > 0) {
            View u = u(0);
            if (this.r.b(u) <= i && this.r.j(u) <= i) {
                l03 l03Var = (l03) u.getLayoutParams();
                l03Var.getClass();
                if (l03Var.e.f3215a.size() == 1) {
                    return;
                }
                m03 m03Var = l03Var.e;
                ArrayList arrayList = m03Var.f3215a;
                View view = (View) arrayList.remove(0);
                l03 h = m03.h(view);
                h.e = null;
                if (arrayList.size() == 0) {
                    m03Var.c = Integer.MIN_VALUE;
                }
                if (h.c() || h.b()) {
                    m03Var.d -= m03Var.f.r.c(view);
                }
                m03Var.f3216b = Integer.MIN_VALUE;
                i0(u, eVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void Y(int i, int i2) {
        O0(i, i2, 2);
    }

    public final void Y0() {
        if (this.t != 1 && Q0()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void Z(int i, int i2) {
        O0(i, i2, 4);
    }

    public final int Z0(int i, e eVar, wh2 wh2Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, wh2Var);
        ti1 ti1Var = this.v;
        int F0 = F0(eVar, ti1Var, wh2Var);
        if (ti1Var.f4513b >= F0) {
            if (i < 0) {
                i = -F0;
            } else {
                i = F0;
            }
        }
        this.r.l(-i);
        this.D = this.x;
        ti1Var.f4513b = 0;
        V0(eVar, ti1Var);
        return i;
    }

    @Override // defpackage.vh2
    public final PointF a(int i) {
        int A0 = A0(i);
        PointF pointF = new PointF();
        if (A0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = A0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = A0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.c
    public final void a0(e eVar, wh2 wh2Var) {
        S0(eVar, wh2Var, true);
    }

    public final void a1(int i) {
        boolean z;
        ti1 ti1Var = this.v;
        ti1Var.e = i;
        boolean z2 = this.x;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        ti1Var.d = i2;
    }

    @Override // androidx.recyclerview.widget.c
    public final void b0(wh2 wh2Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b1(int r5, defpackage.wh2 r6) {
        /*
            r4 = this;
            ti1 r0 = r4.v
            r1 = 0
            r0.f4513b = r1
            r0.c = r5
            nk1 r2 = r4.e
            r3 = 1
            if (r2 == 0) goto L12
            boolean r2 = r2.e
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L33
            int r6 = r6.f5010a
            r2 = -1
            if (r6 == r2) goto L33
            boolean r2 = r4.x
            if (r6 >= r5) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r2 != r5) goto L2a
            v32 r5 = r4.r
            int r5 = r5.i()
            goto L34
        L2a:
            v32 r5 = r4.r
            int r5 = r5.i()
            r6 = r5
            r5 = 0
            goto L35
        L33:
            r5 = 0
        L34:
            r6 = 0
        L35:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f275b
            if (r2 == 0) goto L3f
            boolean r2 = r2.h
            if (r2 == 0) goto L3f
            r2 = 1
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 == 0) goto L55
            v32 r2 = r4.r
            int r2 = r2.h()
            int r2 = r2 - r6
            r0.f = r2
            v32 r6 = r4.r
            int r6 = r6.f()
            int r6 = r6 + r5
            r0.g = r6
            goto L61
        L55:
            v32 r2 = r4.r
            int r2 = r2.e()
            int r2 = r2 + r5
            r0.g = r2
            int r5 = -r6
            r0.f = r5
        L61:
            r0.h = r1
            r0.f4512a = r3
            v32 r5 = r4.r
            int r5 = r5.g()
            if (r5 != 0) goto L76
            v32 r5 = r4.r
            int r5 = r5.e()
            if (r5 != 0) goto L76
            r1 = 1
        L76:
            r0.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b1(int, wh2):void");
    }

    @Override // androidx.recyclerview.widget.c
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c1(m03 m03Var, int i, int i2) {
        int i3 = m03Var.d;
        int i4 = m03Var.e;
        if (i == -1) {
            int i5 = m03Var.f3216b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) m03Var.f3215a.get(0);
                l03 h = m03.h(view);
                m03Var.f3216b = m03Var.f.r.d(view);
                h.getClass();
                i5 = m03Var.f3216b;
            }
            if (i5 + i3 <= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = m03Var.c;
        if (i6 == Integer.MIN_VALUE) {
            m03Var.a();
            i6 = m03Var.c;
        }
        if (i6 - i3 >= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean d() {
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.c
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.z != -1) {
                savedState.d = null;
                savedState.c = 0;
                savedState.f271a = -1;
                savedState.f272b = -1;
                savedState.d = null;
                savedState.c = 0;
                savedState.e = 0;
                savedState.f = null;
                savedState.g = null;
            }
            l0();
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean e() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.c
    public final Parcelable e0() {
        int K0;
        View H0;
        int i;
        int h;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.h = this.w;
        savedState2.i = this.D;
        savedState2.j = this.E;
        j jVar = this.B;
        if (jVar != null && (iArr = (int[]) jVar.f284b) != null) {
            savedState2.f = iArr;
            savedState2.e = iArr.length;
            savedState2.g = (List) jVar.c;
        } else {
            savedState2.e = 0;
        }
        int i2 = -1;
        if (v() > 0) {
            if (this.D) {
                K0 = L0();
            } else {
                K0 = K0();
            }
            savedState2.f271a = K0;
            if (this.x) {
                H0 = G0(true);
            } else {
                H0 = H0(true);
            }
            if (H0 != null) {
                i2 = c.F(H0);
            }
            savedState2.f272b = i2;
            int i3 = this.p;
            savedState2.c = i3;
            savedState2.d = new int[i3];
            for (int i4 = 0; i4 < this.p; i4++) {
                if (this.D) {
                    i = this.q[i4].f(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        h = this.r.f();
                        i -= h;
                        savedState2.d[i4] = i;
                    } else {
                        savedState2.d[i4] = i;
                    }
                } else {
                    i = this.q[i4].i(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        h = this.r.h();
                        i -= h;
                        savedState2.d[i4] = i;
                    } else {
                        savedState2.d[i4] = i;
                    }
                }
            }
        } else {
            savedState2.f271a = -1;
            savedState2.f272b = -1;
            savedState2.c = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean f(d dVar) {
        return dVar instanceof l03;
    }

    @Override // androidx.recyclerview.widget.c
    public final void f0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void h(int i, int i2, wh2 wh2Var, p10 p10Var) {
        ti1 ti1Var;
        boolean z;
        int f;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            U0(i, wh2Var);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.p) {
                this.J = new int[this.p];
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = this.p;
                ti1Var = this.v;
                if (i4 >= i6) {
                    break;
                }
                if (ti1Var.d == -1) {
                    f = ti1Var.f;
                    i3 = this.q[i4].i(f);
                } else {
                    f = this.q[i4].f(ti1Var.g);
                    i3 = ti1Var.g;
                }
                int i7 = f - i3;
                if (i7 >= 0) {
                    this.J[i5] = i7;
                    i5++;
                }
                i4++;
            }
            Arrays.sort(this.J, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = ti1Var.c;
                if (i9 >= 0 && i9 < wh2Var.b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    p10Var.f(ti1Var.c, this.J[i8]);
                    ti1Var.c += ti1Var.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final int j(wh2 wh2Var) {
        return C0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final int k(wh2 wh2Var) {
        return D0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final int l(wh2 wh2Var) {
        return E0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final int m(wh2 wh2Var) {
        return C0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final int m0(int i, e eVar, wh2 wh2Var) {
        return Z0(i, eVar, wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final int n(wh2 wh2Var) {
        return D0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final void n0(int i) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.f271a != i) {
            savedState.d = null;
            savedState.c = 0;
            savedState.f271a = -1;
            savedState.f272b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        l0();
    }

    @Override // androidx.recyclerview.widget.c
    public final int o(wh2 wh2Var) {
        return E0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final int o0(int i, e eVar, wh2 wh2Var) {
        return Z0(i, eVar, wh2Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final d r() {
        if (this.t == 0) {
            return new l03(-2, -1);
        }
        return new l03(-1, -2);
    }

    @Override // androidx.recyclerview.widget.c
    public final void r0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int D = D() + C();
        int B = B() + E();
        if (this.t == 1) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.f275b;
            WeakHashMap weakHashMap = ll3.f3151a;
            g2 = c.g(i2, height, uk3.d(recyclerView));
            g = c.g(i, (this.u * this.p) + D, uk3.e(this.f275b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f275b;
            WeakHashMap weakHashMap2 = ll3.f3151a;
            g = c.g(i, width, uk3.e(recyclerView2));
            g2 = c.g(i2, (this.u * this.p) + B, uk3.d(this.f275b));
        }
        RecyclerView.g(this.f275b, g, g2);
    }

    @Override // androidx.recyclerview.widget.c
    public final d s(Context context, AttributeSet attributeSet) {
        return new l03(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.c
    public final d t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new l03((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new l03(layoutParams);
    }

    @Override // androidx.recyclerview.widget.c
    public final void x0(RecyclerView recyclerView, int i) {
        nk1 nk1Var = new nk1(recyclerView.getContext());
        nk1Var.f3477a = i;
        y0(nk1Var);
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean z0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new k();

        /* renamed from: a, reason: collision with root package name */
        public int f271a;

        /* renamed from: b, reason: collision with root package name */
        public int f272b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public List g;
        public boolean h;
        public boolean i;
        public boolean j;

        public SavedState(Parcel parcel) {
            this.f271a = parcel.readInt();
            this.f272b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f271a);
            parcel.writeInt(this.f272b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.f271a = savedState.f271a;
            this.f272b = savedState.f272b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }
    }
}
