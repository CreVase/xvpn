package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfcx {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfcx(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
        this.zzd = zzh;
        this.zza = zzh.optString("ad_html", null);
        this.zzb = zzh.optString("ad_base_url", null);
        this.zzc = zzh.optJSONObject("ad_json");
    }
}
