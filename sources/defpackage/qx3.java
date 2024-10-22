package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class qx3 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4070a;

    /* renamed from: b, reason: collision with root package name */
    public final uy0 f4071b;

    public qx3(AppMeasurementSdk appMeasurementSdk, uy0 uy0Var) {
        this.f4071b = uy0Var;
        appMeasurementSdk.registerOnMeasurementEventListener(new mx3(this));
        this.f4070a = new HashSet();
    }
}
