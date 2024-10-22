package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wa3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4972a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4973b;
    public final int c;
    public final int d;

    public wa3(int i, byte[] bArr, int i2, int i3) {
        this.f4972a = i;
        this.f4973b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wa3.class != obj.getClass()) {
            return false;
        }
        wa3 wa3Var = (wa3) obj;
        if (this.f4972a == wa3Var.f4972a && this.c == wa3Var.c && this.d == wa3Var.d && Arrays.equals(this.f4973b, wa3Var.f4973b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4973b) + (this.f4972a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
