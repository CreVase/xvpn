package defpackage;

/* loaded from: classes.dex */
public abstract class gt3 extends j40 {
    public final fo k;

    public gt3(fo foVar) {
        this.k = foVar;
    }

    @Override // defpackage.fo
    public final a93 f() {
        return this.k.f();
    }

    @Override // defpackage.fo
    public final dt1 g() {
        return this.k.g();
    }

    @Override // defpackage.fo
    public final boolean h() {
        return this.k.h();
    }

    @Override // defpackage.fo
    public final void k(hb3 hb3Var) {
        this.j = hb3Var;
        this.i = wi3.k(null);
        y();
    }

    @Override // defpackage.j40
    public final rt1 r(Object obj, rt1 rt1Var) {
        return w(rt1Var);
    }

    @Override // defpackage.j40
    public final long s(long j, Object obj) {
        return j;
    }

    @Override // defpackage.j40
    public final int t(int i, Object obj) {
        return i;
    }

    @Override // defpackage.j40
    public final void u(Object obj, fo foVar, a93 a93Var) {
        x(a93Var);
    }

    public rt1 w(rt1 rt1Var) {
        return rt1Var;
    }

    public abstract void x(a93 a93Var);

    public void y() {
        v(null, this.k);
    }
}
