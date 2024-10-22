package defpackage;

/* loaded from: classes.dex */
public class u60 implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4627a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4628b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public u60(long j, long j2, int i, int i2, boolean z) {
        this.f4627a = j;
        this.f4628b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = ((Math.max(0L, j3) * 8) * 1000000) / i;
        }
    }

    @Override // defpackage.lo2
    public final boolean b() {
        if (this.d == -1 && !this.g) {
            return false;
        }
        return true;
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        long j2 = this.f4628b;
        long j3 = this.d;
        if (j3 == -1 && !this.g) {
            no2 no2Var = new no2(0L, j2);
            return new ko2(no2Var, no2Var);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j3 != -1) {
            j5 = Math.min(j5, j3 - j4);
        }
        long max = Math.max(j5, 0L) + j2;
        long max2 = ((Math.max(0L, max - j2) * 8) * 1000000) / i;
        no2 no2Var2 = new no2(max2, max);
        if (j3 != -1 && max2 < j) {
            long j6 = j4 + max;
            if (j6 < this.f4627a) {
                return new ko2(no2Var2, new no2(((Math.max(0L, j6 - j2) * 8) * 1000000) / i, j6));
            }
        }
        return new ko2(no2Var2, no2Var2);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.f;
    }
}
