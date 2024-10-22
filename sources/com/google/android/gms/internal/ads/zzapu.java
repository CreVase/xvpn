package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzapu extends zzgtz implements zzgvk {
    private static final zzapu zzb;
    private int zzd;
    private String zze = "";

    static {
        zzapu zzapuVar = new zzapu();
        zzb = zzapuVar;
        zzgtz.zzaU(zzapu.class, zzapuVar);
    }

    private zzapu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzaol zzaolVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzapt(zzaolVar);
                }
                return new zzapu();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
