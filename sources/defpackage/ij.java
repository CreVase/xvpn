package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class ij implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final ij f2605a = new ij();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f2606b = mw0.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final mw0 c = mw0.b("code");
    public static final mw0 d = mw0.b("address");

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        v12 v12Var = (v12) obj2;
        gl glVar = (gl) ((db0) obj);
        v12Var.a(f2606b, glVar.f2270a);
        v12Var.a(c, glVar.f2271b);
        v12Var.g(d, glVar.c);
    }
}
