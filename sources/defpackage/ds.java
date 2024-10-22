package defpackage;

/* loaded from: classes2.dex */
public final class ds extends r72 {
    public static final ds c = new ds();

    public ds() {
        super(gs.f2312a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        cs csVar = (cs) obj;
        byte n = f40Var.n(this.f4114b, i);
        csVar.b(csVar.d() + 1);
        byte[] bArr = csVar.f1663a;
        int i2 = csVar.f1664b;
        csVar.f1664b = i2 + 1;
        bArr[i2] = n;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new cs((byte[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.s(this.f4114b, i2, bArr[i2]);
        }
    }
}
