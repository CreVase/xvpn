package defpackage;

/* loaded from: classes2.dex */
public final class mg3 extends r72 {
    public static final mg3 c = new mg3();

    public mg3() {
        super(ng3.f3455a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((kg3) obj).f2941a.length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        lg3 lg3Var = (lg3) obj;
        long x = f40Var.e(this.f4114b, i).x();
        lg3Var.b(lg3Var.d() + 1);
        long[] jArr = lg3Var.f3122a;
        int i2 = lg3Var.f3123b;
        lg3Var.f3123b = i2 + 1;
        jArr[i2] = x;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new lg3(((kg3) obj).f2941a);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new kg3(new long[0]);
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        long[] jArr = ((kg3) obj).f2941a;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.E(this.f4114b, i2).B(jArr[i2]);
        }
    }
}
