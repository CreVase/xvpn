package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class ux3 implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ay3 f4755a;

    public ux3(ay3 ay3Var) {
        this.f4755a = ay3Var;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzil
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str != null && (!dx3.f1859a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f4755a.f364a.m(3, bundle2);
        }
    }
}
