package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgbz {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zzgqf zzd;
    private final int zze;
    private final String zzf;
    private final zzgbe zzg;
    private final int zzh;

    public zzgbz(Object obj, Object obj2, byte[] bArr, int i, zzgqf zzgqfVar, int i2, String str, zzgbe zzgbeVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i;
        this.zzd = zzgqfVar;
        this.zze = i2;
        this.zzf = str;
        this.zzg = zzgbeVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgbe zzb() {
        return this.zzg;
    }

    public final zzgqf zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
