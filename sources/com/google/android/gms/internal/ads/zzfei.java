package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfei {
    public static void zza(Context context, boolean z) {
        if (z) {
            zzcat.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        zzcat.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzcam.zzy(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        zzcat.zzi("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, str);
    }
}
