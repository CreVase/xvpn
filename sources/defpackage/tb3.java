package defpackage;

/* loaded from: classes.dex */
public final class tb3 extends qb3 {

    /* renamed from: a, reason: collision with root package name */
    public final ub3 f4482a;

    public tb3(ub3 ub3Var) {
        this.f4482a = ub3Var;
    }

    @Override // defpackage.ob3
    public final void b(pb3 pb3Var) {
        ub3 ub3Var = this.f4482a;
        int i = ub3Var.z - 1;
        ub3Var.z = i;
        if (i == 0) {
            ub3Var.A = false;
            ub3Var.m();
        }
        pb3Var.v(this);
    }

    @Override // defpackage.qb3, defpackage.ob3
    public final void d() {
        ub3 ub3Var = this.f4482a;
        if (!ub3Var.A) {
            ub3Var.F();
            ub3Var.A = true;
        }
    }
}
