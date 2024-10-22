package defpackage;

/* loaded from: classes2.dex */
public class tn2 extends v implements ca0 {
    public final c90 d;

    public tn2(c90 c90Var, t90 t90Var) {
        super(t90Var, true);
        this.d = c90Var;
    }

    @Override // defpackage.nf1
    public final boolean K() {
        return true;
    }

    @Override // defpackage.ca0
    public final ca0 getCallerFrame() {
        c90 c90Var = this.d;
        if (c90Var instanceof ca0) {
            return (ca0) c90Var;
        }
        return null;
    }

    @Override // defpackage.nf1
    public void o(Object obj) {
        tf3.r0(t9.P(this.d), t9.e0(obj), null);
    }

    @Override // defpackage.nf1
    public void p(Object obj) {
        this.d.resumeWith(t9.e0(obj));
    }
}
