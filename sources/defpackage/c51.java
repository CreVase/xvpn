package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c51 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final a51 f = new a51();

    /* renamed from: b, reason: collision with root package name */
    public long f582b;
    public long c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f581a = new ArrayList();
    public final ArrayList d = new ArrayList();

    public static h c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.f.h();
        int i2 = 0;
        while (true) {
            if (i2 < h) {
                h M = RecyclerView.M(recyclerView.f.g(i2));
                if (M.c == i && !M.m()) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return null;
        }
        e eVar = recyclerView.c;
        try {
            recyclerView.S();
            h l = eVar.l(j, i);
            if (l != null) {
                if (l.l() && !l.m()) {
                    eVar.i(l.f281a);
                } else {
                    eVar.a(l, false);
                }
            }
            return l;
        } finally {
            recyclerView.T(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.L0 && !this.f581a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f582b == 0) {
                this.f582b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        p10 p10Var = recyclerView.r0;
        p10Var.f3764a = i;
        p10Var.f3765b = i2;
    }

    public final void b(long j) {
        b51 b51Var;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        b51 b51Var2;
        boolean z;
        ArrayList arrayList = this.f581a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                p10 p10Var = recyclerView3.r0;
                p10Var.g(recyclerView3, false);
                i += p10Var.c;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                p10 p10Var2 = recyclerView4.r0;
                int abs = Math.abs(p10Var2.f3765b) + Math.abs(p10Var2.f3764a);
                for (int i5 = 0; i5 < p10Var2.c * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        b51Var2 = new b51();
                        arrayList2.add(b51Var2);
                    } else {
                        b51Var2 = (b51) arrayList2.get(i3);
                    }
                    int[] iArr = (int[]) p10Var2.d;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b51Var2.f404a = z;
                    b51Var2.f405b = abs;
                    b51Var2.c = i6;
                    b51Var2.d = recyclerView4;
                    b51Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (b51Var = (b51) arrayList2.get(i7)).d) != null; i7++) {
            if (b51Var.f404a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            h c = c(recyclerView, b51Var.e, j2);
            if (c != null && c.f282b != null && c.l() && !c.m() && (recyclerView2 = (RecyclerView) c.f282b.get()) != null) {
                if (recyclerView2.C && recyclerView2.f.h() != 0) {
                    lh2 lh2Var = recyclerView2.L;
                    if (lh2Var != null) {
                        lh2Var.e();
                    }
                    c cVar = recyclerView2.n;
                    e eVar = recyclerView2.c;
                    if (cVar != null) {
                        cVar.g0(eVar);
                        recyclerView2.n.h0(eVar);
                    }
                    eVar.f278a.clear();
                    eVar.g();
                }
                p10 p10Var3 = recyclerView2.r0;
                p10Var3.g(recyclerView2, true);
                if (p10Var3.c != 0) {
                    try {
                        int i8 = qa3.f3976a;
                        pa3.a("RV Nested Prefetch");
                        wh2 wh2Var = recyclerView2.s0;
                        fh2 fh2Var = recyclerView2.m;
                        wh2Var.d = 1;
                        wh2Var.e = fh2Var.c();
                        wh2Var.g = false;
                        wh2Var.h = false;
                        wh2Var.i = false;
                        for (int i9 = 0; i9 < p10Var3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) p10Var3.d)[i9], j);
                        }
                        pa3.b();
                        b51Var.f404a = false;
                        b51Var.f405b = 0;
                        b51Var.c = 0;
                        b51Var.d = null;
                        b51Var.e = 0;
                    } catch (Throwable th) {
                        int i10 = qa3.f3976a;
                        pa3.b();
                        throw th;
                    }
                }
            }
            b51Var.f404a = false;
            b51Var.f405b = 0;
            b51Var.c = 0;
            b51Var.d = null;
            b51Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = qa3.f3976a;
            pa3.a("RV Prefetch");
            ArrayList arrayList = this.f581a;
            if (arrayList.isEmpty()) {
                this.f582b = 0L;
                pa3.b();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f582b = 0L;
                pa3.b();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                this.f582b = 0L;
                pa3.b();
            }
        } catch (Throwable th) {
            this.f582b = 0L;
            int i3 = qa3.f3976a;
            pa3.b();
            throw th;
        }
    }
}
