package defpackage;

/* loaded from: classes2.dex */
public final class xf3 extends r72 {
    public static final xf3 c = new xf3();

    public xf3() {
        super(yf3.f5327a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((vf3) obj).f4825a.length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        wf3 wf3Var = (wf3) obj;
        byte D = f40Var.e(this.f4114b, i).D();
        wf3Var.b(wf3Var.d() + 1);
        byte[] bArr = wf3Var.f4997a;
        int i2 = wf3Var.f4998b;
        wf3Var.f4998b = i2 + 1;
        bArr[i2] = D;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new wf3(((vf3) obj).f4825a);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new vf3(new byte[0]);
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        byte[] bArr = ((vf3) obj).f4825a;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.E(this.f4114b, i2).k(bArr[i2]);
        }
    }
}
