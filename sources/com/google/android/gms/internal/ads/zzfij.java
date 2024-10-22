package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfij {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfij(Context context, zzcaz zzcazVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcazVar.zza;
    }

    public final void zza(Map map) {
        Object obj;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        String str = "0";
        if (true != com.google.android.gms.ads.internal.util.zzt.zzD(this.zza)) {
            obj = "0";
        } else {
            obj = "1";
        }
        map.put("is_lite_sdk", obj);
        zzbca zzbcaVar = zzbci.zza;
        List zzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgQ)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkq)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (true == com.google.android.gms.ads.internal.util.zzt.zzA(this.zza)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
    }
}
