package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaoh extends zzgtz implements zzgvk {
    private static final zzaoh zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzaoh zzaohVar = new zzaoh();
        zzb = zzaohVar;
        zzgtz.zzaU(zzaoh.class, zzaohVar);
    }

    private zzaoh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzaod zzaodVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaog(zzaodVar);
                }
                return new zzaoh();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", zzaoi.zza});
        }
        return (byte) 1;
    }
}
