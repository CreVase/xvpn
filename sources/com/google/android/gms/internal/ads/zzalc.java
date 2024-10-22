package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzalc implements zzacm {
    private final zzakz zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzalc(zzakz zzakzVar, int i, long j, long j2) {
        this.zza = zzakzVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzakzVar.zzd;
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzfk.zzr(j * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzacn zzacnVar = new zzacn(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb < j && max != this.zzd - 1) {
            long j2 = max + 1;
            return new zzack(zzacnVar, new zzacn(zzb(j2), (j2 * this.zza.zzd) + this.zzc));
        }
        return new zzack(zzacnVar, zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
