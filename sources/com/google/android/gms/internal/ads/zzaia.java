package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
final class zzaia implements zzacm {
    final /* synthetic */ zzaib zza;

    public /* synthetic */ zzaia(zzaib zzaibVar, zzahz zzahzVar) {
        this.zza = zzaibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        zzain zzainVar;
        long j;
        zzaib zzaibVar = this.zza;
        zzainVar = zzaibVar.zzd;
        j = zzaibVar.zzf;
        return zzainVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        zzain zzainVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzaib zzaibVar = this.zza;
        zzainVar = zzaibVar.zzd;
        long zzg = zzainVar.zzg(j);
        j2 = zzaibVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaib zzaibVar2 = this.zza;
        j3 = zzaibVar2.zzc;
        j4 = zzaibVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = this.zza.zzf;
        long longValue = multiply.divide(BigInteger.valueOf(j5)).longValue() + j2;
        zzaib zzaibVar3 = this.zza;
        j6 = zzaibVar3.zzb;
        j7 = zzaibVar3.zzc;
        zzacn zzacnVar = new zzacn(j, Math.max(j6, Math.min(longValue - 30000, j7 - 1)));
        return new zzack(zzacnVar, zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
