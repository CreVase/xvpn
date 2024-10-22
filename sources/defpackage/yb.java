package defpackage;

import android.app.Application;

/* loaded from: classes2.dex */
public final class yb implements aa0 {

    /* renamed from: b, reason: collision with root package name */
    public static final yb f5305b = new yb();
    public static Application c;
    public static final b13 d;
    public static final b13 e;
    public static final vg2 f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f5306a = pd0.e();

    static {
        Boolean bool = Boolean.FALSE;
        d = pd0.f(bool);
        b13 f2 = pd0.f(bool);
        e = f2;
        f = new vg2(f2);
    }

    public static void a(String str) {
        Application application = c;
        if (application == null) {
            application = null;
        }
        uo.f(application).i(str);
    }

    @Override // defpackage.aa0
    public final t90 w() {
        return this.f5306a.f5442a;
    }
}
