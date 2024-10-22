package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class w4 extends cv1 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ b5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(b5 b5Var, Context context, ju1 ju1Var, a5 a5Var) {
        super(context, ju1Var, a5Var, true, ie2.actionOverflowMenuStyle);
        this.n = b5Var;
        this.g = 8388613;
        v51 v51Var = b5Var.w;
        this.i = v51Var;
        zu1 zu1Var = this.j;
        if (zu1Var != null) {
            zu1Var.f(v51Var);
        }
    }

    @Override // defpackage.cv1
    public final void c() {
        int i = this.m;
        b5 b5Var = this.n;
        switch (i) {
            case 0:
                b5Var.t = null;
                super.c();
                return;
            default:
                ju1 ju1Var = b5Var.c;
                if (ju1Var != null) {
                    ju1Var.c(true);
                }
                b5Var.s = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(b5 b5Var, Context context, q23 q23Var, View view) {
        super(context, q23Var, view, false, ie2.actionOverflowMenuStyle);
        this.n = b5Var;
        if (!q23Var.A.f()) {
            View view2 = b5Var.i;
            this.f = view2 == null ? (View) b5Var.h : view2;
        }
        v51 v51Var = b5Var.w;
        this.i = v51Var;
        zu1 zu1Var = this.j;
        if (zu1Var != null) {
            zu1Var.f(v51Var);
        }
    }
}
