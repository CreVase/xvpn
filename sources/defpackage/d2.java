package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1718a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f1719b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    /* JADX WARN: Multi-variable type inference failed */
    public d2(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f1718a = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.f1719b = bArr;
    }

    public final boolean a(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f1718a = i2;
        this.f1719b = t9.h[3 - i3];
        int i8 = t9.i[i5];
        this.d = i8;
        int i9 = 2;
        if (i2 == 2) {
            this.d = i8 / 2;
        } else if (i2 == 0) {
            this.d = i8 / 4;
        }
        int i10 = (i >>> 9) & 1;
        int i11 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i11 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i2 != 3) {
            i11 = 576;
        }
        this.g = i11;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = t9.j[i4 - 1];
            } else {
                i7 = t9.k[i4 - 1];
            }
            this.f = i7;
            this.c = (((i7 * 12) / this.d) + i10) * 4;
        } else {
            int i12 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = t9.l[i4 - 1];
                } else {
                    i6 = t9.m[i4 - 1];
                }
                this.f = i6;
                this.c = ((i6 * 144) / this.d) + i10;
            } else {
                int i13 = t9.n[i4 - 1];
                this.f = i13;
                if (i3 == 1) {
                    i12 = 72;
                }
                this.c = ((i12 * i13) / this.d) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.e = i9;
        return true;
    }
}
