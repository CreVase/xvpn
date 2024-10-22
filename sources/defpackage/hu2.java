package defpackage;

/* loaded from: classes2.dex */
public final class hu2 extends em3 {
    public final boolean d;
    public final String e = "SignInSignUpModel";
    public final ey1 f;
    public final ey1 g;
    public final ey1 h;
    public final ey1 i;
    public final ey1 j;
    public final ey1 k;
    public final ey1 l;
    public final ey1 m;
    public final ey1 n;
    public String o;
    public String p;
    public final ey1 q;
    public final ey1 r;
    public final ey1 s;
    public boolean t;
    public o03 u;
    public o03 v;
    public o03 w;
    public boolean x;

    public hu2(boolean z) {
        this.d = z;
        Boolean bool = Boolean.FALSE;
        this.f = new ey1(bool);
        this.g = new ey1(bool);
        this.h = new ey1(bool);
        this.i = new ey1(bool);
        this.j = new ey1("");
        this.k = new ey1("");
        this.l = new ey1("");
        this.m = new ey1("");
        this.n = new ey1(0);
        this.o = "";
        this.p = "";
        this.q = new ey1("");
        this.r = new ey1("");
        this.s = new ey1("");
    }

    public static final void i(hu2 hu2Var) {
        hu2Var.j.i("");
        boolean z = yc2.f5314a;
        yc2.f5314a = hu2Var.t;
        ew3.T0("");
        t9.a();
    }

    public final void l() {
        if (!this.x) {
            m();
        }
    }

    public final void m() {
        o03 o03Var = this.v;
        if (o03Var != null) {
            o03Var.c(null);
        }
        o03 o03Var2 = this.u;
        if (o03Var2 != null) {
            o03Var2.c(null);
        }
        o03 o03Var3 = this.w;
        if (o03Var3 != null) {
            o03Var3.c(null);
        }
        this.s.i("");
        this.q.i("");
        this.r.i("");
        this.x = true;
        this.u = zf3.T(t9.N(this), null, new bu2(this, null), 3);
    }

    public final void n() {
        boolean z;
        String str = this.o;
        String str2 = this.p;
        ey1 ey1Var = this.j;
        ey1Var.i("");
        ey1 ey1Var2 = this.k;
        ey1Var2.i("");
        boolean z2 = false;
        ac2 r = ew3.r(str, str2, false);
        if (!r.f55a) {
            if (r.f56b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String A = pd0.A(r.f56b);
                yb.f5305b.getClass();
                yb.a(A);
                ey1Var.i(A);
            }
            if (r.c.length() > 0) {
                z2 = true;
            }
            if (z2) {
                String A2 = pd0.A(r.c);
                yb.f5305b.getClass();
                yb.a(A2);
                ey1Var2.i(A2);
                return;
            }
            return;
        }
        this.f.i(Boolean.TRUE);
        zf3.T(t9.N(this), null, new du2(this, str, str2, null), 3);
    }

    public final void o(String str) {
        this.q.i("");
        this.r.i(str);
    }

    public final void s() {
        boolean z;
        String str = this.o;
        String str2 = this.p;
        ey1 ey1Var = this.l;
        ey1Var.i("");
        ey1 ey1Var2 = this.m;
        ey1Var2.i("");
        boolean z2 = true;
        ac2 r = ew3.r(str, str2, true);
        if (!r.f55a) {
            if (r.f56b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String A = pd0.A(r.f56b);
                yb.f5305b.getClass();
                yb.a(A);
                ey1Var.i(A);
            }
            if (i23.R0(r.c, "must contain:", false)) {
                String j = pd0.j(r.c);
                yb.f5305b.getClass();
                yb.a(j);
                ey1Var2.i(j);
                return;
            }
            if (r.c.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                String A2 = pd0.A(r.c);
                yb.f5305b.getClass();
                yb.a(A2);
                ey1Var2.i(A2);
                return;
            }
            return;
        }
        this.f.i(Boolean.TRUE);
        zf3.T(t9.N(this), null, new fu2(this, str, str2, null), 3);
    }
}
