package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class zzbco {
    private final String zza = (String) zzbdv.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbco(Context context, String str) {
        String packageName;
        Object obj;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (true != com.google.android.gms.ads.internal.util.zzt.zzD(context)) {
            obj = "0";
        } else {
            obj = "1";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future zzb = com.google.android.gms.ads.internal.zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvl) zzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvl) zzb.get()).zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkq)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.zzA(context) ? "1" : "0");
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
