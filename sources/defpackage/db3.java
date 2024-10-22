package defpackage;

/* loaded from: classes.dex */
public final class db3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1753a;

    /* renamed from: b, reason: collision with root package name */
    public final cj2[] f1754b;
    public final mu0[] c;
    public final gb3 d;
    public final Object e;

    public db3(cj2[] cj2VarArr, mu0[] mu0VarArr, gb3 gb3Var, gq1 gq1Var) {
        this.f1754b = cj2VarArr;
        this.c = (mu0[]) mu0VarArr.clone();
        this.d = gb3Var;
        this.e = gq1Var;
        this.f1753a = cj2VarArr.length;
    }

    public final boolean a(db3 db3Var, int i) {
        if (db3Var == null || !wi3.a(this.f1754b[i], db3Var.f1754b[i]) || !wi3.a(this.c[i], db3Var.c[i])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i) {
        if (this.f1754b[i] != null) {
            return true;
        }
        return false;
    }
}
