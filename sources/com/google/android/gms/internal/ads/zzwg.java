package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class zzwg implements zzxk {
    protected final zzcx zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzam[] zzd;
    private int zze;

    public zzwg(zzcx zzcxVar, int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        zzcxVar.getClass();
        this.zza = zzcxVar;
        this.zzb = length;
        this.zzd = new zzam[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzcxVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzam) obj2).zzi - ((zzam) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzcxVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwg zzwgVar = (zzwg) obj;
            if (this.zza.equals(zzwgVar.zza) && Arrays.equals(this.zzc, zzwgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zza(int i) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzam zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzcx zze() {
        return this.zza;
    }
}
