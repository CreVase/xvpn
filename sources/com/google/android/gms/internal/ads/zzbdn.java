package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzbdn {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbdn(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbdn zza(String str, double d) {
        return new zzbdn(str, Double.valueOf(d), 3);
    }

    public static zzbdn zzb(String str, long j) {
        return new zzbdn(str, Long.valueOf(j), 2);
    }

    public static zzbdn zzc(String str, String str2) {
        return new zzbdn(str, str2, 4);
    }

    public static zzbdn zzd(String str, boolean z) {
        return new zzbdn(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzber zza = zzbet.zza();
        if (zza == null) {
            if (zzbet.zzb() != null) {
                zzbet.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
