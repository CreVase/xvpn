package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zv2 implements rm2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5557a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5558b;
    public final /* synthetic */ bw2 c;

    public zv2(bw2 bw2Var) {
        this.c = bw2Var;
    }

    public final void a() {
        if (!this.f5558b) {
            bw2 bw2Var = this.c;
            vt1 vt1Var = bw2Var.e;
            vt1Var.b(new et1(1, vw1.f(bw2Var.j.l), bw2Var.j, 0, null, vt1Var.a(0L), -9223372036854775807L));
            this.f5558b = true;
        }
    }

    @Override // defpackage.rm2
    public final void g() {
        IOException iOException;
        bw2 bw2Var = this.c;
        if (!bw2Var.k) {
            fm1 fm1Var = bw2Var.i;
            IOException iOException2 = fm1Var.c;
            if (iOException2 == null) {
                zl1 zl1Var = fm1Var.f2118b;
                if (zl1Var != null && (iOException = zl1Var.e) != null && zl1Var.f > zl1Var.f5505a) {
                    throw iOException;
                }
                return;
            }
            throw iOException2;
        }
    }

    @Override // defpackage.rm2
    public final int h(long j) {
        a();
        if (j > 0 && this.f5557a != 2) {
            this.f5557a = 2;
            return 1;
        }
        return 0;
    }

    @Override // defpackage.rm2
    public final int i(x50 x50Var, ve0 ve0Var, int i) {
        a();
        bw2 bw2Var = this.c;
        boolean z = bw2Var.l;
        if (z && bw2Var.m == null) {
            this.f5557a = 2;
        }
        int i2 = this.f5557a;
        if (i2 == 2) {
            ve0Var.e(4);
            return -4;
        }
        if ((i & 2) == 0 && i2 != 0) {
            if (!z) {
                return -3;
            }
            bw2Var.m.getClass();
            ve0Var.e(1);
            ve0Var.f = 0L;
            if ((i & 4) == 0) {
                ve0Var.k(bw2Var.n);
                ve0Var.d.put(bw2Var.m, 0, bw2Var.n);
            }
            if ((i & 1) == 0) {
                this.f5557a = 2;
            }
            return -4;
        }
        x50Var.c = bw2Var.j;
        this.f5557a = 1;
        return -5;
    }

    @Override // defpackage.rm2
    public final boolean isReady() {
        return this.c.l;
    }
}
