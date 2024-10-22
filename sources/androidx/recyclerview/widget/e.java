package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import defpackage.ai2;
import defpackage.bi2;
import defpackage.fh2;
import defpackage.k62;
import defpackage.l2;
import defpackage.ll3;
import defpackage.p10;
import defpackage.p71;
import defpackage.sh2;
import defpackage.th2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f278a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f279b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public th2 g;
    public final /* synthetic */ RecyclerView h;

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f278a = arrayList;
        this.f279b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(h hVar, boolean z) {
        l2 l2Var;
        RecyclerView.l(hVar);
        RecyclerView recyclerView = this.h;
        bi2 bi2Var = recyclerView.z0;
        View view = hVar.f281a;
        if (bi2Var != null) {
            ai2 ai2Var = bi2Var.e;
            if (ai2Var instanceof ai2) {
                l2Var = (l2) ai2Var.e.remove(view);
            } else {
                l2Var = null;
            }
            ll3.p(view, l2Var);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() <= 0) {
                fh2 fh2Var = recyclerView.m;
                if (fh2Var != null) {
                    fh2Var.z(hVar);
                }
                if (recyclerView.s0 != null) {
                    recyclerView.g.p(hVar);
                }
                if (RecyclerView.M0) {
                    Objects.toString(hVar);
                }
            } else {
                p71.C(arrayList.get(0));
                throw null;
            }
        }
        hVar.s = null;
        hVar.r = null;
        th2 c = c();
        c.getClass();
        int i = hVar.f;
        ArrayList arrayList2 = c.a(i).f4343a;
        if (((sh2) c.f4504a.get(i)).f4344b <= arrayList2.size()) {
            k62.a(view);
        } else {
            if (RecyclerView.L0 && arrayList2.contains(hVar)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            hVar.w();
            arrayList2.add(hVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.s0.b()) {
            if (!recyclerView.s0.g) {
                return i;
            }
            return recyclerView.e.f(i, 0);
        }
        StringBuilder o = p71.o("invalid position ", i, ". State item count is ");
        o.append(recyclerView.s0.b());
        o.append(recyclerView.B());
        throw new IndexOutOfBoundsException(o.toString());
    }

    public final th2 c() {
        if (this.g == null) {
            this.g = new th2();
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(Long.MAX_VALUE, i).f281a;
    }

    public final void e() {
        if (this.g != null) {
            RecyclerView recyclerView = this.h;
            if (recyclerView.m != null && recyclerView.isAttachedToWindow()) {
                th2 th2Var = this.g;
                th2Var.c.add(recyclerView.m);
            }
        }
    }

    public final void f(fh2 fh2Var, boolean z) {
        th2 th2Var = this.g;
        if (th2Var != null) {
            Set set = th2Var.c;
            set.remove(fh2Var);
            if (set.size() == 0 && !z) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = th2Var.f4504a;
                    if (i < sparseArray.size()) {
                        ArrayList arrayList = ((sh2) sparseArray.get(sparseArray.keyAt(i))).f4343a;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            k62.a(((h) arrayList.get(i2)).f281a);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.R0) {
            p10 p10Var = this.h.r0;
            int[] iArr = (int[]) p10Var.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            p10Var.c = 0;
        }
    }

    public final void h(int i) {
        boolean z = RecyclerView.L0;
        ArrayList arrayList = this.c;
        h hVar = (h) arrayList.get(i);
        if (RecyclerView.M0) {
            Objects.toString(hVar);
        }
        a(hVar, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        h M = RecyclerView.M(view);
        boolean t = M.t();
        RecyclerView recyclerView = this.h;
        if (t) {
            recyclerView.removeDetachedView(view, false);
        }
        if (M.s()) {
            M.n.m(M);
        } else if (M.A()) {
            M.j &= -33;
        }
        j(M);
        if (recyclerView.L != null && !M.n()) {
            recyclerView.L.d(M);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b7, code lost:            if (r6 == false) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b9, code lost:            r5 = r5 - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bb, code lost:            if (r5 < 0) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bd, code lost:            r6 = ((androidx.recyclerview.widget.h) r7.get(r5)).c;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c9, code lost:            if (((int[]) r8.d) == null) goto L73;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cb, code lost:            r9 = r8.c * 2;        r10 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d0, code lost:            if (r10 >= r9) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d8, code lost:            if (((int[]) r8.d)[r10] != r6) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00dc, code lost:            r10 = r10 + 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:            r6 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e0, code lost:            if (r6 != false) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e2, code lost:            r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00df, code lost:            r6 = false;     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.recyclerview.widget.h r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.j(androidx.recyclerview.widget.h):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.View r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.h r6 = androidx.recyclerview.widget.RecyclerView.M(r6)
            int r0 = r6.j
            r1 = r0 & 12
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            androidx.recyclerview.widget.RecyclerView r4 = r5.h
            if (r1 != 0) goto L5e
            r0 = r0 & 2
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L5e
            lh2 r0 = r4.L
            if (r0 == 0) goto L45
            java.util.List r1 = r6.g()
            zh0 r0 = (defpackage.zh0) r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f
            boolean r0 = r0.g
            if (r0 == 0) goto L39
            boolean r0 = r6.m()
            if (r0 == 0) goto L37
            goto L39
        L37:
            r0 = 0
            goto L3a
        L39:
            r0 = 1
        L3a:
            if (r0 == 0) goto L3d
            goto L3f
        L3d:
            r0 = 0
            goto L40
        L3f:
            r0 = 1
        L40:
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = 0
            goto L46
        L45:
            r0 = 1
        L46:
            if (r0 == 0) goto L49
            goto L5e
        L49:
            java.util.ArrayList r0 = r5.f279b
            if (r0 != 0) goto L54
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f279b = r0
        L54:
            r6.n = r5
            r6.o = r2
            java.util.ArrayList r0 = r5.f279b
            r0.add(r6)
            goto L8b
        L5e:
            boolean r0 = r6.m()
            if (r0 == 0) goto L82
            boolean r0 = r6.o()
            if (r0 != 0) goto L82
            fh2 r0 = r4.m
            boolean r0 = r0.f2092b
            if (r0 == 0) goto L71
            goto L82
        L71:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r1)
            java.lang.String r0 = defpackage.hx2.l(r4, r0)
            r6.<init>(r0)
            throw r6
        L82:
            r6.n = r5
            r6.o = r3
            java.util.ArrayList r0 = r5.f278a
            r0.add(r6)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.k(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x0424, code lost:            if (r8.m() == false) goto L252;     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x047b, code lost:            if (r7 == false) goto L252;     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.h l(long r20, int r22) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.l(long, int):androidx.recyclerview.widget.h");
    }

    public final void m(h hVar) {
        if (hVar.o) {
            this.f279b.remove(hVar);
        } else {
            this.f278a.remove(hVar);
        }
        hVar.n = null;
        hVar.o = false;
        hVar.j &= -33;
    }

    public final void n() {
        int i;
        c cVar = this.h.n;
        if (cVar != null) {
            i = cVar.j;
        } else {
            i = 0;
        }
        this.f = this.e + i;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
