package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgmh {
    private final zzgbj zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgmh(zzgbj zzgbjVar, int i, String str, String str2, zzgmg zzgmgVar) {
        this.zza = zzgbjVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmh)) {
            return false;
        }
        zzgmh zzgmhVar = (zzgmh) obj;
        if (this.zza != zzgmhVar.zza || this.zzb != zzgmhVar.zzb || !this.zzc.equals(zzgmhVar.zzc) || !this.zzd.equals(zzgmhVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
