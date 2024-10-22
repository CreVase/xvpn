package defpackage;

/* loaded from: classes2.dex */
public final class lj implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final lj f3135a = new lj();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f3136b = mw0.b("batteryLevel");
    public static final mw0 c = mw0.b("batteryVelocity");
    public static final mw0 d = mw0.b("proximityOn");
    public static final mw0 e = mw0.b("orientation");
    public static final mw0 f = mw0.b("ramUsed");
    public static final mw0 g = mw0.b("diskUsed");

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        v12 v12Var = (v12) obj2;
        jl jlVar = (jl) ((ib0) obj);
        v12Var.a(f3136b, jlVar.f2784a);
        v12Var.e(c, jlVar.f2785b);
        v12Var.d(d, jlVar.c);
        v12Var.e(e, jlVar.d);
        v12Var.g(f, jlVar.e);
        v12Var.g(g, jlVar.f);
    }
}
