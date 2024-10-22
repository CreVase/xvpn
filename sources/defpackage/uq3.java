package defpackage;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class uq3 {

    /* renamed from: b, reason: collision with root package name */
    public static final wq3 f4718b;

    /* renamed from: a, reason: collision with root package name */
    public final wq3 f4719a;

    static {
        nq3 kq3Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            kq3Var = new mq3();
        } else if (i >= 29) {
            kq3Var = new lq3();
        } else {
            kq3Var = new kq3();
        }
        f4718b = kq3Var.b().f5059a.a().f5059a.b().f5059a.c();
    }

    public uq3(wq3 wq3Var) {
        this.f4719a = wq3Var;
    }

    public wq3 a() {
        return this.f4719a;
    }

    public wq3 b() {
        return this.f4719a;
    }

    public wq3 c() {
        return this.f4719a;
    }

    public void d(View view) {
    }

    public xl0 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq3)) {
            return false;
        }
        uq3 uq3Var = (uq3) obj;
        if (n() == uq3Var.n() && m() == uq3Var.m() && w12.a(j(), uq3Var.j()) && w12.a(h(), uq3Var.h()) && w12.a(e(), uq3Var.e())) {
            return true;
        }
        return false;
    }

    public rc1 f(int i) {
        return rc1.e;
    }

    public rc1 g() {
        return j();
    }

    public rc1 h() {
        return rc1.e;
    }

    public int hashCode() {
        return w12.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public rc1 i() {
        return j();
    }

    public rc1 j() {
        return rc1.e;
    }

    public rc1 k() {
        return j();
    }

    public wq3 l(int i, int i2, int i3, int i4) {
        return f4718b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(rc1[] rc1VarArr) {
    }

    public void p(wq3 wq3Var) {
    }

    public void q(rc1 rc1Var) {
    }
}
