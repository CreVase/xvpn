package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaas implements zzacm {
    private final zzaav zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaas(zzaav zzaavVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzaavVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j) {
        return this.zza.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        zzacn zzacnVar = new zzacn(j, zzaau.zzf(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzack(zzacnVar, zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
