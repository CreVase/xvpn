package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaba implements zzacm {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaba(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        } else {
            this.zzf = 0L;
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.zza);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        p71.A(sb, arrays2, ", timeUs=", arrays3, ", durationsUs=");
        return hx2.s(sb, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        long[] jArr = this.zze;
        int zzc = zzfk.zzc(jArr, j, true, true);
        zzacn zzacnVar = new zzacn(jArr[zzc], this.zzc[zzc]);
        if (zzacnVar.zzb < j && zzc != this.zza - 1) {
            int i = zzc + 1;
            return new zzack(zzacnVar, new zzacn(this.zze[i], this.zzc[i]));
        }
        return new zzack(zzacnVar, zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
