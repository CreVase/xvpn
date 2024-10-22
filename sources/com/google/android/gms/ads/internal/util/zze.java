package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzcat;

/* loaded from: classes.dex */
public final class zze extends zzcat {
    public static void zza(String str) {
        if (zzc() && str != null && str.length() > 4000) {
            for (String str2 : zzcat.zza.zzd(str)) {
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        if (zzcat.zzm(2) && ((Boolean) zzbee.zza.zze()).booleanValue()) {
            return true;
        }
        return false;
    }
}
