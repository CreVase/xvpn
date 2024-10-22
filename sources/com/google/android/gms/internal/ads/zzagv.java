package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagv implements zzagt {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzagv(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzagv zzb(long j, long j2, zzacg zzacgVar, zzfb zzfbVar) {
        int zzo;
        int i = zzacgVar.zzg;
        int i2 = zzacgVar.zzd;
        int zzf = zzfbVar.zzf();
        if ((zzf & 1) == 1 && (zzo = zzfbVar.zzo()) != 0) {
            int i3 = zzf & 6;
            long zzr = zzfk.zzr(zzo, i * 1000000, i2);
            if (i3 != 6) {
                return new zzagv(j2, zzacgVar.zzc, zzr, -1L, null);
            }
            long zzt = zzfbVar.zzt();
            long[] jArr = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr[i4] = zzfbVar.zzl();
            }
            if (j != -1) {
                long j3 = j2 + zzt;
                if (j != j3) {
                    zzer.zzf("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
                }
            }
            return new zzagv(j2, zzacgVar.zzc, zzr, zzt, jArr);
        }
        return null;
    }

    private final long zze(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final long zzd(long j) {
        long j2;
        double d;
        if (zzh()) {
            long j3 = j - this.zza;
            if (j3 > this.zzb) {
                long[] jArr = this.zzf;
                zzdx.zzb(jArr);
                double d2 = (j3 * 256.0d) / this.zzd;
                int zzc = zzfk.zzc(jArr, (long) d2, true, true);
                long zze = zze(zzc);
                long j4 = jArr[zzc];
                int i = zzc + 1;
                long zze2 = zze(i);
                if (zzc == 99) {
                    j2 = 256;
                } else {
                    j2 = jArr[i];
                }
                if (j4 == j2) {
                    d = 0.0d;
                } else {
                    d = (d2 - j4) / (j2 - j4);
                }
                return Math.round(d * (zze2 - zze)) + zze;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        double d;
        if (!zzh()) {
            zzacn zzacnVar = new zzacn(0L, this.zza + this.zzb);
            return new zzack(zzacnVar, zzacnVar);
        }
        long max = Math.max(0L, Math.min(j, this.zzc));
        double d2 = (max * 100.0d) / this.zzc;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.zzf;
                zzdx.zzb(jArr);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = ((d - d4) * (d2 - i)) + d4;
            }
        }
        long j2 = this.zzd;
        zzacn zzacnVar2 = new zzacn(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d3 / 256.0d) * j2), j2 - 1)));
        return new zzack(zzacnVar2, zzacnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return this.zzf != null;
    }
}
