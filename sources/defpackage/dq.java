package defpackage;

/* loaded from: classes.dex */
public abstract class dq {

    /* renamed from: a, reason: collision with root package name */
    public final yp f1817a;

    /* renamed from: b, reason: collision with root package name */
    public final cq f1818b;
    public zp c;
    public final int d;

    public dq(aq aqVar, cq cqVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.f1818b = cqVar;
        this.d = i;
        this.f1817a = new yp(aqVar, j, j2, j3, j4, j5);
    }

    public static int b(ev0 ev0Var, long j, lm2 lm2Var) {
        if (j == ev0Var.getPosition()) {
            return 0;
        }
        lm2Var.f3157a = j;
        return 1;
    }

    public final int a(ev0 ev0Var, lm2 lm2Var) {
        boolean z;
        while (true) {
            zp zpVar = this.c;
            cp3.o(zpVar);
            long j = zpVar.f;
            long j2 = zpVar.g;
            long j3 = zpVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            cq cqVar = this.f1818b;
            if (j4 <= j5) {
                this.c = null;
                cqVar.d();
                return b(ev0Var, j, lm2Var);
            }
            long position = j3 - ev0Var.getPosition();
            if (position >= 0 && position <= 262144) {
                ev0Var.m((int) position);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return b(ev0Var, j3, lm2Var);
            }
            ev0Var.l();
            bq c = cqVar.c(ev0Var, zpVar.f5527b);
            int i = c.c;
            if (i != -3) {
                long j6 = c.f509a;
                long j7 = c.f510b;
                if (i != -2) {
                    if (i != -1) {
                        if (i == 0) {
                            long position2 = j7 - ev0Var.getPosition();
                            if (position2 >= 0 && position2 <= 262144) {
                                ev0Var.m((int) position2);
                            }
                            this.c = null;
                            cqVar.d();
                            return b(ev0Var, j7, lm2Var);
                        }
                        throw new IllegalStateException("Invalid case");
                    }
                    zpVar.e = j6;
                    zpVar.g = j7;
                    zpVar.h = zp.a(zpVar.f5527b, zpVar.d, j6, zpVar.f, j7, zpVar.c);
                } else {
                    zpVar.d = j6;
                    zpVar.f = j7;
                    zpVar.h = zp.a(zpVar.f5527b, j6, zpVar.e, j7, zpVar.g, zpVar.c);
                }
            } else {
                this.c = null;
                cqVar.d();
                return b(ev0Var, j3, lm2Var);
            }
        }
    }

    public final void c(long j) {
        zp zpVar = this.c;
        if (zpVar != null && zpVar.f5526a == j) {
            return;
        }
        yp ypVar = this.f1817a;
        this.c = new zp(j, ypVar.f5370a.c(j), ypVar.c, ypVar.d, ypVar.e, ypVar.f, ypVar.g);
    }
}
