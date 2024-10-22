package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzewu implements zzetv {
    private final Bundle zza;

    public zzewu(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbw.zzf(com.google.android.gms.ads.internal.util.zzbw.zzf(jSONObject, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzay.zzb().zzh(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
