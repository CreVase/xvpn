package defpackage;

/* loaded from: classes2.dex */
public final class em0 extends r72 {
    public static final em0 c = new em0();

    public em0() {
        super(gm0.f2279a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        bm0 bm0Var = (bm0) obj;
        double k = f40Var.k(this.f4114b, i);
        bm0Var.b(bm0Var.d() + 1);
        double[] dArr = bm0Var.f488a;
        int i2 = bm0Var.f489b;
        bm0Var.f489b = i2 + 1;
        dArr[i2] = k;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new bm0((double[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.e(this.f4114b, i2, dArr[i2]);
        }
    }
}
