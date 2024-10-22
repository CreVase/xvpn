package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a81 {

    /* renamed from: a, reason: collision with root package name */
    public final List f38a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39b;
    public final float c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;

    public a81(List list, int i, int i2, int i3, int i4, float f, String str) {
        this.f38a = list;
        this.f39b = i;
        this.c = f;
        this.g = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static a81 a(r42 r42Var) {
        List singletonList;
        int i;
        int i2;
        try {
            r42Var.H(21);
            int v = r42Var.v() & 3;
            int v2 = r42Var.v();
            int i3 = r42Var.f4099b;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < v2; i6++) {
                r42Var.H(1);
                int A = r42Var.A();
                for (int i7 = 0; i7 < A; i7++) {
                    int A2 = r42Var.A();
                    i5 += A2 + 4;
                    r42Var.H(A2);
                }
            }
            r42Var.G(i3);
            byte[] bArr = new byte[i5];
            String str = null;
            int i8 = 0;
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            float f = 1.0f;
            while (i8 < v2) {
                int v3 = r42Var.v() & 63;
                int A3 = r42Var.A();
                int i13 = 0;
                while (i13 < A3) {
                    int A4 = r42Var.A();
                    int i14 = v2;
                    System.arraycopy(py1.f3937a, i4, bArr, i9, 4);
                    int i15 = i9 + 4;
                    System.arraycopy(r42Var.f4098a, r42Var.f4099b, bArr, i15, A4);
                    if (v3 == 33 && i13 == 0) {
                        my1 c = py1.c(i15, bArr, i15 + A4);
                        int i16 = c.j;
                        i11 = c.k;
                        i12 = c.l;
                        f = c.i;
                        i = v3;
                        i2 = A3;
                        i10 = i16;
                        str = cp3.d(c.f3374a, c.f3375b, c.c, c.d, c.e, c.f);
                    } else {
                        i = v3;
                        i2 = A3;
                    }
                    i9 = i15 + A4;
                    r42Var.H(A4);
                    i13++;
                    v2 = i14;
                    v3 = i;
                    A3 = i2;
                    i4 = 0;
                }
                i8++;
                i4 = 0;
            }
            if (i5 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new a81(singletonList, v + 1, i10, i11, i12, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw u42.a("Error parsing HEVC config", e);
        }
    }
}
