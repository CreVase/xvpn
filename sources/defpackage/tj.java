package defpackage;

/* loaded from: classes.dex */
public final class tj implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final tj f4514a = new tj();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f4515b;
    public static final mw0 c;

    static {
        uy0 a2 = mw0.a("eventsDroppedCount");
        q9 k = q9.k();
        k.f3969a = 1;
        f4515b = hx2.g(k, a2);
        uy0 a3 = mw0.a("reason");
        q9 k2 = q9.k();
        k2.f3969a = 3;
        c = hx2.g(k2, a3);
    }

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        wn1 wn1Var = (wn1) obj;
        v12 v12Var = (v12) obj2;
        v12Var.g(f4515b, wn1Var.f5042a);
        v12Var.a(c, wn1Var.f5043b);
    }
}
