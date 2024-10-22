package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfia {
    private final HashMap zza;
    private final zzfig zzb;

    private zzfia() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfig(com.google.android.gms.ads.internal.zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    public static zzfia zzb(String str) {
        zzfia zzfiaVar = new zzfia();
        zzfiaVar.zza.put("action", str);
        return zzfiaVar;
    }

    public static zzfia zzc(String str) {
        zzfia zzfiaVar = new zzfia();
        zzfiaVar.zza.put("request_id", str);
        return zzfiaVar;
    }

    public final zzfia zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfia zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfia zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfia zzf(zzfcr zzfcrVar) {
        this.zza.put("aai", zzfcrVar.zzy);
        return this;
    }

    public final zzfia zzg(zzfcv zzfcvVar) {
        if (!TextUtils.isEmpty(zzfcvVar.zzb)) {
            this.zza.put("gqi", zzfcvVar.zzb);
        }
        return this;
    }

    public final zzfia zzh(zzfde zzfdeVar, zzcag zzcagVar) {
        String str;
        zzfdd zzfddVar = zzfdeVar.zzb;
        zzg(zzfddVar.zzb);
        if (!zzfddVar.zza.isEmpty()) {
            switch (((zzfcr) zzfddVar.zza.get(0)).zzb) {
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
                    if (zzcagVar != null) {
                        HashMap hashMap = this.zza;
                        if (true != zzcagVar.zzm()) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                        hashMap.put("as", str);
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfia zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfif zzfifVar : this.zzb.zza()) {
            hashMap.put(zzfifVar.zza, zzfifVar.zzb);
        }
        return hashMap;
    }
}
