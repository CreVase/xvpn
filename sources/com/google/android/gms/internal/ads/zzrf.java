package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzrf {
    public static final boolean zza;

    static {
        boolean z = false;
        if ("Amazon".equals(zzfk.zzc)) {
            String str = zzfk.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            }
        }
        zza = z;
    }
}
