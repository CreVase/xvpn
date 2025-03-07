package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzabb implements zzacm {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzabb(long j, long j2, int i, int i2, boolean z) {
        long zzc;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            zzc = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zzc = zzc(j, j2, i);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        long j2 = this.zzd;
        if (j2 != -1) {
            long j3 = this.zzc;
            long j4 = (((this.zze * j) / 8000000) / j3) * j3;
            if (j2 != -1) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.zzb + Math.max(j4, 0L);
            long zzb = zzb(max);
            zzacn zzacnVar = new zzacn(zzb, max);
            if (this.zzd != -1 && zzb < j) {
                long j5 = max + this.zzc;
                if (j5 < this.zza) {
                    return new zzack(zzacnVar, new zzacn(zzb(j5), j5));
                }
            }
            return new zzack(zzacnVar, zzacnVar);
        }
        zzacn zzacnVar2 = new zzacn(0L, this.zzb);
        return new zzack(zzacnVar2, zzacnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
