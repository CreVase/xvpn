package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbos {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    public zzbos(JSONObject jSONObject) throws JSONException {
        if (zzcat.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbor zzborVar = new zzbor(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzborVar.zzv);
                arrayList.add(zzborVar);
                if (i < 0) {
                    Iterator it = zzborVar.zzc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        this.zzg = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzt.zzg();
            this.zzb = zzbot.zza(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzt.zzg();
            this.zzc = zzbot.zza(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzt.zzg();
            this.zzd = zzbot.zza(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzt.zzg();
            this.zze = zzbot.zza(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzt.zzg();
            this.zzf = zzbot.zza(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            zzbwi zza = zzbwi.zza(optJSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.zzh = null;
            } else {
                this.zzh = zza.zza;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzh = null;
    }
}
