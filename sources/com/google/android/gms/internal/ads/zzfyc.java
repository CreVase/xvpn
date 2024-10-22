package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfyc {
    public static byte zza(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        zzfsw.zzg(z, "out of range: %s", j);
        return (byte) j;
    }
}
