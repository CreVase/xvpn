package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nm {

    /* renamed from: a, reason: collision with root package name */
    public final List f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3484b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public nm(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.f3483a = arrayList;
        this.f3484b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static nm a(r42 r42Var) {
        byte[] bArr;
        String str;
        int i;
        int i2;
        float f;
        try {
            r42Var.H(4);
            int v = (r42Var.v() & 3) + 1;
            if (v != 3) {
                ArrayList arrayList = new ArrayList();
                int v2 = r42Var.v() & 31;
                int i3 = 0;
                while (true) {
                    bArr = cp3.f1649a;
                    if (i3 >= v2) {
                        break;
                    }
                    int A = r42Var.A();
                    int i4 = r42Var.f4099b;
                    r42Var.H(A);
                    byte[] bArr2 = r42Var.f4098a;
                    byte[] bArr3 = new byte[A + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i4, bArr3, 4, A);
                    arrayList.add(bArr3);
                    i3++;
                }
                int v3 = r42Var.v();
                for (int i5 = 0; i5 < v3; i5++) {
                    int A2 = r42Var.A();
                    int i6 = r42Var.f4099b;
                    r42Var.H(A2);
                    byte[] bArr4 = r42Var.f4098a;
                    byte[] bArr5 = new byte[A2 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i6, bArr5, 4, A2);
                    arrayList.add(bArr5);
                }
                if (v2 > 0) {
                    oy1 d = py1.d(v, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                    int i7 = d.e;
                    int i8 = d.f;
                    float f2 = d.g;
                    str = cp3.c(d.f3750a, d.f3751b, d.c);
                    i = i7;
                    i2 = i8;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new nm(arrayList, v, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw u42.a("Error parsing AVC config", e);
        }
    }
}
