package defpackage;

/* loaded from: classes2.dex */
public final class hg3 extends r72 {
    public static final hg3 c = new hg3();

    public hg3() {
        super(ig3.f2590a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((fg3) obj).f2090a.length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        gg3 gg3Var = (gg3) obj;
        int p = f40Var.e(this.f4114b, i).p();
        gg3Var.b(gg3Var.d() + 1);
        int[] iArr = gg3Var.f2253a;
        int i2 = gg3Var.f2254b;
        gg3Var.f2254b = i2 + 1;
        iArr[i2] = p;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new gg3(((fg3) obj).f2090a);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new fg3(new int[0]);
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        int[] iArr = ((fg3) obj).f2090a;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.E(this.f4114b, i2).z(iArr[i2]);
        }
    }
}
