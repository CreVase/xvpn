package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzaki {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfb zzb = new zzfb();

    public zzaki(int i) {
    }

    private final int zze(zzabn zzabnVar) {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
        this.zzc = true;
        zzabnVar.zzj();
        return 0;
    }

    public final int zza(zzabn zzabnVar, zzacj zzacjVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzabnVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzabnVar.zzd();
            int min = (int) Math.min(112800L, zzd);
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
            int zzd2 = zzfbVar.zzd();
            int i2 = zzd2 - 188;
            while (true) {
                if (i2 < zzc) {
                    break;
                }
                byte[] zzI = zzfbVar.zzI();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 >= zzc && i5 < zzd2 && zzI[i5] == 71) {
                        i4++;
                        if (i4 == 5) {
                            long zzb = zzaks.zzb(zzfbVar, i2, i);
                            if (zzb != -9223372036854775807L) {
                                j = zzb;
                                break;
                            }
                        }
                    } else {
                        i4 = 0;
                    }
                    i3++;
                }
                i2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zze(zzabnVar);
            return 0;
        }
        if (!this.zzd) {
            int min2 = (int) Math.min(112800L, zzabnVar.zzd());
            if (zzabnVar.zzf() != 0) {
                zzacjVar.zza = 0L;
                return 1;
            }
            this.zzb.zzD(min2);
            zzabnVar.zzj();
            ((zzabc) zzabnVar).zzm(this.zzb.zzI(), 0, min2, false);
            zzfb zzfbVar2 = this.zzb;
            int zzc2 = zzfbVar2.zzc();
            int zzd3 = zzfbVar2.zzd();
            while (true) {
                if (zzc2 >= zzd3) {
                    break;
                }
                if (zzfbVar2.zzI()[zzc2] == 71) {
                    long zzb2 = zzaks.zzb(zzfbVar2, zzc2, i);
                    if (zzb2 != -9223372036854775807L) {
                        j = zzb2;
                        break;
                    }
                }
                zzc2++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L) {
            zze(zzabnVar);
            return 0;
        }
        zzfi zzfiVar = this.zza;
        long zzb3 = zzfiVar.zzb(this.zzg) - zzfiVar.zzb(j3);
        this.zzh = zzb3;
        if (zzb3 < 0) {
            zzer.zzf("TsDurationReader", "Invalid duration: " + zzb3 + ". Using TIME_UNSET instead.");
            this.zzh = -9223372036854775807L;
        }
        zze(zzabnVar);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
