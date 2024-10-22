package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbat extends zzgtz implements zzgvk {
    private static final zzbat zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbat zzbatVar = new zzbat();
        zzb = zzbatVar;
        zzgtz.zzaU(zzbat.class, zzbatVar);
    }

    private zzbat() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzayc zzaycVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzbas(zzaycVar);
                }
                return new zzbat();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
