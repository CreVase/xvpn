package defpackage;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class su extends bx3 {
    public final Typeface l;
    public final v51 m;
    public boolean n;

    public su(v51 v51Var, Typeface typeface) {
        this.l = typeface;
        this.m = v51Var;
    }

    @Override // defpackage.bx3
    public final void P(int i) {
        if (!this.n) {
            x10 x10Var = (x10) this.m.f4780b;
            if (x10Var.j(this.l)) {
                x10Var.h(false);
            }
        }
    }

    @Override // defpackage.bx3
    public final void Q(Typeface typeface, boolean z) {
        if (!this.n) {
            x10 x10Var = (x10) this.m.f4780b;
            if (x10Var.j(typeface)) {
                x10Var.h(false);
            }
        }
    }
}
