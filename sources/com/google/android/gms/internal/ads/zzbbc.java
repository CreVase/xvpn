package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbc extends zzgtz implements zzgvk {
    private static final zzbbc zzb;
    private int zzd;
    private int zze;

    static {
        zzbbc zzbbcVar = new zzbbc();
        zzb = zzbbcVar;
        zzgtz.zzaU(zzbbc.class, zzbbcVar);
    }

    private zzbbc() {
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
                    return new zzbba(zzaycVar);
                }
                return new zzbbc();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzbbb.zza});
        }
        return (byte) 1;
    }
}
