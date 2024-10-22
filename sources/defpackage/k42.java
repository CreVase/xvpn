package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;

/* loaded from: classes.dex */
public final class k42 extends ph2 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2882a;

    /* renamed from: b, reason: collision with root package name */
    public final bx2 f2883b = new bx2(this);
    public u32 c;
    public u32 d;

    public static int b(View view, v32 v32Var) {
        return ((v32Var.c(view) / 2) + v32Var.d(view)) - ((v32Var.i() / 2) + v32Var.h());
    }

    public static View c(c cVar, v32 v32Var) {
        int v = cVar.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int i = (v32Var.i() / 2) + v32Var.h();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < v; i3++) {
            View u = cVar.u(i3);
            int abs = Math.abs(((v32Var.c(u) / 2) + v32Var.d(u)) - i);
            if (abs < i2) {
                view = u;
                i2 = abs;
            }
        }
        return view;
    }

    public final int[] a(c cVar, View view) {
        int[] iArr = new int[2];
        if (cVar.d()) {
            iArr[0] = b(view, d(cVar));
        } else {
            iArr[0] = 0;
        }
        if (cVar.e()) {
            iArr[1] = b(view, e(cVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final v32 d(c cVar) {
        u32 u32Var = this.d;
        if (u32Var == null || u32Var.f4775a != cVar) {
            this.d = new u32(cVar, 0);
        }
        return this.d;
    }

    public final v32 e(c cVar) {
        u32 u32Var = this.c;
        if (u32Var == null || u32Var.f4775a != cVar) {
            this.c = new u32(cVar, 1);
        }
        return this.c;
    }

    public final void f() {
        c layoutManager;
        View view;
        RecyclerView recyclerView = this.f2882a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a2 = a(layoutManager, view);
                int i = a2[0];
                if (i != 0 || a2[1] != 0) {
                    this.f2882a.h0(i, a2[1], false);
                }
            }
        }
    }
}
