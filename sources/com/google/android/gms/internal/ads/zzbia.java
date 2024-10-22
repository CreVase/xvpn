package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbia implements zzbjj {
    private final zzbib zza;

    public zzbia(zzbib zzbibVar) {
        this.zza = zzbibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzcat.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}
