package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzahu {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzabn zzabnVar) throws IOException {
        return zzc(zzabnVar, true, false);
    }

    public static boolean zzb(zzabn zzabnVar, boolean z) throws IOException {
        return zzc(zzabnVar, false, false);
    }

    private static boolean zzc(zzabn zzabnVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long j;
        int i;
        long zzd = zzabnVar.zzd();
        long j2 = 4096;
        long j3 = -1;
        if (zzd != -1 && zzd <= 4096) {
            j2 = zzd;
        }
        zzfb zzfbVar = new zzfb(64);
        int i2 = (int) j2;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            zzfbVar.zzD(8);
            if (!zzabnVar.zzm(zzfbVar.zzI(), 0, 8, true)) {
                break;
            }
            long zzt = zzfbVar.zzt();
            int zzf = zzfbVar.zzf();
            if (zzt == 1) {
                zzabnVar.zzh(zzfbVar.zzI(), 8, 8);
                i = 16;
                zzfbVar.zzF(16);
                j = zzfbVar.zzs();
            } else {
                if (zzt == 0) {
                    long zzd2 = zzabnVar.zzd();
                    if (zzd2 != j3) {
                        zzt = (zzd2 - zzabnVar.zze()) + 8;
                    }
                }
                j = zzt;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                return false;
            }
            i3 += i;
            if (zzf == 1836019574) {
                i2 += (int) j;
                if (zzd != -1 && i2 > zzd) {
                    i2 = (int) zzd;
                }
            } else if (zzf != 1836019558 && zzf != 1836475768) {
                long j5 = zzd;
                if ((i3 + j) - j4 >= i2) {
                    break;
                }
                int i4 = (int) (j - j4);
                i3 += i4;
                if (zzf == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    zzfbVar.zzD(i4);
                    zzabnVar.zzh(zzfbVar.zzI(), 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 == 1) {
                            zzfbVar.zzH(4);
                        } else {
                            int zzf2 = zzfbVar.zzf();
                            if ((zzf2 >>> 8) != 3368816) {
                                if (zzf2 == 1751476579) {
                                    zzf2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != zzf2) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i4 != 0) {
                    zzabnVar.zzg(i4);
                }
                zzd = j5;
            } else {
                z3 = true;
                break;
            }
            j3 = -1;
        }
        z3 = false;
        if (!z4 || z != z3) {
            return false;
        }
        return true;
    }
}
