package defpackage;

/* loaded from: classes2.dex */
public final class dj1 extends o03 {
    public final c90 d;

    public dj1(t90 t90Var, l41 l41Var) {
        super(t90Var, false);
        this.d = t9.z(this, this, l41Var);
    }

    @Override // defpackage.nf1
    public final void Q() {
        try {
            tf3.r0(t9.P(this.d), ch3.f636a, null);
        } catch (Throwable th) {
            resumeWith(new pk2(th));
            throw th;
        }
    }
}
