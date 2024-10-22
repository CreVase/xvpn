package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaps extends zzgtz implements zzgvk {
    private static final zzaps zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgsr zzg = zzgsr.zzb;

    static {
        zzaps zzapsVar = new zzaps();
        zzb = zzapsVar;
        zzgtz.zzaU(zzaps.class, zzapsVar);
    }

    private zzaps() {
    }

    public static zzaps zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
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
                    return new zzapr(zzaolVar);
                }
                return new zzaps();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
