package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhag extends zzgtz implements zzgvk {
    private static final zzhag zzb;
    private int zzd;
    private String zze = "";

    static {
        zzhag zzhagVar = new zzhag();
        zzb = zzhagVar;
        zzgtz.zzaU(zzhag.class, zzhagVar);
    }

    private zzhag() {
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
                    return new zzhaf(zzgxtVar);
                }
                return new zzhag();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
