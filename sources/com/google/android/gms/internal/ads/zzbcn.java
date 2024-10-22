package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes.dex */
public final class zzbcn {
    public static Object zza(zzftm zzftmVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzftmVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
