package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgys extends zzgtz implements zzgvk {
    private static final zzgys zzb;
    private int zzd;
    private zzgsr zze;
    private zzgsr zzf;
    private zzgsr zzg;

    static {
        zzgys zzgysVar = new zzgys();
        zzb = zzgysVar;
        zzgtz.zzaU(zzgys.class, zzgysVar);
    }

    private zzgys() {
        zzgsr zzgsrVar = zzgsr.zzb;
        this.zze = zzgsrVar;
        this.zzf = zzgsrVar;
        this.zzg = zzgsrVar;
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
                    return new zzgyr(null);
                }
                return new zzgys();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
