package defpackage;

/* loaded from: classes.dex */
public final class x03 implements fv0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5100a;

    /* renamed from: b, reason: collision with root package name */
    public final fv0 f5101b;

    public x03(long j, fv0 fv0Var) {
        this.f5100a = j;
        this.f5101b = fv0Var;
    }

    @Override // defpackage.fv0
    public final void j() {
        this.f5101b.j();
    }

    @Override // defpackage.fv0
    public final xa3 l(int i, int i2) {
        return this.f5101b.l(i, i2);
    }

    @Override // defpackage.fv0
    public final void m(lo2 lo2Var) {
        this.f5101b.m(new w03(this, lo2Var));
    }
}
