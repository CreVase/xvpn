package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w52 implements bs {
    public static final String j = wi3.z(0);
    public static final String k = wi3.z(1);
    public static final String l = wi3.z(2);
    public static final String m = wi3.z(3);
    public static final String n = wi3.z(4);
    public static final String o = wi3.z(5);
    public static final String p = wi3.z(6);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4946b;
    public final dt1 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public w52(Object obj, int i, dt1 dt1Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        this.f4945a = obj;
        this.f4946b = i;
        this.c = dt1Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w52.class != obj.getClass()) {
            return false;
        }
        w52 w52Var = (w52) obj;
        if (this.f4946b == w52Var.f4946b && this.e == w52Var.e && this.f == w52Var.f && this.g == w52Var.g && this.h == w52Var.h && this.i == w52Var.i && zf3.p(this.f4945a, w52Var.f4945a) && zf3.p(this.d, w52Var.d) && zf3.p(this.c, w52Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4945a, Integer.valueOf(this.f4946b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(j, this.f4946b);
        dt1 dt1Var = this.c;
        if (dt1Var != null) {
            bundle.putBundle(k, dt1Var.toBundle());
        }
        bundle.putInt(l, this.e);
        bundle.putLong(m, this.f);
        bundle.putLong(n, this.g);
        bundle.putInt(o, this.h);
        bundle.putInt(p, this.i);
        return bundle;
    }
}
