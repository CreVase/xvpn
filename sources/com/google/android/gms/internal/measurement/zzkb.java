package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkb<K, V> {
    public static <K, V> int zza(zzke<K, V> zzkeVar, K k, V v) {
        return zziq.zza(zzkeVar.zza, 1, k) + zziq.zza(zzkeVar.zzc, 2, v);
    }

    public static <K, V> void zza(zzig zzigVar, zzke<K, V> zzkeVar, K k, V v) throws IOException {
        zziq.zza(zzigVar, zzkeVar.zza, 1, k);
        zziq.zza(zzigVar, zzkeVar.zzc, 2, v);
    }
}
