package defpackage;

/* loaded from: classes.dex */
public final class ji0 implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ki0 f2767a;

    public ji0(ki0 ki0Var) {
        this.f2767a = ki0Var;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        ki0 ki0Var = this.f2767a;
        long j2 = ki0Var.f2950b;
        long j3 = ki0Var.c;
        no2 no2Var = new no2(j, wi3.j(((((j3 - j2) * ((ki0Var.d.i * j) / 1000000)) / ki0Var.f) + j2) - 30000, j2, j3 - 1));
        return new ko2(no2Var, no2Var);
    }

    @Override // defpackage.lo2
    public final long h() {
        return (this.f2767a.f * 1000000) / r0.d.i;
    }
}
