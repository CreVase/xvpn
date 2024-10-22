package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzajz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfb zzb = new zzfb();

    public static long zzc(zzfb zzfbVar) {
        int zzc = zzfbVar.zzc();
        if (zzfbVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfbVar.zzC(bArr, 0, 9);
        zzfbVar.zzG(zzc);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b2;
                    long j2 = b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b4 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzabn zzabnVar) {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
        this.zzc = true;
        zzabnVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzabnVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzabnVar.zzf() != j2) {
                zzacjVar.zza = j2;
                return 1;
            }
            this.zzb.zzD(min);
            zzabnVar.zzj();
            ((zzabc) zzabnVar).zzm(this.zzb.zzI(), 0, min, false);
            zzfb zzfbVar = this.zzb;
            int zzc = zzfbVar.zzc();
            int zzd2 = zzfbVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzfbVar.zzI(), zzd2) == 442) {
                    zzfbVar.zzG(zzd2 + 4);
                    long zzc2 = zzc(zzfbVar);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzabnVar);
            return 0;
        }
        if (!this.zzd) {
            int min2 = (int) Math.min(20000L, zzabnVar.zzd());
            if (zzabnVar.zzf() != 0) {
                zzacjVar.zza = 0L;
                return 1;
            }
            this.zzb.zzD(min2);
            zzabnVar.zzj();
            ((zzabc) zzabnVar).zzm(this.zzb.zzI(), 0, min2, false);
            zzfb zzfbVar2 = this.zzb;
            int zzc3 = zzfbVar2.zzc();
            int zzd3 = zzfbVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzfbVar2.zzI(), zzc3) == 442) {
                    zzfbVar2.zzG(zzc3 + 4);
                    long zzc4 = zzc(zzfbVar2);
                    if (zzc4 != -9223372036854775807L) {
                        j = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L) {
            zzf(zzabnVar);
            return 0;
        }
        zzfi zzfiVar = this.zza;
        long zzb = zzfiVar.zzb(this.zzg) - zzfiVar.zzb(j3);
        this.zzh = zzb;
        if (zzb < 0) {
            zzer.zzf("PsDurationReader", "Invalid duration: " + zzb + ". Using TIME_UNSET instead.");
            this.zzh = -9223372036854775807L;
        }
        zzf(zzabnVar);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
