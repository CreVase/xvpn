package defpackage;

/* loaded from: classes.dex */
public final class gm3 implements ui1 {

    /* renamed from: a, reason: collision with root package name */
    public final mh1 f2283a;

    /* renamed from: b, reason: collision with root package name */
    public final v31 f2284b;
    public final v31 c;
    public final v31 d;
    public em3 e;

    public gm3(j00 j00Var, v31 v31Var, v31 v31Var2, v31 v31Var3) {
        this.f2283a = j00Var;
        this.f2284b = v31Var;
        this.c = v31Var2;
        this.d = v31Var3;
    }

    @Override // defpackage.ui1
    public final Object getValue() {
        em3 em3Var = this.e;
        if (em3Var == null) {
            em3 s = new y33((km3) this.f2284b.invoke(), (im3) this.c.invoke(), (bc0) this.d.invoke()).s(fl.D(this.f2283a));
            this.e = s;
            return s;
        }
        return em3Var;
    }
}
