package defpackage;

/* loaded from: classes.dex */
public final class st3 implements po2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4412a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4413b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public st3(long j, int i, long j2, long j3, long[] jArr) {
        this.f4412a = j;
        this.f4413b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.po2
    public final long a() {
        return this.e;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.po2
    public final long c(long j) {
        long j2;
        double d;
        long j3 = j - this.f4412a;
        if (b() && j3 > this.f4413b) {
            long[] jArr = this.f;
            cp3.o(jArr);
            double d2 = (j3 * 256.0d) / this.d;
            int f = wi3.f(jArr, (long) d2, true);
            long j4 = this.c;
            long j5 = (f * j4) / 100;
            long j6 = jArr[f];
            int i = f + 1;
            long j7 = (j4 * i) / 100;
            if (f == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return Math.round(d * (j7 - j5)) + j5;
        }
        return 0L;
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        double d;
        double d2;
        boolean b2 = b();
        int i = this.f4413b;
        long j2 = this.f4412a;
        if (!b2) {
            no2 no2Var = new no2(0L, j2 + i);
            return new ko2(no2Var, no2Var);
        }
        long j3 = wi3.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d = 256.0d;
                d4 = 256.0d;
                double d5 = d4 / d;
                long j4 = this.d;
                no2 no2Var2 = new no2(j3, j2 + wi3.j(Math.round(d5 * j4), i, j4 - 1));
                return new ko2(no2Var2, no2Var2);
            }
            int i2 = (int) d3;
            long[] jArr = this.f;
            cp3.o(jArr);
            double d6 = jArr[i2];
            if (i2 == 99) {
                d2 = 256.0d;
            } else {
                d2 = jArr[i2 + 1];
            }
            d4 = d6 + ((d2 - d6) * (d3 - i2));
        }
        d = 256.0d;
        double d52 = d4 / d;
        long j42 = this.d;
        no2 no2Var22 = new no2(j3, j2 + wi3.j(Math.round(d52 * j42), i, j42 - 1));
        return new ko2(no2Var22, no2Var22);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.c;
    }
}
