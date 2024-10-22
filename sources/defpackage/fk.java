package defpackage;

/* loaded from: classes2.dex */
public final class fk implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final fk f2101a = new fk();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f2102b = mw0.b("eventType");
    public static final mw0 c = mw0.b("sessionData");
    public static final mw0 d = mw0.b("applicationInfo");

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        br2 br2Var = (br2) obj;
        v12 v12Var = (v12) obj2;
        br2Var.getClass();
        v12Var.a(f2102b, ps0.SESSION_START);
        v12Var.a(c, br2Var.f516a);
        v12Var.a(d, br2Var.f517b);
    }
}
