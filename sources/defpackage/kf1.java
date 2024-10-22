package defpackage;

/* loaded from: classes2.dex */
public final class kf1 extends if1 {
    public final nf1 e;
    public final lf1 f;
    public final oz g;
    public final Object h;

    public kf1(nf1 nf1Var, lf1 lf1Var, oz ozVar, Object obj) {
        this.e = nf1Var;
        this.f = lf1Var;
        this.g = ozVar;
        this.h = obj;
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return ch3.f636a;
    }

    @Override // defpackage.if1
    public final void l(Throwable th) {
        nf1 nf1Var = this.e;
        nf1Var.getClass();
        oz N = nf1.N(this.g);
        lf1 lf1Var = this.f;
        Object obj = this.h;
        if (N == null || !nf1Var.V(lf1Var, N, obj)) {
            nf1Var.o(nf1Var.z(lf1Var, obj));
        }
    }
}
