package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzabx implements zzacm {
    private final zzabz zza;
    private final long zzb;

    public zzabx(zzabz zzabzVar, long j) {
        this.zza = zzabzVar;
        this.zzb = j;
    }

    private final zzacn zzb(long j, long j2) {
        return new zzacn((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        long j2;
        zzdx.zzb(this.zza.zzk);
        zzabz zzabzVar = this.zza;
        zzaby zzabyVar = zzabzVar.zzk;
        long[] jArr = zzabyVar.zza;
        long[] jArr2 = zzabyVar.zzb;
        int zzc = zzfk.zzc(jArr, zzabzVar.zzb(j), true, false);
        long j3 = 0;
        if (zzc == -1) {
            j2 = 0;
        } else {
            j2 = jArr[zzc];
        }
        if (zzc != -1) {
            j3 = jArr2[zzc];
        }
        zzacn zzb = zzb(j2, j3);
        if (zzb.zzb != j && zzc != jArr.length - 1) {
            int i = zzc + 1;
            return new zzack(zzb, zzb(jArr[i], jArr2[i]));
        }
        return new zzack(zzb, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
