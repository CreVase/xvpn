package defpackage;

/* loaded from: classes.dex */
public final class rj implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final rj f4160a = new rj();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f4161b;
    public static final mw0 c;
    public static final mw0 d;
    public static final mw0 e;

    static {
        uy0 a2 = mw0.a("window");
        q9 k = q9.k();
        k.f3969a = 1;
        f4161b = hx2.g(k, a2);
        uy0 a3 = mw0.a("logSourceMetrics");
        q9 k2 = q9.k();
        k2.f3969a = 2;
        c = hx2.g(k2, a3);
        uy0 a4 = mw0.a("globalMetrics");
        q9 k3 = q9.k();
        k3.f3969a = 3;
        d = hx2.g(k3, a4);
        uy0 a5 = mw0.a("appNamespace");
        q9 k4 = q9.k();
        k4.f3969a = 4;
        e = hx2.g(k4, a5);
    }

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        z00 z00Var = (z00) obj;
        v12 v12Var = (v12) obj2;
        v12Var.a(f4161b, z00Var.f5408a);
        v12Var.a(c, z00Var.f5409b);
        v12Var.a(d, z00Var.c);
        v12Var.a(e, z00Var.d);
    }
}
