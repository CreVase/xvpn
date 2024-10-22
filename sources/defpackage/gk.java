package defpackage;

/* loaded from: classes2.dex */
public final class gk implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final gk f2263a = new gk();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f2264b = mw0.b("sessionId");
    public static final mw0 c = mw0.b("firstSessionId");
    public static final mw0 d = mw0.b("sessionIndex");
    public static final mw0 e = mw0.b("eventTimestampUs");
    public static final mw0 f = mw0.b("dataCollectionStatus");
    public static final mw0 g = mw0.b("firebaseInstallationId");

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        er2 er2Var = (er2) obj;
        v12 v12Var = (v12) obj2;
        v12Var.a(f2264b, er2Var.f1980a);
        v12Var.a(c, er2Var.f1981b);
        v12Var.e(d, er2Var.c);
        v12Var.g(e, er2Var.d);
        v12Var.a(f, er2Var.e);
        v12Var.a(g, er2Var.f);
    }
}
