package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbzw {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzbzw(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zzg = new JSONObject(str);
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkH)).booleanValue() || !zzj()) {
                    if (this.zzg.optInt("status", -1) != 1) {
                        this.zzh = false;
                        zzcat.zzj("App settings could not be fetched successfully.");
                        return;
                    }
                    this.zzh = true;
                    this.zzd = this.zzg.optString("app_id");
                    JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                            String optString = jSONObject.optString("format");
                            String optString2 = jSONObject.optString("ad_unit_id");
                            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.zzb.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.zzc.put(optString2, new zzbos(optJSONObject3));
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
                    if (optJSONArray3 != null) {
                        for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                            this.zza.add(optJSONArray3.optString(i2));
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgQ)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            this.zzi.add(optJSONArray.get(i3).toString());
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgl)).booleanValue() && (optJSONObject = this.zzg.optJSONObject("common_settings")) != null) {
                        this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
                    }
                }
            } catch (JSONException e) {
                zzcat.zzk("Exception occurred while processing app setting json", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j) {
        this.zzf = j;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            zzbca zzbcaVar = zzbci.zzkK;
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).longValue();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkJ)).booleanValue() && !TextUtils.isEmpty(this.zze)) {
                longValue = this.zzg.optLong("cache_ttl_sec", ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).longValue());
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (longValue >= 0) {
                long j = this.zzf;
                if (j > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j) > longValue) {
                    this.zza.clear();
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd = "";
                    this.zze = "";
                    this.zzg = null;
                    this.zzh = false;
                    this.zzi.clear();
                    this.zzj = false;
                    return true;
                }
            }
        }
        return false;
    }
}
