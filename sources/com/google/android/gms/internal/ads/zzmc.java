package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzmc {
    public final long zza;
    public final zzcv zzb;
    public final int zzc;
    public final zztw zzd;
    public final long zze;
    public final zzcv zzf;
    public final int zzg;
    public final zztw zzh;
    public final long zzi;
    public final long zzj;

    public zzmc(long j, zzcv zzcvVar, int i, zztw zztwVar, long j2, zzcv zzcvVar2, int i2, zztw zztwVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzcvVar;
        this.zzc = i;
        this.zzd = zztwVar;
        this.zze = j2;
        this.zzf = zzcvVar2;
        this.zzg = i2;
        this.zzh = zztwVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmc.class == obj.getClass()) {
            zzmc zzmcVar = (zzmc) obj;
            if (this.zza == zzmcVar.zza && this.zzc == zzmcVar.zzc && this.zze == zzmcVar.zze && this.zzg == zzmcVar.zzg && this.zzi == zzmcVar.zzi && this.zzj == zzmcVar.zzj && zzfsr.zza(this.zzb, zzmcVar.zzb) && zzfsr.zza(this.zzd, zzmcVar.zzd) && zzfsr.zza(this.zzf, zzmcVar.zzf) && zzfsr.zza(this.zzh, zzmcVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
