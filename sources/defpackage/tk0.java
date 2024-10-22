package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class tk0 implements bs {
    public static final String d = wi3.z(0);
    public static final String e = wi3.z(1);
    public static final String f = wi3.z(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f4521a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4522b;
    public final int c;

    public tk0(int i, int i2, int i3) {
        this.f4521a = i;
        this.f4522b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk0)) {
            return false;
        }
        tk0 tk0Var = (tk0) obj;
        if (this.f4521a == tk0Var.f4521a && this.f4522b == tk0Var.f4522b && this.c == tk0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f4521a) * 31) + this.f4522b) * 31) + this.c;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f4521a);
        bundle.putInt(e, this.f4522b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}
