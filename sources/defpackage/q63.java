package defpackage;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class q63 extends tf3 {
    public final /* synthetic */ bx3 K;
    public final /* synthetic */ s63 L;

    public q63(s63 s63Var, bx3 bx3Var) {
        this.L = s63Var;
        this.K = bx3Var;
    }

    @Override // defpackage.tf3
    public final void l0(int i) {
        this.L.m = true;
        this.K.P(i);
    }

    @Override // defpackage.tf3
    public final void m0(Typeface typeface) {
        s63 s63Var = this.L;
        s63Var.n = Typeface.create(typeface, s63Var.c);
        s63Var.m = true;
        this.K.Q(s63Var.n, false);
    }
}
