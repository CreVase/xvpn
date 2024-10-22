package defpackage;

/* loaded from: classes2.dex */
public final class rg3 extends r72 {
    public static final rg3 c = new rg3();

    public rg3() {
        super(sg3.f4339a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((pg3) obj).f3840a.length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        qg3 qg3Var = (qg3) obj;
        short F = f40Var.e(this.f4114b, i).F();
        qg3Var.b(qg3Var.d() + 1);
        short[] sArr = qg3Var.f3993a;
        int i2 = qg3Var.f3994b;
        qg3Var.f3994b = i2 + 1;
        sArr[i2] = F;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new qg3(((pg3) obj).f3840a);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new pg3(new short[0]);
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        short[] sArr = ((pg3) obj).f3840a;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.E(this.f4114b, i2).i(sArr[i2]);
        }
    }
}
