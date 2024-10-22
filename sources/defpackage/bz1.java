package defpackage;

/* loaded from: classes.dex */
public final class bz1 extends hh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cz1 f556a;

    public bz1(cz1 cz1Var) {
        this.f556a = cz1Var;
    }

    @Override // defpackage.hh2
    public final void a() {
        cz1 cz1Var = this.f556a;
        cz1Var.e = cz1Var.c.c();
        o40 o40Var = cz1Var.d;
        ((n40) o40Var.f3596a).f();
        o40Var.a();
    }

    @Override // defpackage.hh2
    public final void b(int i, int i2) {
        cz1 cz1Var = this.f556a;
        o40 o40Var = cz1Var.d;
        ((n40) o40Var.f3596a).f2091a.c(i + o40Var.b(cz1Var), i2, null);
    }

    @Override // defpackage.hh2
    public final void c(int i, int i2, Object obj) {
        cz1 cz1Var = this.f556a;
        o40 o40Var = cz1Var.d;
        ((n40) o40Var.f3596a).f2091a.c(i + o40Var.b(cz1Var), i2, obj);
    }

    @Override // defpackage.hh2
    public final void d(int i, int i2) {
        cz1 cz1Var = this.f556a;
        cz1Var.e += i2;
        o40 o40Var = cz1Var.d;
        ((n40) o40Var.f3596a).l(i + o40Var.b(cz1Var), i2);
        if (cz1Var.e > 0 && cz1Var.c.c == 2) {
            o40Var.a();
        }
    }

    @Override // defpackage.hh2
    public final void e(int i, int i2) {
        cz1 cz1Var = this.f556a;
        cz1Var.e -= i2;
        o40 o40Var = cz1Var.d;
        ((n40) o40Var.f3596a).f2091a.e(i + o40Var.b(cz1Var), i2);
        if (cz1Var.e < 1 && cz1Var.c.c == 2) {
            o40Var.a();
        }
    }

    @Override // defpackage.hh2
    public final void f() {
        this.f556a.d.a();
    }
}
