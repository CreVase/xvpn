package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
public final class zzvf extends zzsx implements zzuw {
    private final zzgh zza;
    private final zzrd zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhk zzh;
    private zzbp zzi;
    private final zzvc zzj;
    private final zzyd zzk;

    public /* synthetic */ zzvf(zzbp zzbpVar, zzgh zzghVar, zzvc zzvcVar, zzrd zzrdVar, zzyd zzydVar, int i, zzve zzveVar) {
        this.zzi = zzbpVar;
        this.zza = zzghVar;
        this.zzj = zzvcVar;
        this.zzb = zzrdVar;
        this.zzk = zzydVar;
        this.zzc = i;
    }

    private final void zzw() {
        zzbf zzbfVar;
        zzcv zzcvVar;
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzbp zzJ = zzJ();
        if (z2) {
            zzbfVar = zzJ.zzf;
        } else {
            zzbfVar = null;
        }
        zzvs zzvsVar = new zzvs(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzJ, zzbfVar);
        if (this.zzd) {
            zzcvVar = new zzvb(this, zzvsVar);
        } else {
            zzcvVar = zzvsVar;
        }
        zzo(zzcvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzG(zztu zztuVar) {
        ((zzva) zztuVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final zztu zzI(zztw zztwVar, zzxz zzxzVar, long j) {
        zzgi zza = this.zza.zza();
        zzhk zzhkVar = this.zzh;
        if (zzhkVar != null) {
            zza.zzf(zzhkVar);
        }
        zzbi zzbiVar = zzJ().zzd;
        zzbiVar.getClass();
        zzvc zzvcVar = this.zzj;
        zzb();
        return new zzva(zzbiVar.zzb, zza, new zzsz(zzvcVar.zza), this.zzb, zzc(zztwVar), this.zzk, zze(zztwVar), this, zzxzVar, null, this.zzc, zzfk.zzq(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final synchronized zzbp zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        if (!this.zzd && this.zze == j && this.zzf == z && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = z;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    public final void zzn(zzhk zzhkVar) {
        this.zzh = zzhkVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzty
    public final synchronized void zzt(zzbp zzbpVar) {
        this.zzi = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzz() {
    }
}
