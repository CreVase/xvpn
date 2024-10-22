package defpackage;

/* loaded from: classes.dex */
public final class zj implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final zj f5488a = new zj();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f5489b;
    public static final mw0 c;

    static {
        uy0 a2 = mw0.a("currentCacheSizeBytes");
        q9 k = q9.k();
        k.f3969a = 1;
        f5489b = hx2.g(k, a2);
        uy0 a3 = mw0.a("maxCacheSizeBytes");
        q9 k2 = q9.k();
        k2.f3969a = 2;
        c = hx2.g(k2, a3);
    }

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        m13 m13Var = (m13) obj;
        v12 v12Var = (v12) obj2;
        v12Var.g(f5489b, m13Var.f3219a);
        v12Var.g(c, m13Var.f3220b);
    }
}
