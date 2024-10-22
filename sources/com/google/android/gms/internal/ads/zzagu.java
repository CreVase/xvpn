package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagu implements zzagt {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzagu(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzagu zzb(long j, long j2, zzacg zzacgVar, zzfb zzfbVar) {
        int i;
        int zzl;
        zzfbVar.zzH(10);
        int zzf = zzfbVar.zzf();
        if (zzf <= 0) {
            return null;
        }
        int i2 = zzacgVar.zzd;
        if (i2 >= 32000) {
            i = 1152;
        } else {
            i = 576;
        }
        long zzr = zzfk.zzr(zzf, i * 1000000, i2);
        int zzp = zzfbVar.zzp();
        int zzp2 = zzfbVar.zzp();
        int zzp3 = zzfbVar.zzp();
        zzfbVar.zzH(2);
        long j3 = j2 + zzacgVar.zzc;
        long[] jArr = new long[zzp];
        long[] jArr2 = new long[zzp];
        int i3 = 0;
        long j4 = j2;
        while (i3 < zzp) {
            int i4 = zzp2;
            long j5 = j3;
            jArr[i3] = (i3 * zzr) / zzp;
            jArr2[i3] = Math.max(j4, j5);
            if (zzp3 != 1) {
                if (zzp3 != 2) {
                    if (zzp3 != 3) {
                        if (zzp3 != 4) {
                            return null;
                        }
                        zzl = zzfbVar.zzo();
                    } else {
                        zzl = zzfbVar.zzn();
                    }
                } else {
                    zzl = zzfbVar.zzp();
                }
            } else {
                zzl = zzfbVar.zzl();
            }
            j4 += zzl * i4;
            i3++;
            j3 = j5;
            zzp2 = i4;
            zzp = zzp;
        }
        if (j != -1 && j != j4) {
            zzer.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzagu(jArr, jArr2, zzr, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final long zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final long zzd(long j) {
        return this.zza[zzfk.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        long[] jArr = this.zza;
        int zzc = zzfk.zzc(jArr, j, true, true);
        zzacn zzacnVar = new zzacn(jArr[zzc], this.zzb[zzc]);
        if (zzacnVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i = zzc + 1;
                return new zzack(zzacnVar, new zzacn(jArr2[i], this.zzb[i]));
            }
        }
        return new zzack(zzacnVar, zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
