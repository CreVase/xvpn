package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzban extends zzgtz implements zzgvk {
    private static final zzban zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzban zzbanVar = new zzban();
        zzb = zzbanVar;
        zzgtz.zzaU(zzban.class, zzbanVar);
    }

    private zzban() {
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
                    return new zzbam(zzaycVar);
                }
                return new zzban();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
