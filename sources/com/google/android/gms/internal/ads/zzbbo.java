package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbo extends zzgtz implements zzgvk {
    private static final zzbbo zzb;
    private int zzd;
    private int zze = 1000;
    private zzbbc zzf;

    static {
        zzbbo zzbboVar = new zzbbo();
        zzb = zzbboVar;
        zzgtz.zzaU(zzbbo.class, zzbboVar);
    }

    private zzbbo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzbbn(null);
                }
                return new zzbbo();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzazi.zza, "zzf"});
        }
        return (byte) 1;
    }
}
