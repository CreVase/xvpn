package defpackage;

import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xc implements g5 {

    /* renamed from: a, reason: collision with root package name */
    public final g5 f5142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jd f5143b;

    public xc(jd jdVar, g5 g5Var) {
        this.f5143b = jdVar;
        this.f5142a = g5Var;
    }

    @Override // defpackage.g5
    public final boolean c(h5 h5Var, MenuItem menuItem) {
        return this.f5142a.c(h5Var, menuItem);
    }

    @Override // defpackage.g5
    public final void g(h5 h5Var) {
        this.f5142a.g(h5Var);
        jd jdVar = this.f5143b;
        if (jdVar.w != null) {
            jdVar.l.getDecorView().removeCallbacks(jdVar.x);
        }
        if (jdVar.v != null) {
            rm3 rm3Var = jdVar.y;
            if (rm3Var != null) {
                rm3Var.b();
            }
            rm3 a2 = ll3.a(jdVar.v);
            a2.a(0.0f);
            jdVar.y = a2;
            a2.d(new wc(this, 2));
        }
        lc lcVar = jdVar.n;
        if (lcVar != null) {
            lcVar.onSupportActionModeFinished(jdVar.u);
        }
        jdVar.u = null;
        ViewGroup viewGroup = jdVar.A;
        WeakHashMap weakHashMap = ll3.f3151a;
        yk3.c(viewGroup);
        jdVar.R();
    }

    @Override // defpackage.g5
    public final boolean j(h5 h5Var, ju1 ju1Var) {
        return this.f5142a.j(h5Var, ju1Var);
    }

    @Override // defpackage.g5
    public final boolean l(h5 h5Var, ju1 ju1Var) {
        ViewGroup viewGroup = this.f5143b.A;
        WeakHashMap weakHashMap = ll3.f3151a;
        yk3.c(viewGroup);
        return this.f5142a.l(h5Var, ju1Var);
    }
}
