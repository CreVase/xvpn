package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzdf {
    public final int zzb;
    private final zzcx zzg;
    private final int[] zzh;
    private final boolean[] zzi;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzde
    };

    public zzdf(zzcx zzcxVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzcxVar.zzb;
        this.zzb = 1;
        this.zzg = zzcxVar;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdf.class == obj.getClass()) {
            zzdf zzdfVar = (zzdf) obj;
            if (this.zzg.equals(zzdfVar.zzg) && Arrays.equals(this.zzh, zzdfVar.zzh) && Arrays.equals(this.zzi, zzdfVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzh) + (this.zzg.hashCode() * 961);
        return Arrays.hashCode(this.zzi) + (hashCode * 31);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzam zzb(int i) {
        return this.zzg.zzb(0);
    }

    public final boolean zzc() {
        for (boolean z : this.zzi) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zzi[0];
    }
}
