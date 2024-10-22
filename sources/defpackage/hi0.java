package defpackage;

/* loaded from: classes.dex */
public final class hi0 implements dv0 {

    /* renamed from: a, reason: collision with root package name */
    public final y01 f2426a;

    public hi0(y01 y01Var) {
        this.f2426a = y01Var;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        return true;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
    }

    @Override // defpackage.dv0
    public final int f(ev0 ev0Var, lm2 lm2Var) {
        if (ev0Var.i(Integer.MAX_VALUE) == -1) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        xa3 l = fv0Var.l(0, 3);
        fv0Var.m(new ty0(-9223372036854775807L));
        fv0Var.j();
        y01 y01Var = this.f2426a;
        y01Var.getClass();
        x01 x01Var = new x01(y01Var);
        x01Var.k = "text/x-unknown";
        x01Var.h = y01Var.l;
        l.e(new y01(x01Var));
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
