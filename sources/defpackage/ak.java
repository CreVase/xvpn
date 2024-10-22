package defpackage;

/* loaded from: classes.dex */
public final class ak implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final ak f100a = new ak();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f101b;
    public static final mw0 c;

    static {
        uy0 a2 = mw0.a("startMs");
        q9 k = q9.k();
        k.f3969a = 1;
        f101b = hx2.g(k, a2);
        uy0 a3 = mw0.a("endMs");
        q9 k2 = q9.k();
        k2.f3969a = 2;
        c = hx2.g(k2, a3);
    }

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        w83 w83Var = (w83) obj;
        v12 v12Var = (v12) obj2;
        v12Var.g(f101b, w83Var.f4961a);
        v12Var.g(c, w83Var.f4962b);
    }
}
