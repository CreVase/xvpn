package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjv implements zzbjj {
    private final zzdwg zza;

    public zzbjv(zzdwg zzdwgVar) {
        this.zza = zzdwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjd)).booleanValue()) {
            return;
        }
        String str = (String) map.get("action");
        String str2 = (String) map.get("adUnitId");
        String str3 = (String) map.get("redirectUrl");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.zza.zzh(str2, str4, str3);
            } else if (str.equals("show")) {
                this.zza.zzi(str2, str3);
            }
        }
    }
}
