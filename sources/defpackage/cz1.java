package defpackage;

/* loaded from: classes.dex */
public final class cz1 {

    /* renamed from: a, reason: collision with root package name */
    public final ym3 f1706a;

    /* renamed from: b, reason: collision with root package name */
    public final g03 f1707b;
    public final fh2 c;
    public final o40 d;
    public int e;

    public cz1(fh2 fh2Var, o40 o40Var, zm3 zm3Var, g03 g03Var) {
        bz1 bz1Var = new bz1(this);
        this.c = fh2Var;
        this.d = o40Var;
        this.f1706a = zm3Var.d(this);
        this.f1707b = g03Var;
        this.e = fh2Var.c();
        fh2Var.f2091a.registerObserver(bz1Var);
    }
}
