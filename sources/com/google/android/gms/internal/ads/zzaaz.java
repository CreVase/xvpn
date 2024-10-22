package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaaz {
    public static void zza(long j, zzfb zzfbVar, zzacs[] zzacsVarArr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (zzfbVar.zza() > 1) {
                int zzc = zzc(zzfbVar);
                int zzc2 = zzc(zzfbVar);
                int zzc3 = zzfbVar.zzc() + zzc2;
                if (zzc2 != -1 && zzc2 <= zzfbVar.zza()) {
                    if (zzc == 4 && zzc2 >= 8) {
                        int zzl = zzfbVar.zzl();
                        int zzp = zzfbVar.zzp();
                        if (zzp == 49) {
                            i = zzfbVar.zzf();
                            zzp = 49;
                        } else {
                            i = 0;
                        }
                        int zzl2 = zzfbVar.zzl();
                        if (zzp == 47) {
                            zzfbVar.zzH(1);
                            zzp = 47;
                        }
                        if (zzl == 181 && ((zzp == 49 || zzp == 47) && zzl2 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zzp == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            zzb(j, zzfbVar, zzacsVarArr);
                        }
                    }
                } else {
                    zzer.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzc3 = zzfbVar.zzd();
                }
                zzfbVar.zzG(zzc3);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j, zzfb zzfbVar, zzacs[] zzacsVarArr) {
        int zzl = zzfbVar.zzl();
        if ((zzl & 64) != 0) {
            int i = zzl & 31;
            zzfbVar.zzH(1);
            int zzc = zzfbVar.zzc();
            for (zzacs zzacsVar : zzacsVarArr) {
                int i2 = i * 3;
                zzfbVar.zzG(zzc);
                zzacsVar.zzr(zzfbVar, i2);
                if (j != -9223372036854775807L) {
                    zzacsVar.zzt(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzfb zzfbVar) {
        int i = 0;
        while (zzfbVar.zza() != 0) {
            int zzl = zzfbVar.zzl();
            i += zzl;
            if (zzl != 255) {
                return i;
            }
        }
        return -1;
    }
}
