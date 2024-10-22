package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzacf implements zzacm {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzacf(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        if (length2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzd = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        } else {
            this.zza = jArr;
            this.zzb = jArr2;
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        if (!this.zzd) {
            zzacn zzacnVar = zzacn.zza;
            return new zzack(zzacnVar, zzacnVar);
        }
        int zzc = zzfk.zzc(this.zzb, j, true, true);
        zzacn zzacnVar2 = new zzacn(this.zzb[zzc], this.zza[zzc]);
        if (zzacnVar2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzc != jArr.length - 1) {
                int i = zzc + 1;
                return new zzack(zzacnVar2, new zzacn(jArr[i], this.zza[i]));
            }
        }
        return new zzack(zzacnVar2, zzacnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return this.zzd;
    }
}
