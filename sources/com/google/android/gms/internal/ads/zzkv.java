package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzkv {
    public final zztw zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzkv(zztw zztwVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6 = true;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        zzdx.zzd(z5);
        if (z3 && !z2) {
            z6 = false;
        }
        zzdx.zzd(z6);
        this.zza = zztwVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkv.class == obj.getClass()) {
            zzkv zzkvVar = (zzkv) obj;
            if (this.zzb == zzkvVar.zzb && this.zzc == zzkvVar.zzc && this.zzd == zzkvVar.zzd && this.zze == zzkvVar.zze && this.zzg == zzkvVar.zzg && this.zzh == zzkvVar.zzh && this.zzi == zzkvVar.zzi && zzfk.zzE(this.zza, zzkvVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j = this.zze;
        long j2 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkv zza(long j) {
        if (j == this.zzc) {
            return this;
        }
        return new zzkv(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkv zzb(long j) {
        if (j == this.zzb) {
            return this;
        }
        return new zzkv(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
