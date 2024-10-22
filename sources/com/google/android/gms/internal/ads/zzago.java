package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class zzago implements zzagt {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzago(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfk.zzq(jArr2[jArr2.length - 1]) : j;
    }

    public static zzago zzb(long j, zzafl zzaflVar, long j2) {
        int length = zzaflVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzaflVar.zzb + zzaflVar.zzd[i3];
            j3 += zzaflVar.zzc + zzaflVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzago(jArr, jArr2, j2);
    }

    private static Pair zze(long j, long[] jArr, long[] jArr2) {
        double d;
        int zzc = zzfk.zzc(jArr, j, true, true);
        long j2 = jArr[zzc];
        long j3 = jArr2[zzc];
        int i = zzc + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final long zzc() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final long zzd(long j) {
        return zzfk.zzq(((Long) zze(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        Pair zze = zze(zzfk.zzs(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzacn zzacnVar = new zzacn(zzfk.zzq(((Long) zze.first).longValue()), ((Long) zze.second).longValue());
        return new zzack(zzacnVar, zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
