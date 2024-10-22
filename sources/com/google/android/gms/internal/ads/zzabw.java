package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzabw {
    public static zzby zza(zzabn zzabnVar, boolean z) throws IOException {
        zzafe zzafeVar;
        if (z) {
            zzafeVar = null;
        } else {
            zzafeVar = zzafg.zza;
        }
        zzby zza = new zzace().zza(zzabnVar, zzafeVar);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzaby zzb(zzfb zzfbVar) {
        zzfbVar.zzH(1);
        int zzn = zzfbVar.zzn();
        long zzc = zzfbVar.zzc();
        long j = zzn;
        int i = zzn / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzs = zzfbVar.zzs();
            if (zzs == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzs;
            jArr2[i2] = zzfbVar.zzs();
            zzfbVar.zzH(2);
            i2++;
        }
        zzfbVar.zzH((int) ((zzc + j) - zzfbVar.zzc()));
        return new zzaby(jArr, jArr2);
    }
}
