package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzevt implements zzetv {
    final String zza;
    final int zzb;

    public zzevt(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject zzf = com.google.android.gms.ads.internal.util.zzbw.zzf(jSONObject, "pii");
                zzf.put("pvid", this.zza);
                zzf.put("pvid_s", this.zzb);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
            }
        }
    }
}
