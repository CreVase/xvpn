package defpackage;

/* loaded from: classes.dex */
public final class qv1 implements rm2 {

    /* renamed from: a, reason: collision with root package name */
    public final rm2 f4059a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4060b;

    public qv1(rm2 rm2Var, long j) {
        this.f4059a = rm2Var;
        this.f4060b = j;
    }

    @Override // defpackage.rm2
    public final void g() {
        this.f4059a.g();
    }

    @Override // defpackage.rm2
    public final int h(long j) {
        return this.f4059a.h(j - this.f4060b);
    }

    @Override // defpackage.rm2
    public final int i(x50 x50Var, ve0 ve0Var, int i) {
        int i2 = this.f4059a.i(x50Var, ve0Var, i);
        if (i2 == -4) {
            ve0Var.f = Math.max(0L, ve0Var.f + this.f4060b);
        }
        return i2;
    }

    @Override // defpackage.rm2
    public final boolean isReady() {
        return this.f4059a.isReady();
    }
}
