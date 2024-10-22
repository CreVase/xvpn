package defpackage;

/* loaded from: classes.dex */
public final class g00 {

    /* renamed from: a, reason: collision with root package name */
    public final xa3 f2186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2187b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public g00(int i, int i2, long j, int i3, xa3 xa3Var) {
        int i4;
        int i5;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        cp3.e(z);
        this.d = j;
        this.e = i3;
        this.f2186a = xa3Var;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        int i6 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f2187b = i4 | i6;
        if (i2 == 2) {
            i5 = i6 | 1650720768;
        } else {
            i5 = -1;
        }
        this.c = i5;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final no2 a(int i) {
        return new no2(((this.d * 1) / this.e) * this.l[i], this.k[i]);
    }

    public final ko2 b(long j) {
        int i = (int) (j / ((this.d * 1) / this.e));
        int e = wi3.e(this.l, i, true, true);
        if (this.l[e] == i) {
            no2 a2 = a(e);
            return new ko2(a2, a2);
        }
        no2 a3 = a(e);
        int i2 = e + 1;
        if (i2 < this.k.length) {
            return new ko2(a3, a(i2));
        }
        return new ko2(a3, a3);
    }
}
