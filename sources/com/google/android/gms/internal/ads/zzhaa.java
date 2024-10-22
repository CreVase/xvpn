package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhaa extends zzgtz implements zzgvk {
    private static final zzhaa zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhaa zzhaaVar = new zzhaa();
        zzb = zzhaaVar;
        zzgtz.zzaU(zzhaa.class, zzhaaVar);
    }

    private zzhaa() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgxt zzgxtVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgzz(zzgxtVar);
                }
                return new zzhaa();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
