package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;

/* loaded from: classes.dex */
public final class zzpq {
    private Boolean zza;

    public zzpq() {
    }

    public zzpq(Context context) {
    }

    public final zzoq zza(zzam zzamVar, zzk zzkVar) {
        zzamVar.getClass();
        zzkVar.getClass();
        int i = zzfk.zza;
        if (i >= 29 && zzamVar.zzA != -1) {
            Boolean bool = this.zza;
            if (bool != null) {
                bool.booleanValue();
            } else {
                Boolean bool2 = Boolean.FALSE;
                this.zza = bool2;
                bool2.booleanValue();
            }
            String str = zzamVar.zzm;
            str.getClass();
            int zza = zzcb.zza(str, zzamVar.zzj);
            if (zza != 0 && i >= zzfk.zzf(zza)) {
                int zzg = zzfk.zzg(zzamVar.zzz);
                if (zzg == 0) {
                    return zzoq.zza;
                }
                try {
                    AudioFormat zzu = zzfk.zzu(zzamVar.zzA, zzg, zza);
                    if (i >= 31) {
                        return zzpp.zza(zzu, zzkVar.zza().zza, false);
                    }
                    return zzpo.zza(zzu, zzkVar.zza().zza, false);
                } catch (IllegalArgumentException unused) {
                    return zzoq.zza;
                }
            }
            return zzoq.zza;
        }
        return zzoq.zza;
    }
}
