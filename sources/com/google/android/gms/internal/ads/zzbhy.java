package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbhy implements zzbjj {
    private final zzbhz zza;

    public zzbhy(zzbhz zzbhzVar) {
        this.zza = zzbhzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzcat.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbw.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                zzcat.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            zzcat.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
