package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class jj implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final jj f2768a = new jj();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f2769b = mw0.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final mw0 c = mw0.b("importance");
    public static final mw0 d = mw0.b("frames");

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        v12 v12Var = (v12) obj2;
        hl hlVar = (hl) ((fb0) obj);
        v12Var.a(f2769b, hlVar.f2442a);
        v12Var.e(c, hlVar.f2443b);
        v12Var.a(d, hlVar.c);
    }
}
