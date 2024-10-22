package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzevz implements zzetv {
    private final String zza;

    public zzevz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbw.zzf((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.zza)) {
                zzf.put("attok", this.zza);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting attestation token.", e);
        }
    }
}
