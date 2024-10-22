package androidx.recyclerview.widget;

import defpackage.fh2;
import defpackage.hh2;
import defpackage.hx2;
import defpackage.ll3;
import defpackage.uk3;
import defpackage.x7;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f extends hh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f280a;

    public f(RecyclerView recyclerView) {
        this.f280a = recyclerView;
    }

    @Override // defpackage.hh2
    public final void a() {
        RecyclerView recyclerView = this.f280a;
        recyclerView.k(null);
        recyclerView.s0.f = true;
        recyclerView.X(true);
        if (!recyclerView.e.g()) {
            recyclerView.requestLayout();
        }
    }

    @Override // defpackage.hh2
    public final void c(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.f280a;
        recyclerView.k(null);
        x7 x7Var = recyclerView.e;
        boolean z = true;
        boolean z2 = false;
        if (i2 < 1) {
            x7Var.getClass();
        } else {
            ArrayList arrayList = x7Var.f5125b;
            arrayList.add(x7Var.h(4, i, i2, obj));
            x7Var.f |= 4;
            if (arrayList.size() != 1) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            g();
        }
    }

    @Override // defpackage.hh2
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.f280a;
        recyclerView.k(null);
        x7 x7Var = recyclerView.e;
        boolean z = true;
        boolean z2 = false;
        if (i2 < 1) {
            x7Var.getClass();
        } else {
            ArrayList arrayList = x7Var.f5125b;
            arrayList.add(x7Var.h(1, i, i2, null));
            x7Var.f |= 1;
            if (arrayList.size() != 1) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            g();
        }
    }

    @Override // defpackage.hh2
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.f280a;
        recyclerView.k(null);
        x7 x7Var = recyclerView.e;
        boolean z = true;
        boolean z2 = false;
        if (i2 < 1) {
            x7Var.getClass();
        } else {
            ArrayList arrayList = x7Var.f5125b;
            arrayList.add(x7Var.h(2, i, i2, null));
            x7Var.f |= 2;
            if (arrayList.size() != 1) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            g();
        }
    }

    @Override // defpackage.hh2
    public final void f() {
        fh2 fh2Var;
        RecyclerView recyclerView = this.f280a;
        if (recyclerView.d != null && (fh2Var = recyclerView.m) != null) {
            int x = hx2.x(fh2Var.c);
            boolean z = true;
            if (x == 1 ? fh2Var.c() <= 0 : x == 2) {
                z = false;
            }
            if (z) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void g() {
        boolean z = RecyclerView.Q0;
        RecyclerView recyclerView = this.f280a;
        if (z && recyclerView.t && recyclerView.s) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.m(recyclerView, recyclerView.i);
        } else {
            recyclerView.A = true;
            recyclerView.requestLayout();
        }
    }
}
