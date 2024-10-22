package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class gb3 implements bs {

    /* renamed from: b, reason: collision with root package name */
    public static final gb3 f2226b;
    public static final String c;

    /* renamed from: a, reason: collision with root package name */
    public final hb1 f2227a;

    static {
        db1 db1Var = hb1.f2394b;
        f2226b = new gb3(ji2.e);
        c = wi3.z(0);
    }

    public gb3(hb1 hb1Var) {
        this.f2227a = hb1.l(hb1Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            hb1 hb1Var = this.f2227a;
            if (i2 >= hb1Var.size()) {
                return false;
            }
            fb3 fb3Var = (fb3) hb1Var.get(i2);
            if (fb3Var.b() && fb3Var.a() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gb3.class == obj.getClass()) {
            return this.f2227a.equals(((gb3) obj).f2227a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2227a.hashCode();
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(c, cp3.R(this.f2227a));
        return bundle;
    }
}
