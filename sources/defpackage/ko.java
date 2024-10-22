package defpackage;

/* loaded from: classes.dex */
public abstract class ko implements b62 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2983a;
    public cj2 c;
    public int d;
    public z52 e;
    public int f;
    public rm2 g;
    public y01[] h;
    public long i;
    public boolean k;
    public boolean l;

    /* renamed from: b, reason: collision with root package name */
    public final x50 f2984b = new x50((u50) null);
    public long j = Long.MIN_VALUE;

    public ko(int i) {
        this.f2983a = i;
    }

    @Override // defpackage.b62
    public void c(int i, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jt0 e(int r13, defpackage.y01 r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.l
            if (r3 != 0) goto L1d
            r3 = 1
            r1.l = r3
            r3 = 0
            int r4 = r12.x(r14)     // Catch: java.lang.Throwable -> L16 defpackage.jt0 -> L1b
            r4 = r4 & 7
            r1.l = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.l = r3
            throw r2
        L1b:
            r1.l = r3
        L1d:
            r4 = 4
        L1e:
            java.lang.String r6 = r12.h()
            int r7 = r1.d
            jt0 r11 = new jt0
            r3 = 1
            if (r0 != 0) goto L2b
            r9 = 4
            goto L2c
        L2b:
            r9 = r4
        L2c:
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko.e(int, y01, java.lang.Exception, boolean):jt0");
    }

    public final jt0 f(hs1 hs1Var, y01 y01Var) {
        return e(4002, y01Var, hs1Var, false);
    }

    public rr1 g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        if (this.j == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean j();

    public abstract boolean k();

    public abstract void l();

    public void m(boolean z, boolean z2) {
    }

    public abstract void n(long j, boolean z);

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public abstract void r(y01[] y01VarArr, long j, long j2);

    public final int s(x50 x50Var, ve0 ve0Var, int i) {
        rm2 rm2Var = this.g;
        rm2Var.getClass();
        int i2 = rm2Var.i(x50Var, ve0Var, i);
        if (i2 == -4) {
            if (ve0Var.g(4)) {
                this.j = Long.MIN_VALUE;
                if (this.k) {
                    return -4;
                }
                return -3;
            }
            long j = ve0Var.f + this.i;
            ve0Var.f = j;
            this.j = Math.max(this.j, j);
        } else if (i2 == -5) {
            y01 y01Var = (y01) x50Var.c;
            y01Var.getClass();
            if (y01Var.p != Long.MAX_VALUE) {
                x01 a2 = y01Var.a();
                a2.o = y01Var.p + this.i;
                x50Var.c = a2.a();
            }
        }
        return i2;
    }

    public abstract void t(long j, long j2);

    public final void u(y01[] y01VarArr, rm2 rm2Var, long j, long j2) {
        cp3.m(!this.k);
        this.g = rm2Var;
        if (this.j == Long.MIN_VALUE) {
            this.j = j;
        }
        this.h = y01VarArr;
        this.i = j2;
        r(y01VarArr, j, j2);
    }

    public final void v() {
        boolean z;
        if (this.f == 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        this.f2984b.j();
        o();
    }

    public void w(float f, float f2) {
    }

    public abstract int x(y01 y01Var);

    public int y() {
        return 0;
    }
}
