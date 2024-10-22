package defpackage;

/* loaded from: classes.dex */
public final class d31 {

    /* renamed from: a, reason: collision with root package name */
    public final xa3 f1724a;
    public ya3 d;
    public oi0 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;

    /* renamed from: b, reason: collision with root package name */
    public final ta3 f1725b = new ta3();
    public final r42 c = new r42();
    public final r42 j = new r42(1);
    public final r42 k = new r42();

    public d31(xa3 xa3Var, ya3 ya3Var, oi0 oi0Var) {
        this.f1724a = xa3Var;
        this.d = ya3Var;
        this.e = oi0Var;
        this.d = ya3Var;
        this.e = oi0Var;
        xa3Var.e(ya3Var.f5303a.f);
        d();
    }

    public final sa3 a() {
        if (!this.l) {
            return null;
        }
        ta3 ta3Var = this.f1725b;
        oi0 oi0Var = ta3Var.f4476a;
        int i = wi3.f5017a;
        int i2 = oi0Var.f3668a;
        sa3 sa3Var = ta3Var.m;
        if (sa3Var == null) {
            sa3[] sa3VarArr = this.d.f5303a.k;
            if (sa3VarArr == null) {
                sa3Var = null;
            } else {
                sa3Var = sa3VarArr[i2];
            }
        }
        if (sa3Var == null || !sa3Var.f4300a) {
            return null;
        }
        return sa3Var;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.f1725b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i, int i2) {
        r42 r42Var;
        boolean z;
        boolean z2;
        int i3;
        sa3 a2 = a();
        if (a2 == null) {
            return 0;
        }
        ta3 ta3Var = this.f1725b;
        int i4 = a2.d;
        if (i4 != 0) {
            r42Var = ta3Var.n;
        } else {
            int i5 = wi3.f5017a;
            byte[] bArr = a2.e;
            int length = bArr.length;
            r42 r42Var2 = this.k;
            r42Var2.E(length, bArr);
            i4 = bArr.length;
            r42Var = r42Var2;
        }
        int i6 = this.f;
        if (ta3Var.k && ta3Var.l[i6]) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        r42 r42Var3 = this.j;
        byte[] bArr2 = r42Var3.f4098a;
        if (z2) {
            i3 = 128;
        } else {
            i3 = 0;
        }
        bArr2[0] = (byte) (i3 | i4);
        r42Var3.G(0);
        xa3 xa3Var = this.f1724a;
        xa3Var.c(1, r42Var3);
        xa3Var.c(i4, r42Var);
        if (!z2) {
            return i4 + 1;
        }
        r42 r42Var4 = this.c;
        if (!z) {
            r42Var4.D(8);
            byte[] bArr3 = r42Var4.f4098a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) ((i2 >> 8) & 255);
            bArr3[3] = (byte) (i2 & 255);
            bArr3[4] = (byte) ((i >> 24) & 255);
            bArr3[5] = (byte) ((i >> 16) & 255);
            bArr3[6] = (byte) ((i >> 8) & 255);
            bArr3[7] = (byte) (i & 255);
            xa3Var.c(8, r42Var4);
            return i4 + 1 + 8;
        }
        r42 r42Var5 = ta3Var.n;
        int A = r42Var5.A();
        r42Var5.H(-2);
        int i7 = (A * 6) + 2;
        if (i2 != 0) {
            r42Var4.D(i7);
            byte[] bArr4 = r42Var4.f4098a;
            r42Var5.d(0, bArr4, i7);
            int i8 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
            bArr4[2] = (byte) ((i8 >> 8) & 255);
            bArr4[3] = (byte) (i8 & 255);
        } else {
            r42Var4 = r42Var5;
        }
        xa3Var.c(i7, r42Var4);
        return i4 + 1 + i7;
    }

    public final void d() {
        ta3 ta3Var = this.f1725b;
        ta3Var.d = 0;
        ta3Var.p = 0L;
        ta3Var.q = false;
        ta3Var.k = false;
        ta3Var.o = false;
        ta3Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
