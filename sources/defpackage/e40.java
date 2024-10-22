package defpackage;

/* loaded from: classes2.dex */
public final class e40 extends c40 {
    public final qf1 c;
    public int d;

    public e40(ah1 ah1Var, qf1 qf1Var) {
        super(ah1Var);
        this.c = qf1Var;
    }

    @Override // defpackage.c40
    public final void a() {
        this.f579b = true;
        this.d++;
    }

    @Override // defpackage.c40
    public final void b() {
        this.f579b = false;
        g("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            g(this.c.f3989a.g);
        }
    }

    @Override // defpackage.c40
    public final void j() {
        d(' ');
    }

    @Override // defpackage.c40
    public final void k() {
        this.d--;
    }
}
