package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e20 implements bs {
    public static final String f = wi3.z(0);
    public static final String g = wi3.z(1);
    public static final String h = wi3.z(2);
    public static final String i = wi3.z(3);
    public static final ef0 j = new ef0(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f1875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1876b;
    public final int c;
    public final byte[] d;
    public int e;

    public e20(int i2, int i3, int i4, byte[] bArr) {
        this.f1875a = i2;
        this.f1876b = i3;
        this.c = i4;
        this.d = bArr;
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e20.class != obj.getClass()) {
            return false;
        }
        e20 e20Var = (e20) obj;
        if (this.f1875a == e20Var.f1875a && this.f1876b == e20Var.f1876b && this.c == e20Var.c && Arrays.equals(this.d, e20Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + ((((((527 + this.f1875a) * 31) + this.f1876b) * 31) + this.c) * 31);
        }
        return this.e;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.f1875a);
        bundle.putInt(g, this.f1876b);
        bundle.putInt(h, this.c);
        bundle.putByteArray(i, this.d);
        return bundle;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f1875a);
        sb.append(", ");
        sb.append(this.f1876b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
