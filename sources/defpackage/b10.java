package defpackage;

/* loaded from: classes.dex */
public final class b10 implements lt1, kt1 {

    /* renamed from: a, reason: collision with root package name */
    public final lt1 f384a;

    /* renamed from: b, reason: collision with root package name */
    public kt1 f385b;
    public a10[] c = new a10[0];
    public long d;
    public long e;
    public long f;
    public d10 g;

    public b10(lt1 lt1Var, boolean z, long j, long j2) {
        long j3;
        this.f384a = lt1Var;
        if (z) {
            j3 = j;
        } else {
            j3 = -9223372036854775807L;
        }
        this.d = j3;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.kt1
    public final void a(lt1 lt1Var) {
        if (this.g != null) {
            return;
        }
        kt1 kt1Var = this.f385b;
        kt1Var.getClass();
        kt1Var.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:            if (r1 > r5) goto L36;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // defpackage.lt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.mu0[] r16, boolean[] r17, defpackage.rm2[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            a10[] r1 = new defpackage.a10[r1]
            r0.c = r1
            int r1 = r9.length
            rm2[] r10 = new defpackage.rm2[r1]
            r11 = 0
            r1 = 0
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            a10[] r2 = r0.c
            r3 = r9[r1]
            a10 r3 = (defpackage.a10) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            rm2 r12 = r3.f12a
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            lt1 r1 = r0.f384a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.b(r2, r3, r4, r5, r6)
            boolean r3 = r15.j()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.e
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = 0
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            y01 r6 = r6.h()
            java.lang.String r7 = r6.l
            java.lang.String r6 = r6.i
            boolean r6 = defpackage.vw1.a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = 1
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = 0
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.d = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.e
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.f
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = 0
        L85:
            defpackage.cp3.m(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            a10[] r3 = r0.c
            r3[r11] = r12
            goto La5
        L94:
            a10[] r4 = r0.c
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            rm2 r5 = r5.f12a
            if (r5 == r3) goto La5
        L9e:
            a10 r5 = new a10
            r5.<init>(r15, r3)
            r4[r11] = r5
        La5:
            a10[] r3 = r0.c
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.b(mu0[], boolean[], rm2[], boolean[], long):long");
    }

    @Override // defpackage.kt1
    public final void c(hp2 hp2Var) {
        kt1 kt1Var = this.f385b;
        kt1Var.getClass();
        kt1Var.c(this);
    }

    @Override // defpackage.hp2
    public final long d() {
        long d = this.f384a.d();
        if (d != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.lt1
    public final long e(long j, mo2 mo2Var) {
        long j2;
        long j3 = this.e;
        if (j == j3) {
            return j3;
        }
        long j4 = wi3.j(mo2Var.f3327a, 0L, j - j3);
        long j5 = mo2Var.f3328b;
        long j6 = this.f;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long j7 = wi3.j(j5, 0L, j2);
        if (j4 != mo2Var.f3327a || j7 != mo2Var.f3328b) {
            mo2Var = new mo2(j4, j7);
        }
        return this.f384a.e(j, mo2Var);
    }

    @Override // defpackage.lt1
    public final void f() {
        d10 d10Var = this.g;
        if (d10Var == null) {
            this.f384a.f();
            return;
        }
        throw d10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:            if (r0 > r7) goto L17;     */
    @Override // defpackage.lt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.d = r0
            a10[] r0 = r6.c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f13b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            lt1 r0 = r6.f384a
            long r0 = r0.g(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L33
            long r7 = r6.e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L34
            long r7 = r6.f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L33
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L34
        L33:
            r2 = 1
        L34:
            defpackage.cp3.m(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.g(long):long");
    }

    @Override // defpackage.hp2
    public final boolean h(long j) {
        return this.f384a.h(j);
    }

    @Override // defpackage.hp2
    public final boolean i() {
        return this.f384a.i();
    }

    public final boolean j() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lt1
    public final long k() {
        boolean z;
        if (j()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long k = k();
            if (k != -9223372036854775807L) {
                return k;
            }
            return j;
        }
        long k2 = this.f384a.k();
        if (k2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if (k2 >= this.e) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        long j2 = this.f;
        if (j2 != Long.MIN_VALUE && k2 > j2) {
            z2 = false;
        }
        cp3.m(z2);
        return k2;
    }

    @Override // defpackage.lt1
    public final void n(kt1 kt1Var, long j) {
        this.f385b = kt1Var;
        this.f384a.n(this, j);
    }

    @Override // defpackage.lt1
    public final va3 p() {
        return this.f384a.p();
    }

    @Override // defpackage.hp2
    public final long t() {
        long t = this.f384a.t();
        if (t != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || t < j) {
                return t;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.lt1
    public final void v(long j, boolean z) {
        this.f384a.v(j, z);
    }

    @Override // defpackage.hp2
    public final void x(long j) {
        this.f384a.x(j);
    }
}
