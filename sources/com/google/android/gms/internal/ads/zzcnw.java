package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcnw implements zzcnm {
    private final zzdvm zza;

    public zzcnw(zzdvm zzdvmVar) {
        this.zza = zzdvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziV)).booleanValue()) {
                this.zza.zzm(jSONObject);
            }
        }
    }
}
