package defpackage;

/* loaded from: classes.dex */
public final class pv1 implements lt1, kt1 {

    /* renamed from: a, reason: collision with root package name */
    public final lt1 f3923a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3924b;
    public kt1 c;

    public pv1(lt1 lt1Var, long j) {
        this.f3923a = lt1Var;
        this.f3924b = j;
    }

    @Override // defpackage.kt1
    public final void a(lt1 lt1Var) {
        kt1 kt1Var = this.c;
        kt1Var.getClass();
        kt1Var.a(this);
    }

    @Override // defpackage.lt1
    public final long b(mu0[] mu0VarArr, boolean[] zArr, rm2[] rm2VarArr, boolean[] zArr2, long j) {
        rm2[] rm2VarArr2 = new rm2[rm2VarArr.length];
        int i = 0;
        while (true) {
            rm2 rm2Var = null;
            if (i >= rm2VarArr.length) {
                break;
            }
            qv1 qv1Var = (qv1) rm2VarArr[i];
            if (qv1Var != null) {
                rm2Var = qv1Var.f4059a;
            }
            rm2VarArr2[i] = rm2Var;
            i++;
        }
        lt1 lt1Var = this.f3923a;
        long j2 = this.f3924b;
        long b2 = lt1Var.b(mu0VarArr, zArr, rm2VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < rm2VarArr.length; i2++) {
            rm2 rm2Var2 = rm2VarArr2[i2];
            if (rm2Var2 == null) {
                rm2VarArr[i2] = null;
            } else {
                rm2 rm2Var3 = rm2VarArr[i2];
                if (rm2Var3 == null || ((qv1) rm2Var3).f4059a != rm2Var2) {
                    rm2VarArr[i2] = new qv1(rm2Var2, j2);
                }
            }
        }
        return b2 + j2;
    }

    @Override // defpackage.kt1
    public final void c(hp2 hp2Var) {
        kt1 kt1Var = this.c;
        kt1Var.getClass();
        kt1Var.c(this);
    }

    @Override // defpackage.hp2
    public final long d() {
        long d = this.f3923a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f3924b + d;
    }

    @Override // defpackage.lt1
    public final long e(long j, mo2 mo2Var) {
        long j2 = this.f3924b;
        return this.f3923a.e(j - j2, mo2Var) + j2;
    }

    @Override // defpackage.lt1
    public final void f() {
        this.f3923a.f();
    }

    @Override // defpackage.lt1
    public final long g(long j) {
        long j2 = this.f3924b;
        return this.f3923a.g(j - j2) + j2;
    }

    @Override // defpackage.hp2
    public final boolean h(long j) {
        return this.f3923a.h(j - this.f3924b);
    }

    @Override // defpackage.hp2
    public final boolean i() {
        return this.f3923a.i();
    }

    @Override // defpackage.lt1
    public final long k() {
        long k = this.f3923a.k();
        if (k == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f3924b + k;
    }

    @Override // defpackage.lt1
    public final void n(kt1 kt1Var, long j) {
        this.c = kt1Var;
        this.f3923a.n(this, j - this.f3924b);
    }

    @Override // defpackage.lt1
    public final va3 p() {
        return this.f3923a.p();
    }

    @Override // defpackage.hp2
    public final long t() {
        long t = this.f3923a.t();
        if (t == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f3924b + t;
    }

    @Override // defpackage.lt1
    public final void v(long j, boolean z) {
        this.f3923a.v(j - this.f3924b, z);
    }

    @Override // defpackage.hp2
    public final void x(long j) {
        this.f3923a.x(j - this.f3924b);
    }
}
