package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahe implements zzahb {
    private final zzfb zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzahe(zzagx zzagxVar) {
        zzfb zzfbVar = zzagxVar.zza;
        this.zza = zzfbVar;
        zzfbVar.zzG(12);
        this.zzc = zzfbVar.zzo() & 255;
        this.zzb = zzfbVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzl();
        }
        if (i == 16) {
            return this.zza.zzp();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 == 0) {
            int zzl = this.zza.zzl();
            this.zze = zzl;
            return (zzl & 240) >> 4;
        }
        return this.zze & 15;
    }
}
