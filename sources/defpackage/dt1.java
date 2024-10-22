package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class dt1 implements bs {
    public static final dt1 g = new qs1().a();
    public static final String h = wi3.z(0);
    public static final String i = wi3.z(1);
    public static final String j = wi3.z(2);
    public static final String k = wi3.z(3);
    public static final String l = wi3.z(4);
    public static final qy2 m = new qy2(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f1833a;

    /* renamed from: b, reason: collision with root package name */
    public final zs1 f1834b;
    public final xs1 c;
    public final gt1 d;
    public final ts1 e;
    public final at1 f;

    public dt1(String str, ts1 ts1Var, zs1 zs1Var, xs1 xs1Var, gt1 gt1Var, at1 at1Var) {
        this.f1833a = str;
        this.f1834b = zs1Var;
        this.c = xs1Var;
        this.d = gt1Var;
        this.e = ts1Var;
        this.f = at1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt1)) {
            return false;
        }
        dt1 dt1Var = (dt1) obj;
        if (wi3.a(this.f1833a, dt1Var.f1833a) && this.e.equals(dt1Var.e) && wi3.a(this.f1834b, dt1Var.f1834b) && wi3.a(this.c, dt1Var.c) && wi3.a(this.d, dt1Var.d) && wi3.a(this.f, dt1Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f1833a.hashCode() * 31;
        zs1 zs1Var = this.f1834b;
        if (zs1Var != null) {
            i2 = zs1Var.hashCode();
        } else {
            i2 = 0;
        }
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + i2) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.f1833a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        xs1 xs1Var = xs1.f;
        xs1 xs1Var2 = this.c;
        if (!xs1Var2.equals(xs1Var)) {
            bundle.putBundle(i, xs1Var2.toBundle());
        }
        gt1 gt1Var = gt1.I;
        gt1 gt1Var2 = this.d;
        if (!gt1Var2.equals(gt1Var)) {
            bundle.putBundle(j, gt1Var2.toBundle());
        }
        ts1 ts1Var = ss1.f;
        ts1 ts1Var2 = this.e;
        if (!ts1Var2.equals(ts1Var)) {
            bundle.putBundle(k, ts1Var2.toBundle());
        }
        at1 at1Var = at1.d;
        at1 at1Var2 = this.f;
        if (!at1Var2.equals(at1Var)) {
            bundle.putBundle(l, at1Var2.toBundle());
        }
        return bundle;
    }
}
