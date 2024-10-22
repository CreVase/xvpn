package defpackage;

/* loaded from: classes2.dex */
public final class bt2 extends r72 {
    public static final bt2 c = new bt2();

    public bt2() {
        super(ct2.f1673a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        at2 at2Var = (at2) obj;
        short q = f40Var.q(this.f4114b, i);
        at2Var.b(at2Var.d() + 1);
        short[] sArr = at2Var.f335a;
        int i2 = at2Var.f336b;
        at2Var.f336b = i2 + 1;
        sArr[i2] = q;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new at2((short[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.w(this.f4114b, i2, sArr[i2]);
        }
    }
}
