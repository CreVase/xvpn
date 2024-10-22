package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ra implements qa {
    public static volatile ra c;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f4119a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4120b;

    public ra(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f4119a = appMeasurementSdk;
        this.f4120b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!(!dx3.c.contains(str)) || !dx3.a(str2, bundle) || !dx3.b(bundle, str, str2)) {
            return;
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.f4119a.logEvent(str, str2, bundle);
    }

    public final uy0 b(uy0 uy0Var, String str) {
        Object obj;
        Preconditions.checkNotNull(uy0Var);
        boolean z = true;
        if (!(!dx3.c.contains(str))) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f4120b;
        if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
            z = false;
        }
        if (z) {
            return null;
        }
        boolean equals = AppMeasurement.FIAM_ORIGIN.equals(str);
        AppMeasurementSdk appMeasurementSdk = this.f4119a;
        if (equals) {
            obj = new qx3(appMeasurementSdk, uy0Var);
        } else if ("clx".equals(str)) {
            obj = new ay3(appMeasurementSdk, uy0Var);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new uy0(this, str, 15);
    }
}
