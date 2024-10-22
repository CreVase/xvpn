package defpackage;

/* loaded from: classes2.dex */
public final class az0 extends r72 {
    public static final az0 c = new az0();

    public az0() {
        super(cz0.f1704a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        xy0 xy0Var = (xy0) obj;
        float i2 = f40Var.i(this.f4114b, i);
        xy0Var.b(xy0Var.d() + 1);
        float[] fArr = xy0Var.f5245a;
        int i3 = xy0Var.f5246b;
        xy0Var.f5246b = i3 + 1;
        fArr[i3] = i2;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new xy0((float[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.G(this.f4114b, i2, fArr[i2]);
        }
    }
}
