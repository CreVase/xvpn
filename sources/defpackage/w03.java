package defpackage;

/* loaded from: classes.dex */
public final class w03 implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lo2 f4924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x03 f4925b;

    public w03(x03 x03Var, lo2 lo2Var) {
        this.f4925b = x03Var;
        this.f4924a = lo2Var;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return this.f4924a.b();
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        ko2 g = this.f4924a.g(j);
        no2 no2Var = g.f2988a;
        long j2 = no2Var.f3503a;
        long j3 = no2Var.f3504b;
        long j4 = this.f4925b.f5100a;
        no2 no2Var2 = new no2(j2, j3 + j4);
        no2 no2Var3 = g.f2989b;
        return new ko2(no2Var2, new no2(no2Var3.f3503a, no2Var3.f3504b + j4));
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.f4924a.h();
    }
}
