package defpackage;

/* loaded from: classes.dex */
public final class yb1 implements po2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5309a;

    /* renamed from: b, reason: collision with root package name */
    public final q9 f5310b;
    public final q9 c;
    public long d;

    public yb1(long j, long j2, long j3) {
        this.d = j;
        this.f5309a = j3;
        q9 q9Var = new q9(7);
        this.f5310b = q9Var;
        q9 q9Var2 = new q9(7);
        this.c = q9Var2;
        q9Var.g(0L);
        q9Var2.g(j2);
    }

    @Override // defpackage.po2
    public final long a() {
        return this.f5309a;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.po2
    public final long c(long j) {
        return this.f5310b.n(wi3.c(this.c, j));
    }

    public final boolean d(long j) {
        q9 q9Var = this.f5310b;
        if (j - q9Var.n(q9Var.f3969a - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        q9 q9Var = this.f5310b;
        int c = wi3.c(q9Var, j);
        long n = q9Var.n(c);
        q9 q9Var2 = this.c;
        no2 no2Var = new no2(n, q9Var2.n(c));
        if (n != j && c != q9Var.f3969a - 1) {
            int i = c + 1;
            return new ko2(no2Var, new no2(q9Var.n(i), q9Var2.n(i)));
        }
        return new ko2(no2Var, no2Var);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.d;
    }
}
