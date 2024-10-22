package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class ay3 {

    /* renamed from: a, reason: collision with root package name */
    public final uy0 f364a;

    public ay3(AppMeasurementSdk appMeasurementSdk, uy0 uy0Var) {
        this.f364a = uy0Var;
        appMeasurementSdk.registerOnMeasurementEventListener(new ux3(this));
    }
}
