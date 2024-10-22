package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzbq {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        String str;
        synchronized (zzbq.class) {
            str = zzb;
        }
        return str;
    }

    public static synchronized void zzb(String str) {
        synchronized (zzbq.class) {
            if (zza.add(str)) {
                zzb = zzb + ", " + str;
            }
        }
    }
}
