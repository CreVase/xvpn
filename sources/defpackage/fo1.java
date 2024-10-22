package defpackage;

/* loaded from: classes2.dex */
public final class fo1 extends r72 {
    public static final fo1 c = new fo1();

    public fo1() {
        super(jo1.f2800a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        co1 co1Var = (co1) obj;
        long H = f40Var.H(this.f4114b, i);
        co1Var.b(co1Var.d() + 1);
        long[] jArr = co1Var.f675a;
        int i2 = co1Var.f676b;
        co1Var.f676b = i2 + 1;
        jArr[i2] = H;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new co1((long[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.j(this.f4114b, i2, jArr[i2]);
        }
    }
}
