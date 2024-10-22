package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class qh implements bs {
    public static final qh g = new qh(0, 0, 1, 1, 0);
    public static final String h = wi3.z(0);
    public static final String i = wi3.z(1);
    public static final String j = wi3.z(2);
    public static final String k = wi3.z(3);
    public static final String l = wi3.z(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f3995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3996b;
    public final int c;
    public final int d;
    public final int e;
    public v51 f;

    public qh(int i2, int i3, int i4, int i5, int i6) {
        this.f3995a = i2;
        this.f3996b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public final v51 a() {
        if (this.f == null) {
            this.f = new v51(this, 0);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qh.class != obj.getClass()) {
            return false;
        }
        qh qhVar = (qh) obj;
        if (this.f3995a == qhVar.f3995a && this.f3996b == qhVar.f3996b && this.c == qhVar.c && this.d == qhVar.d && this.e == qhVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f3995a) * 31) + this.f3996b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.f3995a);
        bundle.putInt(i, this.f3996b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        return bundle;
    }
}
