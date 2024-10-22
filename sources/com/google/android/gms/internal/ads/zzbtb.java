package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbtb {
    public final boolean zza;
    public final String zzb;

    public zzbtb(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbtb zza(JSONObject jSONObject) {
        return new zzbtb(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
