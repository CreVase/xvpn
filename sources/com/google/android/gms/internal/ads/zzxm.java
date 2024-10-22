package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzxm {
    private final String[] zza;
    private final int[] zzb;
    private final zzvx[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzvx zzf;

    public zzxm(String[] strArr, int[] iArr, zzvx[] zzvxVarArr, int[] iArr2, int[][][] iArr3, zzvx zzvxVar) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzvxVarArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzvxVar;
    }

    public final int zza(int i, int i2, boolean z) {
        int i3 = this.zzc[i].zzb(i2).zzb;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (char c = 0; c <= 0; c = 1) {
            if ((this.zze[i][i2][0] & 7) == 4) {
                iArr[i5] = 0;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 16;
        while (i4 < copyOf.length) {
            String str2 = this.zzc[i].zzb(i2).zzb(copyOf[i4]).zzm;
            int i8 = i6 + 1;
            if (i6 == 0) {
                str = str2;
            } else {
                z2 |= !zzfk.zzE(str, str2);
            }
            i7 = Math.min(i7, this.zze[i][i2][i4] & 24);
            i4++;
            i6 = i8;
        }
        if (z2) {
            return Math.min(i7, this.zzd[i]);
        }
        return i7;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.zze[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    public final zzvx zzd(int i) {
        return this.zzc[i];
    }

    public final zzvx zze() {
        return this.zzf;
    }
}
