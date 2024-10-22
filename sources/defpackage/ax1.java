package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class ax1 implements po2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f357a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f358b;
    public final long c;

    public ax1(long[] jArr, long[] jArr2, long j) {
        this.f357a = jArr;
        this.f358b = jArr2;
        this.c = j == -9223372036854775807L ? wi3.C(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        double d;
        int f = wi3.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // defpackage.po2
    public final long a() {
        return -1L;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.po2
    public final long c(long j) {
        return wi3.C(((Long) d(j, this.f357a, this.f358b).second).longValue());
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        Pair d = d(wi3.K(wi3.j(j, 0L, this.c)), this.f358b, this.f357a);
        no2 no2Var = new no2(wi3.C(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new ko2(no2Var, no2Var);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.c;
    }
}
