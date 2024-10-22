package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes.dex */
public final class zzdsj {
    private final ConcurrentHashMap zza;
    private final zzcag zzb;
    private final zzfdn zzc;
    private final String zzd;
    private final String zze;

    public zzdsj(zzdst zzdstVar, zzcag zzcagVar, zzfdn zzfdnVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdstVar.zzc();
        this.zza = zzc;
        this.zzb = zzcagVar;
        this.zzc = zzfdnVar;
        this.zzd = str;
        this.zze = str2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgW)).booleanValue()) {
            return;
        }
        int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfdnVar);
        int i = zze - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        zzc.put("se", "r_both");
                    } else {
                        zzc.put("se", "r_adstring");
                    }
                } else {
                    zzc.put("se", "r_adinfo");
                }
            } else {
                zzc.put("se", "query_g");
            }
            zzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhw)).booleanValue()) {
                zzc.put("ad_format", str2);
            }
            if (zze == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzfdnVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfdnVar.zzd)));
            return;
        }
        zzc.put("scar", "false");
    }

    private final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfde zzfdeVar) {
        String str;
        if (!zzfdeVar.zzb.zza.isEmpty()) {
            switch (((zzfcr) zzfdeVar.zzb.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    ConcurrentHashMap concurrentHashMap = this.zza;
                    if (true != this.zzb.zzm()) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    concurrentHashMap.put("as", str);
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        zzd("gqi", zzfdeVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
