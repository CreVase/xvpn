package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class x92 extends fo {
    public final dt1 h;
    public final zs1 i;
    public final yd0 j;
    public final z5 k;
    public final xn0 l;
    public final d5 m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public hb3 s;

    public x92(dt1 dt1Var, yd0 yd0Var, z5 z5Var, xn0 xn0Var, d5 d5Var, int i) {
        zs1 zs1Var = dt1Var.f1834b;
        zs1Var.getClass();
        this.i = zs1Var;
        this.h = dt1Var;
        this.j = yd0Var;
        this.k = z5Var;
        this.l = xn0Var;
        this.m = d5Var;
        this.n = i;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // defpackage.fo
    public final lt1 a(rt1 rt1Var, cf0 cf0Var, long j) {
        zd0 a2 = this.j.a();
        hb3 hb3Var = this.s;
        if (hb3Var != null) {
            a2.d(hb3Var);
        }
        zs1 zs1Var = this.i;
        Uri uri = zs1Var.f5381a;
        cp3.o(this.g);
        return new u92(uri, a2, new y33((gv0) this.k.f5428b), this.l, new un0(this.d.c, 0, rt1Var), this.m, new vt1(this.c.c, 0, rt1Var), this, cf0Var, zs1Var.e, this.n);
    }

    @Override // defpackage.fo
    public final dt1 g() {
        return this.h;
    }

    @Override // defpackage.fo
    public final void i() {
    }

    @Override // defpackage.fo
    public final void k(hb3 hb3Var) {
        this.s = hb3Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        z52 z52Var = this.g;
        cp3.o(z52Var);
        xn0 xn0Var = this.l;
        xn0Var.k(myLooper, z52Var);
        xn0Var.e();
        r();
    }

    @Override // defpackage.fo
    public final void m(lt1 lt1Var) {
        u92 u92Var = (u92) lt1Var;
        if (u92Var.v) {
            for (qm2 qm2Var : u92Var.s) {
                qm2Var.g();
                rn0 rn0Var = qm2Var.h;
                if (rn0Var != null) {
                    rn0Var.c(qm2Var.e);
                    qm2Var.h = null;
                    qm2Var.g = null;
                }
            }
        }
        fm1 fm1Var = u92Var.k;
        zl1 zl1Var = fm1Var.f2118b;
        if (zl1Var != null) {
            zl1Var.a(true);
        }
        qw3 qw3Var = new qw3(u92Var, 16);
        ExecutorService executorService = fm1Var.f2117a;
        executorService.execute(qw3Var);
        executorService.shutdown();
        u92Var.p.removeCallbacksAndMessages(null);
        u92Var.q = null;
        u92Var.L = true;
    }

    @Override // defpackage.fo
    public final void o() {
        this.l.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [v92] */
    /* JADX WARN: Type inference failed for: r7v0, types: [x92, fo] */
    public final void r() {
        av2 av2Var = new av2(this.p, this.q, this.r, this.h);
        if (this.o) {
            av2Var = new v92(av2Var);
        }
        l(av2Var);
    }

    public final void s(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.p;
        }
        if (!this.o && this.p == j && this.q == z && this.r == z2) {
            return;
        }
        this.p = j;
        this.q = z;
        this.r = z2;
        this.o = false;
        r();
    }
}
