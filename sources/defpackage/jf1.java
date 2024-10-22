package defpackage;

/* loaded from: classes2.dex */
public final class jf1 extends vu {
    public final nf1 i;

    public jf1(c90 c90Var, nf1 nf1Var) {
        super(1, c90Var);
        this.i = nf1Var;
    }

    @Override // defpackage.vu
    public final Throwable q(nf1 nf1Var) {
        Throwable d;
        Object F = this.i.F();
        if ((F instanceof lf1) && (d = ((lf1) F).d()) != null) {
            return d;
        }
        if (F instanceof d30) {
            return ((d30) F).f1723a;
        }
        return nf1Var.A();
    }

    @Override // defpackage.vu
    public final String y() {
        return "AwaitContinuation";
    }
}
