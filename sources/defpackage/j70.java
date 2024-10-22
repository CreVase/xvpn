package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j70 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2715a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int[] f2716b = new int[10];
    public int c = 0;
    public int[] d = new int[10];
    public float[] e = new float[10];
    public int f = 0;
    public int[] g = new int[5];
    public String[] h = new String[5];
    public int i = 0;
    public int[] j = new int[4];
    public boolean[] k = new boolean[4];
    public int l = 0;

    public final void a(float f, int i) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.f2715a;
        if (i3 >= iArr.length) {
            this.f2715a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f2716b;
            this.f2716b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2715a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.f2716b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }
}
