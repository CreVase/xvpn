package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlk {
    private static final zztw zzt = new zztw(new Object(), -1);
    public final zzcv zza;
    public final zztw zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzil zzf;
    public final boolean zzg;
    public final zzvx zzh;
    public final zzxr zzi;
    public final List zzj;
    public final zztw zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcg zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzlk(zzcv zzcvVar, zztw zztwVar, long j, long j2, int i, zzil zzilVar, boolean z, zzvx zzvxVar, zzxr zzxrVar, List list, zztw zztwVar2, boolean z2, int i2, zzcg zzcgVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzcvVar;
        this.zzb = zztwVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzilVar;
        this.zzg = z;
        this.zzh = zzvxVar;
        this.zzi = zzxrVar;
        this.zzj = list;
        this.zzk = zztwVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzcgVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
        this.zzo = z3;
    }

    public static zzlk zzi(zzxr zzxrVar) {
        zzcv zzcvVar = zzcv.zza;
        zztw zztwVar = zzt;
        return new zzlk(zzcvVar, zztwVar, -9223372036854775807L, 0L, 1, null, false, zzvx.zza, zzxrVar, zzfvs.zzl(), zztwVar, false, 0, zzcg.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zztw zzj() {
        return zzt;
    }

    public final long zza() {
        long j;
        long j2;
        if (!zzk()) {
            return this.zzr;
        }
        do {
            j = this.zzs;
            j2 = this.zzr;
        } while (j != this.zzs);
        return zzfk.zzq(zzfk.zzs(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.zzn.zzc));
    }

    public final zzlk zzb() {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, zza(), SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlk zzc(zztw zztwVar) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zztwVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlk zzd(zztw zztwVar, long j, long j2, long j3, long j4, zzvx zzvxVar, zzxr zzxrVar, List list) {
        zztw zztwVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        zzcg zzcgVar = this.zzn;
        long j5 = this.zzp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.zzo;
        return new zzlk(this.zza, zztwVar, j2, j3, this.zze, this.zzf, this.zzg, zzvxVar, zzxrVar, list, zztwVar2, z, i, zzcgVar, j5, j4, j, elapsedRealtime, z2);
    }

    public final zzlk zze(boolean z, int i) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlk zzf(zzil zzilVar) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzilVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlk zzg(int i) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlk zzh(zzcv zzcvVar) {
        return new zzlk(zzcvVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final boolean zzk() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
