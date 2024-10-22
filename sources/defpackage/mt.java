package defpackage;

/* loaded from: classes.dex */
public final class mt implements yd0 {

    /* renamed from: a, reason: collision with root package name */
    public jt f3347a;

    /* renamed from: b, reason: collision with root package name */
    public final dx0 f3348b = new dx0();
    public nm2 c;
    public boolean d;
    public yd0 e;

    @Override // defpackage.yd0
    public final zd0 a() {
        zd0 zd0Var;
        yd0 yd0Var = this.e;
        if (yd0Var != null) {
            zd0Var = yd0Var.a();
        } else {
            zd0Var = null;
        }
        return b(zd0Var, 0, 0);
    }

    public final nt b(zd0 zd0Var, int i, int i2) {
        lt ltVar;
        lt ltVar2;
        jt jtVar = this.f3347a;
        jtVar.getClass();
        if (!this.d && zd0Var != null) {
            nm2 nm2Var = this.c;
            if (nm2Var != null) {
                jt jtVar2 = (jt) nm2Var.c;
                jtVar2.getClass();
                ltVar2 = new lt(jtVar2, nm2Var.f3489a, nm2Var.f3490b);
                this.f3348b.getClass();
                return new nt(jtVar, zd0Var, new fx0(), ltVar2, i);
            }
            ltVar = new lt(jtVar, 5242880L, 20480);
        } else {
            ltVar = null;
        }
        ltVar2 = ltVar;
        this.f3348b.getClass();
        return new nt(jtVar, zd0Var, new fx0(), ltVar2, i);
    }
}
