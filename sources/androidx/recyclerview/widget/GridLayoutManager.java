package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import defpackage.c61;
import defpackage.g3;
import defpackage.hx2;
import defpackage.j93;
import defpackage.jk1;
import defpackage.lk1;
import defpackage.ll3;
import defpackage.p10;
import defpackage.uk3;
import defpackage.wh2;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final j93 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new j93(1);
        this.L = new Rect();
        m1(c.G(context, attributeSet, i, i2).f3664b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(wh2 wh2Var, lk1 lk1Var, p10 p10Var) {
        boolean z;
        int i = this.F;
        for (int i2 = 0; i2 < this.F; i2++) {
            int i3 = lk1Var.d;
            if (i3 >= 0 && i3 < wh2Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i > 0) {
                p10Var.f(lk1Var.d, Math.max(0, lk1Var.g));
                this.K.getClass();
                i--;
                lk1Var.d += lk1Var.e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final int H(e eVar, wh2 wh2Var) {
        if (this.p == 0) {
            return this.F;
        }
        if (wh2Var.b() < 1) {
            return 0;
        }
        return i1(wh2Var.b() - 1, eVar, wh2Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(e eVar, wh2 wh2Var, boolean z, boolean z2) {
        int i;
        int i2;
        int v = v();
        int i3 = 1;
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
        }
        int b2 = wh2Var.b();
        G0();
        int h = this.r.h();
        int f = this.r.f();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int F = c.F(u);
            if (F >= 0 && F < b2 && j1(F, eVar, wh2Var) == 0) {
                if (((d) u.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = u;
                    }
                } else {
                    if (this.r.d(u) < f && this.r.b(u) >= h) {
                        return u;
                    }
                    if (view == null) {
                        view = u;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:            if (r13 == r5) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0110, code lost:            if (r13 == r5) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x001e, code lost:            if (r22.f274a.j(r3) != false) goto L5;     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View Q(android.view.View r23, int r24, androidx.recyclerview.widget.e r25, defpackage.wh2 r26) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, androidx.recyclerview.widget.e, wh2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.c
    public final void S(e eVar, wh2 wh2Var, g3 g3Var) {
        super.S(eVar, wh2Var, g3Var);
        g3Var.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.c
    public final void U(e eVar, wh2 wh2Var, View view, g3 g3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c61)) {
            T(view, g3Var);
            return;
        }
        c61 c61Var = (c61) layoutParams;
        int i1 = i1(c61Var.a(), eVar, wh2Var);
        int i = this.p;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c61Var.e, c61Var.f, i1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, 1, c61Var.e, c61Var.f, false, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(androidx.recyclerview.widget.e r19, defpackage.wh2 r20, defpackage.lk1 r21, defpackage.kk1 r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U0(androidx.recyclerview.widget.e, wh2, lk1, kk1):void");
    }

    @Override // androidx.recyclerview.widget.c
    public final void V(int i, int i2) {
        j93 j93Var = this.K;
        j93Var.d();
        ((SparseIntArray) j93Var.e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(e eVar, wh2 wh2Var, jk1 jk1Var, int i) {
        boolean z;
        n1();
        if (wh2Var.b() > 0 && !wh2Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int j1 = j1(jk1Var.f2779b, eVar, wh2Var);
            if (z) {
                while (j1 > 0) {
                    int i2 = jk1Var.f2779b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    jk1Var.f2779b = i3;
                    j1 = j1(i3, eVar, wh2Var);
                }
            } else {
                int b2 = wh2Var.b() - 1;
                int i4 = jk1Var.f2779b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int j12 = j1(i5, eVar, wh2Var);
                    if (j12 <= j1) {
                        break;
                    }
                    i4 = i5;
                    j1 = j12;
                }
                jk1Var.f2779b = i4;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final void W() {
        j93 j93Var = this.K;
        j93Var.d();
        ((SparseIntArray) j93Var.e).clear();
    }

    @Override // androidx.recyclerview.widget.c
    public final void X(int i, int i2) {
        j93 j93Var = this.K;
        j93Var.d();
        ((SparseIntArray) j93Var.e).clear();
    }

    @Override // androidx.recyclerview.widget.c
    public final void Y(int i, int i2) {
        j93 j93Var = this.K;
        j93Var.d();
        ((SparseIntArray) j93Var.e).clear();
    }

    @Override // androidx.recyclerview.widget.c
    public final void Z(int i, int i2) {
        j93 j93Var = this.K;
        j93Var.d();
        ((SparseIntArray) j93Var.e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final void a0(e eVar, wh2 wh2Var) {
        boolean z = wh2Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                c61 c61Var = (c61) u(i).getLayoutParams();
                int a2 = c61Var.a();
                sparseIntArray2.put(a2, c61Var.f);
                sparseIntArray.put(a2, c61Var.e);
            }
        }
        super.a0(eVar, wh2Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final void b0(wh2 wh2Var) {
        super.b0(wh2Var);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z) {
        if (!z) {
            super.c1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean f(d dVar) {
        return dVar instanceof c61;
    }

    public final void g1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final int h1(int i, int i2) {
        if (this.p == 1 && T0()) {
            int[] iArr = this.G;
            int i3 = this.F;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.G;
        return iArr2[i2 + i] - iArr2[i];
    }

    public final int i1(int i, e eVar, wh2 wh2Var) {
        boolean z = wh2Var.g;
        j93 j93Var = this.K;
        if (!z) {
            return j93Var.a(i, this.F);
        }
        int b2 = eVar.b(i);
        if (b2 == -1) {
            return 0;
        }
        return j93Var.a(b2, this.F);
    }

    public final int j1(int i, e eVar, wh2 wh2Var) {
        boolean z = wh2Var.g;
        j93 j93Var = this.K;
        if (!z) {
            return j93Var.b(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b2 = eVar.b(i);
        if (b2 == -1) {
            return 0;
        }
        return j93Var.b(b2, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final int k(wh2 wh2Var) {
        return D0(wh2Var);
    }

    public final int k1(int i, e eVar, wh2 wh2Var) {
        boolean z = wh2Var.g;
        j93 j93Var = this.K;
        if (!z) {
            j93Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (eVar.b(i) == -1) {
            return 1;
        }
        j93Var.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final int l(wh2 wh2Var) {
        return E0(wh2Var);
    }

    public final void l1(View view, boolean z, int i) {
        int i2;
        int i3;
        boolean u0;
        c61 c61Var = (c61) view.getLayoutParams();
        Rect rect = c61Var.f277b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c61Var).topMargin + ((ViewGroup.MarginLayoutParams) c61Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c61Var).leftMargin + ((ViewGroup.MarginLayoutParams) c61Var).rightMargin;
        int h1 = h1(c61Var.e, c61Var.f);
        if (this.p == 1) {
            i3 = c.w(h1, i, i5, ((ViewGroup.MarginLayoutParams) c61Var).width, false);
            i2 = c.w(this.r.i(), this.m, i4, ((ViewGroup.MarginLayoutParams) c61Var).height, true);
        } else {
            int w = c.w(h1, i, i4, ((ViewGroup.MarginLayoutParams) c61Var).height, false);
            int w2 = c.w(this.r.i(), this.l, i5, ((ViewGroup.MarginLayoutParams) c61Var).width, true);
            i2 = w;
            i3 = w2;
        }
        d dVar = (d) view.getLayoutParams();
        if (z) {
            u0 = w0(view, i3, i2, dVar);
        } else {
            u0 = u0(view, i3, i2, dVar);
        }
        if (u0) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final int m0(int i, e eVar, wh2 wh2Var) {
        n1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.m0(i, eVar, wh2Var);
    }

    public final void m1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i >= 1) {
            this.F = i;
            this.K.d();
            l0();
            return;
        }
        throw new IllegalArgumentException(hx2.m("Span count should be at least 1. Provided ", i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final int n(wh2 wh2Var) {
        return D0(wh2Var);
    }

    public final void n1() {
        int B;
        int E;
        if (this.p == 1) {
            B = this.n - D();
            E = C();
        } else {
            B = this.o - B();
            E = E();
        }
        g1(B - E);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final int o(wh2 wh2Var) {
        return E0(wh2Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final int o0(int i, e eVar, wh2 wh2Var) {
        n1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.o0(i, eVar, wh2Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final d r() {
        if (this.p == 0) {
            return new c61(-2, -1);
        }
        return new c61(-1, -2);
    }

    @Override // androidx.recyclerview.widget.c
    public final void r0(Rect rect, int i, int i2) {
        int g;
        int g2;
        if (this.G == null) {
            super.r0(rect, i, i2);
        }
        int D = D() + C();
        int B = B() + E();
        if (this.p == 1) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.f275b;
            WeakHashMap weakHashMap = ll3.f3151a;
            g2 = c.g(i2, height, uk3.d(recyclerView));
            int[] iArr = this.G;
            g = c.g(i, iArr[iArr.length - 1] + D, uk3.e(this.f275b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f275b;
            WeakHashMap weakHashMap2 = ll3.f3151a;
            g = c.g(i, width, uk3.e(recyclerView2));
            int[] iArr2 = this.G;
            g2 = c.g(i2, iArr2[iArr2.length - 1] + B, uk3.d(this.f275b));
        }
        this.f275b.setMeasuredDimension(g, g2);
    }

    @Override // androidx.recyclerview.widget.c
    public d s(Context context, AttributeSet attributeSet) {
        return new c61(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.c
    public final d t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c61((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c61(layoutParams);
    }

    @Override // androidx.recyclerview.widget.c
    public final int x(e eVar, wh2 wh2Var) {
        if (this.p == 1) {
            return this.F;
        }
        if (wh2Var.b() < 1) {
            return 0;
        }
        return i1(wh2Var.b() - 1, eVar, wh2Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final boolean z0() {
        if (this.z == null && !this.E) {
            return true;
        }
        return false;
    }

    public GridLayoutManager() {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new j93(1);
        this.L = new Rect();
        m1(2);
    }

    public GridLayoutManager(int i) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new j93(1);
        this.L = new Rect();
        m1(i);
    }
}
