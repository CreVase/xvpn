package defpackage;

/* loaded from: classes2.dex */
public final class gd1 extends r72 {
    public static final gd1 c = new gd1();

    public gd1() {
        super(ld1.f3105a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        dd1 dd1Var = (dd1) obj;
        int u = f40Var.u(this.f4114b, i);
        dd1Var.b(dd1Var.d() + 1);
        int[] iArr = dd1Var.f1762a;
        int i2 = dd1Var.f1763b;
        dd1Var.f1763b = i2 + 1;
        iArr[i2] = u;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new dd1((int[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.x(i2, iArr[i2], this.f4114b);
        }
    }
}
