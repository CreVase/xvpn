package defpackage;

/* loaded from: classes2.dex */
public final class tw extends r72 {
    public static final tw c = new tw();

    public tw() {
        super(cx.f1694a);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // defpackage.y10, defpackage.u
    public final void f(f40 f40Var, int i, Object obj, boolean z) {
        rw rwVar = (rw) obj;
        char l = f40Var.l(this.f4114b, i);
        rwVar.b(rwVar.d() + 1);
        char[] cArr = rwVar.f4221a;
        int i2 = rwVar.f4222b;
        rwVar.f4222b = i2 + 1;
        cArr[i2] = l;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new rw((char[]) obj);
    }

    @Override // defpackage.r72
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.r72
    public final void k(g40 g40Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            g40Var.y(this.f4114b, i2, cArr[i2]);
        }
    }
}
