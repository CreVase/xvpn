package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e10 extends gt3 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final z83 r;
    public c10 s;
    public d10 t;
    public long u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e10(fo foVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(foVar);
        boolean z4;
        foVar.getClass();
        if (j >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        cp3.e(z4);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new z83();
    }

    @Override // defpackage.fo
    public final lt1 a(rt1 rt1Var, cf0 cf0Var, long j) {
        b10 b10Var = new b10(this.k.a(rt1Var, cf0Var, j), this.n, this.u, this.v);
        this.q.add(b10Var);
        return b10Var;
    }

    @Override // defpackage.j40, defpackage.fo
    public final void i() {
        d10 d10Var = this.t;
        if (d10Var == null) {
            super.i();
            return;
        }
        throw d10Var;
    }

    @Override // defpackage.fo
    public final void m(lt1 lt1Var) {
        ArrayList arrayList = this.q;
        cp3.m(arrayList.remove(lt1Var));
        this.k.m(((b10) lt1Var).f384a);
        if (arrayList.isEmpty() && !this.o) {
            c10 c10Var = this.s;
            c10Var.getClass();
            z(c10Var.e);
        }
    }

    @Override // defpackage.j40, defpackage.fo
    public final void o() {
        super.o();
        this.t = null;
        this.s = null;
    }

    @Override // defpackage.gt3
    public final void x(a93 a93Var) {
        if (this.t != null) {
            return;
        }
        z(a93Var);
    }

    public final void z(a93 a93Var) {
        long j;
        long j2;
        long j3;
        z83 z83Var = this.r;
        a93Var.n(0, z83Var);
        long j4 = z83Var.q;
        c10 c10Var = this.s;
        long j5 = this.m;
        long j6 = Long.MIN_VALUE;
        ArrayList arrayList = this.q;
        if (c10Var != null && !arrayList.isEmpty() && !this.o) {
            long j7 = this.u - j4;
            if (j5 != Long.MIN_VALUE) {
                j6 = this.v - j4;
            }
            j3 = j6;
            j2 = j7;
        } else {
            boolean z = this.p;
            long j8 = this.l;
            if (z) {
                long j9 = z83Var.m;
                j8 += j9;
                j = j9 + j5;
            } else {
                j = j5;
            }
            this.u = j4 + j8;
            if (j5 != Long.MIN_VALUE) {
                j6 = j4 + j;
            }
            this.v = j6;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b10 b10Var = (b10) arrayList.get(i);
                long j10 = this.u;
                long j11 = this.v;
                b10Var.e = j10;
                b10Var.f = j11;
            }
            j2 = j8;
            j3 = j;
        }
        try {
            c10 c10Var2 = new c10(a93Var, j2, j3);
            this.s = c10Var2;
            l(c10Var2);
        } catch (d10 e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((b10) arrayList.get(i2)).g = this.t;
            }
        }
    }
}
