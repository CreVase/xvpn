package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabv {
    public static int zza(zzfb zzfbVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzfbVar.zzl() + 1;
            case 7:
                return zzfbVar.zzp() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzabn zzabnVar, zzabz zzabzVar) throws IOException {
        boolean z;
        int i;
        zzabnVar.zzj();
        zzabc zzabcVar = (zzabc) zzabnVar;
        zzabcVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzabcVar.zzm(bArr, 0, 1, false);
        int i2 = bArr[0] & 1;
        if (1 != i2) {
            z = false;
        } else {
            z = true;
        }
        zzabcVar.zzl(2, false);
        if (1 != i2) {
            i = 6;
        } else {
            i = 7;
        }
        zzfb zzfbVar = new zzfb(i);
        zzfbVar.zzF(zzabq.zza(zzabnVar, zzfbVar.zzI(), 0, i));
        zzabnVar.zzj();
        zzabu zzabuVar = new zzabu();
        if (zzd(zzfbVar, zzabzVar, z, zzabuVar)) {
            return zzabuVar.zza;
        }
        throw zzcc.zza(null, null);
    }

    public static boolean zzc(zzfb zzfbVar, zzabz zzabzVar, int i, zzabu zzabuVar) {
        boolean z;
        int zza;
        int zzc = zzfbVar.zzc();
        long zzt = zzfbVar.zzt();
        long j = zzt >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        long j2 = zzt >> 12;
        long j3 = zzt >> 8;
        long j4 = zzt >> 4;
        long j5 = zzt >> 1;
        long j6 = zzt & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzabzVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzabzVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 == 0 || i3 == zzabzVar.zzi) && j6 != 1 && zzd(zzfbVar, zzabzVar, z, zzabuVar) && (zza = zza(zzfbVar, (int) (j2 & 15))) != -1 && zza <= zzabzVar.zzb) {
            int i4 = zzabzVar.zze;
            int i5 = (int) (j3 & 15);
            if (i5 != 0) {
                if (i5 <= 11) {
                    if (i5 != zzabzVar.zzf) {
                        return false;
                    }
                } else if (i5 == 12) {
                    if (zzfbVar.zzl() * 1000 != i4) {
                        return false;
                    }
                } else if (i5 <= 14) {
                    int zzp = zzfbVar.zzp();
                    if (i5 == 14) {
                        zzp *= 10;
                    }
                    if (zzp != i4) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (zzfbVar.zzl() == zzfk.zze(zzfbVar.zzI(), zzc, zzfbVar.zzc() - 1, 0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean zzd(zzfb zzfbVar, zzabz zzabzVar, boolean z, zzabu zzabuVar) {
        try {
            long zzv = zzfbVar.zzv();
            if (!z) {
                zzv *= zzabzVar.zzb;
            }
            zzabuVar.zza = zzv;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
