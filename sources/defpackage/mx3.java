package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzii;

/* loaded from: classes2.dex */
public final class mx3 implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qx3 f3371a;

    public mx3(qx3 qx3Var) {
        this.f3371a = qx3Var;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzil
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        qx3 qx3Var = this.f3371a;
        if (!qx3Var.f4070a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        ob1 ob1Var = dx3.f1859a;
        String zza = zzii.zza(str2);
        if (zza != null) {
            str2 = zza;
        }
        bundle2.putString("events", str2);
        qx3Var.f4071b.m(2, bundle2);
    }
}
