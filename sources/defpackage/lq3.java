package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class lq3 extends nq3 {
    public final WindowInsets.Builder c;

    public lq3() {
        this.c = no1.f();
    }

    @Override // defpackage.nq3
    public wq3 b() {
        WindowInsets build;
        a();
        build = this.c.build();
        wq3 h = wq3.h(null, build);
        h.f5059a.o(this.f3520b);
        return h;
    }

    @Override // defpackage.nq3
    public void d(rc1 rc1Var) {
        this.c.setMandatorySystemGestureInsets(rc1Var.d());
    }

    @Override // defpackage.nq3
    public void e(rc1 rc1Var) {
        this.c.setStableInsets(rc1Var.d());
    }

    @Override // defpackage.nq3
    public void f(rc1 rc1Var) {
        this.c.setSystemGestureInsets(rc1Var.d());
    }

    @Override // defpackage.nq3
    public void g(rc1 rc1Var) {
        this.c.setSystemWindowInsets(rc1Var.d());
    }

    @Override // defpackage.nq3
    public void h(rc1 rc1Var) {
        this.c.setTappableElementInsets(rc1Var.d());
    }

    public lq3(wq3 wq3Var) {
        super(wq3Var);
        WindowInsets.Builder f;
        WindowInsets g = wq3Var.g();
        if (g != null) {
            f = bo3.c(g);
        } else {
            f = no1.f();
        }
        this.c = f;
    }
}
