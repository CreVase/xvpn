package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyw extends zzgtz implements zzgvk {
    private static final zzgyw zzb;
    private int zzd;
    private int zze;
    private zzgsr zzf;
    private zzgsr zzg;

    static {
        zzgyw zzgywVar = new zzgyw();
        zzb = zzgywVar;
        zzgtz.zzaU(zzgyw.class, zzgywVar);
    }

    private zzgyw() {
        zzgsr zzgsrVar = zzgsr.zzb;
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
                    return new zzgyv(null);
                }
                return new zzgyw();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
