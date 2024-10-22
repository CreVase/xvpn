package androidx.recyclerview.widget;

import android.view.View;
import defpackage.fh2;
import defpackage.kh2;
import defpackage.w7;
import defpackage.zh0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f273a;

    public /* synthetic */ b(RecyclerView recyclerView) {
        this.f273a = recyclerView;
    }

    public final void a(w7 w7Var) {
        int i = w7Var.f4952a;
        RecyclerView recyclerView = this.f273a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        recyclerView.n.X(w7Var.f4953b, w7Var.d);
                        return;
                    }
                    return;
                }
                recyclerView.n.Z(w7Var.f4953b, w7Var.d);
                return;
            }
            recyclerView.n.Y(w7Var.f4953b, w7Var.d);
            return;
        }
        recyclerView.n.V(w7Var.f4953b, w7Var.d);
    }

    public final h b(int i) {
        RecyclerView recyclerView = this.f273a;
        int h = recyclerView.f.h();
        int i2 = 0;
        h hVar = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            h M = RecyclerView.M(recyclerView.f.g(i2));
            if (M != null && !M.o() && M.c == i) {
                if (recyclerView.f.j(M.f281a)) {
                    hVar = M;
                } else {
                    hVar = M;
                    break;
                }
            }
            i2++;
        }
        if (hVar == null) {
            return null;
        }
        if (recyclerView.f.j(hVar.f281a)) {
            boolean z = RecyclerView.L0;
            return null;
        }
        return hVar;
    }

    public final int c() {
        return this.f273a.getChildCount();
    }

    public final void d(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f273a;
        int h = recyclerView.f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.f.g(i6);
            h M = RecyclerView.M(g);
            if (M != null && !M.z() && (i4 = M.c) >= i && i4 < i5) {
                M.c(2);
                M.b(obj);
                ((d) g.getLayoutParams()).c = true;
            }
        }
        e eVar = recyclerView.c;
        ArrayList arrayList = eVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                h hVar = (h) arrayList.get(size);
                if (hVar != null && (i3 = hVar.c) >= i && i3 < i5) {
                    hVar.c(2);
                    eVar.h(size);
                }
            } else {
                recyclerView.w0 = true;
                return;
            }
        }
    }

    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.f273a;
        int h = recyclerView.f.h();
        for (int i3 = 0; i3 < h; i3++) {
            h M = RecyclerView.M(recyclerView.f.g(i3));
            if (M != null && !M.z() && M.c >= i) {
                if (RecyclerView.M0) {
                    M.toString();
                }
                M.v(i2, false);
                recyclerView.s0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            h hVar = (h) arrayList.get(i4);
            if (hVar != null && hVar.c >= i) {
                if (RecyclerView.M0) {
                    hVar.toString();
                }
                hVar.v(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.v0 = true;
    }

    public final void f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f273a;
        int h = recyclerView.f.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            h M = RecyclerView.M(recyclerView.f.g(i11));
            if (M != null && (i9 = M.c) >= i4 && i9 <= i3) {
                if (RecyclerView.M0) {
                    M.toString();
                }
                if (M.c == i) {
                    M.v(i2 - i, false);
                } else {
                    M.v(i5, false);
                }
                recyclerView.s0.f = true;
            }
        }
        e eVar = recyclerView.c;
        eVar.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = eVar.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = (h) arrayList.get(i12);
            if (hVar != null && (i8 = hVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    hVar.v(i2 - i, false);
                } else {
                    hVar.v(i10, false);
                }
                if (RecyclerView.M0) {
                    hVar.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.v0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(androidx.recyclerview.widget.h r9, defpackage.kh2 r10, defpackage.kh2 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f273a
            r0.getClass()
            r1 = 0
            r9.y(r1)
            lh2 r1 = r0.L
            r2 = r1
            zh0 r2 = (defpackage.zh0) r2
            if (r10 == 0) goto L29
            r2.getClass()
            int r4 = r10.f2946a
            int r6 = r11.f2946a
            if (r4 != r6) goto L1f
            int r1 = r10.f2947b
            int r3 = r11.f2947b
            if (r1 == r3) goto L29
        L1f:
            int r5 = r10.f2947b
            int r7 = r11.f2947b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L38
        L29:
            r2.l(r9)
            android.view.View r10 = r9.f281a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.i
            r10.add(r9)
            r9 = 1
        L38:
            if (r9 == 0) goto L3d
            r0.V()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.g(androidx.recyclerview.widget.h, kh2, kh2):void");
    }

    public final void h(h hVar, kh2 kh2Var, kh2 kh2Var2) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = this.f273a;
        recyclerView.c.m(hVar);
        recyclerView.h(hVar);
        hVar.y(false);
        zh0 zh0Var = (zh0) recyclerView.L;
        zh0Var.getClass();
        int i3 = kh2Var.f2946a;
        int i4 = kh2Var.f2947b;
        View view = hVar.f281a;
        if (kh2Var2 == null) {
            i = view.getLeft();
        } else {
            i = kh2Var2.f2946a;
        }
        int i5 = i;
        if (kh2Var2 == null) {
            i2 = view.getTop();
        } else {
            i2 = kh2Var2.f2947b;
        }
        int i6 = i2;
        if (!hVar.o() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z = zh0Var.g(hVar, i3, i4, i5, i6);
        } else {
            zh0Var.l(hVar);
            zh0Var.h.add(hVar);
            z = true;
        }
        if (z) {
            recyclerView.V();
        }
    }

    public final void i(int i) {
        RecyclerView recyclerView = this.f273a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            h M = RecyclerView.M(childAt);
            fh2 fh2Var = recyclerView.m;
            if (fh2Var != null && M != null) {
                fh2Var.y(M);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
