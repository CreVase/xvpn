package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbor {
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final List zzl;
    public final List zzm;
    public final List zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public zzbor(JSONObject jSONObject) throws JSONException {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        this.zzb = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zzc = Collections.unmodifiableList(arrayList);
        this.zzd = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzf = zzbot.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzg = zzbot.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzh = zzbot.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzj = zzbot.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzl = zzbot.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzn = zzbot.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzm = zzbot.zza(jSONObject, "video_reward_urls");
        this.zzo = jSONObject.optString("transaction_id");
        this.zzp = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzg();
            list = zzbot.zza(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.zzi = list;
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        } else {
            str = null;
        }
        this.zza = str;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str2 = optJSONObject2.toString();
        } else {
            str2 = null;
        }
        this.zzk = str2;
        if (optJSONObject2 != null) {
            str3 = optJSONObject2.optString("class_name");
        } else {
            str3 = null;
        }
        this.zze = str3;
        this.zzq = jSONObject.optString("html_template", null);
        this.zzr = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            str4 = optJSONObject3.toString();
        } else {
            str4 = null;
        }
        this.zzs = str4;
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzt = zzbot.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            str5 = optJSONObject4.toString();
        } else {
            str5 = null;
        }
        this.zzu = str5;
        this.zzv = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
