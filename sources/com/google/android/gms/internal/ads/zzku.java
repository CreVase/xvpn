package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzku {
    public final zztu zza;
    public final Object zzb;
    public final zzvo[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkv zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlt[] zzi;
    private final zzxq zzj;
    private final zzlj zzk;
    private zzku zzl;
    private zzvx zzm;
    private zzxr zzn;
    private long zzo;

    public zzku(zzlt[] zzltVarArr, long j, zzxq zzxqVar, zzxz zzxzVar, zzlj zzljVar, zzkv zzkvVar, zzxr zzxrVar) {
        this.zzi = zzltVarArr;
        this.zzo = j;
        this.zzj = zzxqVar;
        this.zzk = zzljVar;
        zztw zztwVar = zzkvVar.zza;
        this.zzb = zztwVar.zza;
        this.zzf = zzkvVar;
        this.zzm = zzvx.zza;
        this.zzn = zzxrVar;
        this.zzc = new zzvo[2];
        this.zzh = new boolean[2];
        long j2 = zzkvVar.zzb;
        long j3 = zzkvVar.zzd;
        zztu zzp = zzljVar.zzp(zztwVar, zzxzVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zztb(zzp, true, 0L, j3) : zzp;
    }

    private final void zzs() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzxr zzxrVar = this.zzn;
                if (i < zzxrVar.zza) {
                    zzxrVar.zzb(i);
                    zzxk zzxkVar = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzxr zzxrVar = this.zzn;
                if (i < zzxrVar.zza) {
                    zzxrVar.zzb(i);
                    zzxk zzxkVar = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzxr zzxrVar, long j, boolean z) {
        return zzb(zzxrVar, j, false, new boolean[2]);
    }

    public final long zzb(zzxr zzxrVar, long j, boolean z, boolean[] zArr) {
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= zzxrVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzxrVar.zza(this.zzn, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlt[] zzltVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzltVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzxrVar;
        zzt();
        long zzf = this.zza.zzf(zzxrVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzlt[] zzltVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzltVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzvo[] zzvoVarArr = this.zzc;
            if (i4 < 2) {
                if (zzvoVarArr[i4] != null) {
                    zzdx.zzf(zzxrVar.zzb(i4));
                    this.zzi[i4].zzb();
                    this.zze = true;
                } else {
                    if (zzxrVar.zzc[i4] == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzdx.zzf(z2);
                }
                i4++;
            } else {
                return zzf;
            }
        }
    }

    public final long zzc() {
        long j;
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        if (this.zze) {
            j = this.zza.zzb();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.zzf.zze;
        }
        return j;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0L;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzku zzg() {
        return this.zzl;
    }

    public final zzvx zzh() {
        return this.zzm;
    }

    public final zzxr zzi() {
        return this.zzn;
    }

    public final zzxr zzj(float f, zzcv zzcvVar) throws zzil {
        zzxr zzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzcvVar);
        for (zzxk zzxkVar : zzo.zzc) {
        }
        return zzo;
    }

    public final void zzk(long j, float f, long j2) {
        zzdx.zzf(zzu());
        long j3 = j - this.zzo;
        zzkq zzkqVar = new zzkq();
        zzkqVar.zze(j3);
        zzkqVar.zzf(f);
        zzkqVar.zzd(j2);
        this.zza.zzo(new zzks(zzkqVar, null));
    }

    public final void zzl(float f, zzcv zzcvVar) throws zzil {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzxr zzj = zzj(f, zzcvVar);
        zzkv zzkvVar = this.zzf;
        long j = zzkvVar.zzb;
        long j2 = zzkvVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zza = zza(zzj, j, false);
        long j3 = this.zzo;
        zzkv zzkvVar2 = this.zzf;
        this.zzo = (zzkvVar2.zzb - zza) + j3;
        this.zzf = zzkvVar2.zzb(zza);
    }

    public final void zzm(long j) {
        zzdx.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zztu zztuVar = this.zza;
        try {
            boolean z = zztuVar instanceof zztb;
            zzlj zzljVar = this.zzk;
            if (z) {
                zzljVar.zzi(((zztb) zztuVar).zza);
            } else {
                zzljVar.zzi(zztuVar);
            }
        } catch (RuntimeException e) {
            zzer.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzku zzkuVar) {
        if (zzkuVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkuVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zztu zztuVar = this.zza;
        if (zztuVar instanceof zztb) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zztb) zztuVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        if (!this.zzd) {
            return false;
        }
        if (this.zze && this.zza.zzb() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }
}
