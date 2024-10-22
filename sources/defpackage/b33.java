package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class b33 extends we0 implements v23 {
    public v23 d;
    public long e;

    @Override // defpackage.v23
    public final int a(long j) {
        v23 v23Var = this.d;
        v23Var.getClass();
        return v23Var.a(j - this.e);
    }

    @Override // defpackage.v23
    public final long b(int i) {
        v23 v23Var = this.d;
        v23Var.getClass();
        return v23Var.b(i) + this.e;
    }

    @Override // defpackage.v23
    public final List c(long j) {
        v23 v23Var = this.d;
        v23Var.getClass();
        return v23Var.c(j - this.e);
    }

    @Override // defpackage.v23
    public final int d() {
        v23 v23Var = this.d;
        v23Var.getClass();
        return v23Var.d();
    }

    public final void j(long j, v23 v23Var, long j2) {
        this.c = j;
        this.d = v23Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }
}
