package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgni extends zzgtz implements zzgvk {
    private static final zzgni zzb;
    private int zzd;

    static {
        zzgni zzgniVar = new zzgni();
        zzb = zzgniVar;
        zzgtz.zzaU(zzgni.class, zzgniVar);
    }

    private zzgni() {
    }

    public static zzgnh zzc() {
        return (zzgnh) zzb.zzaA();
    }

    public static zzgni zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
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
                    return new zzgnh(null);
                }
                return new zzgni();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
