package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzcof implements zzcnm {
    private final zzbya zza;

    public zzcof(zzbya zzbyaVar) {
        this.zza = zzbyaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzbya] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(JSONObject jSONObject) {
        ?? r4;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            r4 = -1;
        } else {
            r4 = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(r4, optLong);
    }
}
