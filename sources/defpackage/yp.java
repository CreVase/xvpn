package defpackage;

/* loaded from: classes.dex */
public final class yp implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final aq f5370a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5371b;
    public final long c = 0;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public yp(aq aqVar, long j, long j2, long j3, long j4, long j5) {
        this.f5370a = aqVar;
        this.f5371b = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        no2 no2Var = new no2(j, zp.a(this.f5370a.c(j), this.c, this.d, this.e, this.f, this.g));
        return new ko2(no2Var, no2Var);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.f5371b;
    }
}
