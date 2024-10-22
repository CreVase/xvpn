package defpackage;

/* loaded from: classes.dex */
public final class fi0 implements rr1 {

    /* renamed from: a, reason: collision with root package name */
    public final p03 f2094a;

    /* renamed from: b, reason: collision with root package name */
    public final ei0 f2095b;
    public ko c;
    public rr1 d;
    public boolean e = true;
    public boolean f;

    public fi0(ei0 ei0Var, f10 f10Var) {
        this.f2095b = ei0Var;
        this.f2094a = new p03(f10Var);
    }

    @Override // defpackage.rr1
    public final void a(q52 q52Var) {
        rr1 rr1Var = this.d;
        if (rr1Var != null) {
            rr1Var.a(q52Var);
            q52Var = this.d.d();
        }
        this.f2094a.a(q52Var);
    }

    @Override // defpackage.rr1
    public final long b() {
        if (this.e) {
            return this.f2094a.b();
        }
        rr1 rr1Var = this.d;
        rr1Var.getClass();
        return rr1Var.b();
    }

    @Override // defpackage.rr1
    public final q52 d() {
        rr1 rr1Var = this.d;
        if (rr1Var != null) {
            return rr1Var.d();
        }
        return this.f2094a.e;
    }
}
