package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzape extends zzgtz implements zzgvk {
    private static final zzape zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzape zzapeVar = new zzape();
        zzb = zzapeVar;
        zzgtz.zzaU(zzape.class, zzapeVar);
    }

    private zzape() {
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
                    return new zzapd(zzaolVar);
                }
                return new zzape();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzapp.zza});
        }
        return (byte) 1;
    }
}
