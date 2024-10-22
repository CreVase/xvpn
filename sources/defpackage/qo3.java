package defpackage;

/* loaded from: classes.dex */
public final class qo3 implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f4034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4035b;
    public final long c;
    public final long d;
    public final long e;

    public qo3(d2 d2Var, int i, long j, long j2) {
        this.f4034a = d2Var;
        this.f4035b = i;
        this.c = j;
        long j3 = (j2 - j) / d2Var.f;
        this.d = j3;
        this.e = d(j3);
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    public final long d(long j) {
        return wi3.G(j * this.f4035b, 1000000L, this.f4034a.d);
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        d2 d2Var = this.f4034a;
        long j2 = this.d;
        long j3 = wi3.j((d2Var.d * j) / (this.f4035b * 1000000), 0L, j2 - 1);
        long j4 = this.c;
        long d = d(j3);
        no2 no2Var = new no2(d, (d2Var.f * j3) + j4);
        if (d < j && j3 != j2 - 1) {
            long j5 = j3 + 1;
            return new ko2(no2Var, new no2(d(j5), (d2Var.f * j5) + j4));
        }
        return new ko2(no2Var, no2Var);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.e;
    }
}
