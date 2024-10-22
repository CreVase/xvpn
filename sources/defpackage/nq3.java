package defpackage;

/* loaded from: classes.dex */
public abstract class nq3 {

    /* renamed from: a, reason: collision with root package name */
    public final wq3 f3519a;

    /* renamed from: b, reason: collision with root package name */
    public rc1[] f3520b;

    public nq3() {
        this(new wq3());
    }

    public final void a() {
        rc1[] rc1VarArr = this.f3520b;
        if (rc1VarArr != null) {
            rc1 rc1Var = rc1VarArr[ew3.U0(1)];
            rc1 rc1Var2 = this.f3520b[ew3.U0(2)];
            wq3 wq3Var = this.f3519a;
            if (rc1Var2 == null) {
                rc1Var2 = wq3Var.a(2);
            }
            if (rc1Var == null) {
                rc1Var = wq3Var.a(1);
            }
            g(rc1.a(rc1Var, rc1Var2));
            rc1 rc1Var3 = this.f3520b[ew3.U0(16)];
            if (rc1Var3 != null) {
                f(rc1Var3);
            }
            rc1 rc1Var4 = this.f3520b[ew3.U0(32)];
            if (rc1Var4 != null) {
                d(rc1Var4);
            }
            rc1 rc1Var5 = this.f3520b[ew3.U0(64)];
            if (rc1Var5 != null) {
                h(rc1Var5);
            }
        }
    }

    public abstract wq3 b();

    public void c(int i, rc1 rc1Var) {
        if (this.f3520b == null) {
            this.f3520b = new rc1[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f3520b[ew3.U0(i2)] = rc1Var;
            }
        }
    }

    public void d(rc1 rc1Var) {
    }

    public abstract void e(rc1 rc1Var);

    public void f(rc1 rc1Var) {
    }

    public abstract void g(rc1 rc1Var);

    public void h(rc1 rc1Var) {
    }

    public nq3(wq3 wq3Var) {
        this.f3519a = wq3Var;
    }
}
