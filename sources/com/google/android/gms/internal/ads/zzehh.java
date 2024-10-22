package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzehh implements zzeew {
    private final zzdqj zza;

    public zzehh(zzdqj zzdqjVar) {
        this.zza = zzdqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeew
    public final zzeex zza(String str, JSONObject jSONObject) throws zzfds {
        return new zzeex(this.zza.zzc(str, jSONObject), new zzegq(), str);
    }
}
