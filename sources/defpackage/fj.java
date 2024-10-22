package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class fj implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public static final fj f2099a = new fj();

    /* renamed from: b, reason: collision with root package name */
    public static final mw0 f2100b = mw0.b("baseAddress");
    public static final mw0 c = mw0.b("size");
    public static final mw0 d = mw0.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final mw0 e = mw0.b("uuid");

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        v12 v12Var = (v12) obj2;
        dl dlVar = (dl) ((bb0) obj);
        v12Var.g(f2100b, dlVar.f1800a);
        v12Var.g(c, dlVar.f1801b);
        v12Var.a(d, dlVar.c);
        String str = dlVar.d;
        if (str != null) {
            bArr = str.getBytes(ob0.f3635a);
        } else {
            bArr = null;
        }
        v12Var.a(e, bArr);
    }
}
