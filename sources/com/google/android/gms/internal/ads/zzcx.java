package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcx {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcw
    };

    public zzcx(String str, zzam... zzamVarArr) {
        this.zzc = str;
        this.zzg = zzamVarArr;
        int zzb = zzcb.zzb(zzamVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzcb.zzb(zzamVarArr[0].zzl) : zzb;
        zzd(zzamVarArr[0].zzd);
        int i = zzamVarArr[0].zzf;
    }

    private static String zzd(String str) {
        if (str != null && !str.equals("und")) {
            return str;
        }
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcx.class == obj.getClass()) {
            zzcx zzcxVar = (zzcx) obj;
            if (this.zzc.equals(zzcxVar.zzc) && Arrays.equals(this.zzg, zzcxVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i == 0) {
            int hashCode = this.zzc.hashCode() + 527;
            int hashCode2 = Arrays.hashCode(this.zzg) + (hashCode * 31);
            this.zzh = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final int zza(zzam zzamVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzamVar == this.zzg[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzam zzb(int i) {
        return this.zzg[i];
    }

    public final zzcx zzc(String str) {
        return new zzcx(str, this.zzg);
    }
}
