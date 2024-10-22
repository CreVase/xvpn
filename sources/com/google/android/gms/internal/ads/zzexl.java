package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzexl implements zzetv {
    private final String zza;

    public zzexl(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                com.google.android.gms.ads.internal.util.zzbw.zzf(jSONObject, "pii").put("adsid", this.zza);
            }
        } catch (JSONException e) {
            zzcat.zzk("Failed putting trustless token.", e);
        }
    }
}
