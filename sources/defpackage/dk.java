package defpackage;

/* loaded from: classes2.dex */
public final class dk implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk f1795a = new dk();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f1796b = mw0.b("appId");
    public static final mw0 c = mw0.b("deviceModel");
    public static final mw0 d = mw0.b("sessionSdkVersion");
    public static final mw0 e = mw0.b("osVersion");
    public static final mw0 f = mw0.b("logEnvironment");
    public static final mw0 g = mw0.b("androidAppInfo");

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        v12 v12Var = (v12) obj2;
        v12Var.a(f1796b, vfVar.f4823a);
        v12Var.a(c, vfVar.f4824b);
        v12Var.a(d, "1.1.0");
        v12Var.a(e, vfVar.c);
        v12Var.a(f, tn1.LOG_ENVIRONMENT_PROD);
        v12Var.a(g, vfVar.d);
    }
}
