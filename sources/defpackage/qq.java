package defpackage;

/* loaded from: classes2.dex */
public final class qq extends r72 {
    public static final qq c = new qq();

    public qq() {
        super(rq.f4201a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        nq nqVar = (nq) obj;
        boolean C = f40Var.C(this.f4114b, i);
        nqVar.b(nqVar.d() + 1);
        boolean[] zArr = nqVar.f3515a;
        int i2 = nqVar.f3516b;
        nqVar.f3516b = i2 + 1;
        zArr[i2] = C;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new nq((boolean[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.n(this.f4114b, i2, zArr[i2]);
        }
    }
}
