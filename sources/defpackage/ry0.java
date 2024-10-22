package defpackage;

/* loaded from: classes.dex */
public final class ry0 implements d22 {

    /* renamed from: a, reason: collision with root package name */
    public final vy0 f4235a;

    /* renamed from: b, reason: collision with root package name */
    public final uy0 f4236b;
    public long c = -1;
    public long d = -1;

    public ry0(vy0 vy0Var, uy0 uy0Var) {
        this.f4235a = vy0Var;
        this.f4236b = uy0Var;
    }

    @Override // defpackage.d22
    public final long f(ev0 ev0Var) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.d = -1L;
        return j2;
    }

    @Override // defpackage.d22
    public final lo2 j() {
        boolean z;
        if (this.c != -1) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        return new ty0(this.f4235a, this.c, 0);
    }

    @Override // defpackage.d22
    public final void m(long j) {
        long[] jArr = (long[]) this.f4236b.f4757b;
        this.d = jArr[wi3.f(jArr, j, true)];
    }
}
