package defpackage;

/* loaded from: classes.dex */
public final class uj implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final uj f4678a = new uj();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f4679b;
    public static final mw0 c;

    static {
        uy0 a2 = mw0.a("logSource");
        q9 k = q9.k();
        k.f3969a = 1;
        f4679b = hx2.g(k, a2);
        uy0 a3 = mw0.a("logEventDropped");
        q9 k2 = q9.k();
        k2.f3969a = 2;
        c = hx2.g(k2, a3);
    }

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        zn1 zn1Var = (zn1) obj;
        v12 v12Var = (v12) obj2;
        v12Var.a(f4679b, zn1Var.f5516a);
        v12Var.a(c, zn1Var.f5517b);
    }
}
