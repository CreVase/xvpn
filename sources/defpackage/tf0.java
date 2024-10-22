package defpackage;

/* loaded from: classes.dex */
public final class tf0 {

    /* renamed from: a, reason: collision with root package name */
    public final y83 f4491a;

    /* renamed from: b, reason: collision with root package name */
    public hb1 f4492b;
    public oi2 c;
    public rt1 d;
    public rt1 e;
    public rt1 f;

    public tf0(y83 y83Var) {
        this.f4491a = y83Var;
        db1 db1Var = hb1.f2394b;
        this.f4492b = ji2.e;
        this.c = oi2.g;
    }

    public static rt1 b(x52 x52Var, hb1 hb1Var, rt1 rt1Var, y83 y83Var) {
        Object m;
        int i;
        bu0 bu0Var = (bu0) x52Var;
        a93 k = bu0Var.k();
        int h = bu0Var.h();
        if (k.q()) {
            m = null;
        } else {
            m = k.m(h);
        }
        if (!bu0Var.q() && !k.q()) {
            i = k.f(h, y83Var).b(wi3.C(bu0Var.i()) - y83Var.f());
        } else {
            i = -1;
        }
        for (int i2 = 0; i2 < hb1Var.size(); i2++) {
            rt1 rt1Var2 = (rt1) hb1Var.get(i2);
            if (c(rt1Var2, m, bu0Var.q(), bu0Var.e(), bu0Var.f(), i)) {
                return rt1Var2;
            }
        }
        if (hb1Var.isEmpty() && rt1Var != null) {
            if (c(rt1Var, m, bu0Var.q(), bu0Var.e(), bu0Var.f(), i)) {
                return rt1Var;
            }
        }
        return null;
    }

    public static boolean c(rt1 rt1Var, Object obj, boolean z, int i, int i2, int i3) {
        if (!rt1Var.f3536a.equals(obj)) {
            return false;
        }
        int i4 = rt1Var.f3537b;
        if ((!z || i4 != i || rt1Var.c != i2) && (z || i4 != -1 || rt1Var.e != i3)) {
            return false;
        }
        return true;
    }

    public final void a(jb1 jb1Var, rt1 rt1Var, a93 a93Var) {
        if (rt1Var == null) {
            return;
        }
        if (a93Var.b(rt1Var.f3536a) != -1) {
            jb1Var.b(rt1Var, a93Var);
            return;
        }
        a93 a93Var2 = (a93) this.c.get(rt1Var);
        if (a93Var2 != null) {
            jb1Var.b(rt1Var, a93Var2);
        }
    }

    public final void d(a93 a93Var) {
        jb1 a2 = kb1.a();
        if (this.f4492b.isEmpty()) {
            a(a2, this.e, a93Var);
            if (!zf3.p(this.f, this.e)) {
                a(a2, this.f, a93Var);
            }
            if (!zf3.p(this.d, this.e) && !zf3.p(this.d, this.f)) {
                a(a2, this.d, a93Var);
            }
        } else {
            for (int i = 0; i < this.f4492b.size(); i++) {
                a(a2, (rt1) this.f4492b.get(i), a93Var);
            }
            if (!this.f4492b.contains(this.d)) {
                a(a2, this.d, a93Var);
            }
        }
        this.c = a2.a();
    }
}
