package defpackage;

/* loaded from: classes.dex */
public final class lq1 implements lt1, kt1 {

    /* renamed from: a, reason: collision with root package name */
    public final rt1 f3173a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3174b;
    public final cf0 c;
    public fo d;
    public lt1 e;
    public kt1 f;
    public long g = -9223372036854775807L;

    public lq1(rt1 rt1Var, cf0 cf0Var, long j) {
        this.f3173a = rt1Var;
        this.c = cf0Var;
        this.f3174b = j;
    }

    @Override // defpackage.kt1
    public final void a(lt1 lt1Var) {
        kt1 kt1Var = this.f;
        int i = wi3.f5017a;
        kt1Var.a(this);
    }

    @Override // defpackage.lt1
    public final long b(mu0[] mu0VarArr, boolean[] zArr, rm2[] rm2VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.g;
        if (j3 != -9223372036854775807L && j == this.f3174b) {
            this.g = -9223372036854775807L;
            j2 = j3;
        } else {
            j2 = j;
        }
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        return lt1Var.b(mu0VarArr, zArr, rm2VarArr, zArr2, j2);
    }

    @Override // defpackage.kt1
    public final void c(hp2 hp2Var) {
        kt1 kt1Var = this.f;
        int i = wi3.f5017a;
        kt1Var.c(this);
    }

    @Override // defpackage.hp2
    public final long d() {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        return lt1Var.d();
    }

    @Override // defpackage.lt1
    public final long e(long j, mo2 mo2Var) {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        return lt1Var.e(j, mo2Var);
    }

    @Override // defpackage.lt1
    public final void f() {
        lt1 lt1Var = this.e;
        if (lt1Var != null) {
            lt1Var.f();
            return;
        }
        fo foVar = this.d;
        if (foVar != null) {
            foVar.i();
        }
    }

    @Override // defpackage.lt1
    public final long g(long j) {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        return lt1Var.g(j);
    }

    @Override // defpackage.hp2
    public final boolean h(long j) {
        lt1 lt1Var = this.e;
        if (lt1Var != null && lt1Var.h(j)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hp2
    public final boolean i() {
        lt1 lt1Var = this.e;
        if (lt1Var != null && lt1Var.i()) {
            return true;
        }
        return false;
    }

    public final void j(rt1 rt1Var) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.f3174b;
        }
        fo foVar = this.d;
        foVar.getClass();
        lt1 a2 = foVar.a(rt1Var, this.c, j);
        this.e = a2;
        if (this.f != null) {
            a2.n(this, j);
        }
    }

    @Override // defpackage.lt1
    public final long k() {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        return lt1Var.k();
    }

    public final void l() {
        if (this.e != null) {
            fo foVar = this.d;
            foVar.getClass();
            foVar.m(this.e);
        }
    }

    @Override // defpackage.lt1
    public final void n(kt1 kt1Var, long j) {
        this.f = kt1Var;
        lt1 lt1Var = this.e;
        if (lt1Var != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.f3174b;
            }
            lt1Var.n(this, j2);
        }
    }

    @Override // defpackage.lt1
    public final va3 p() {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        return lt1Var.p();
    }

    @Override // defpackage.hp2
    public final long t() {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        return lt1Var.t();
    }

    @Override // defpackage.lt1
    public final void v(long j, boolean z) {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        lt1Var.v(j, z);
    }

    @Override // defpackage.hp2
    public final void x(long j) {
        lt1 lt1Var = this.e;
        int i = wi3.f5017a;
        lt1Var.x(j);
    }
}
