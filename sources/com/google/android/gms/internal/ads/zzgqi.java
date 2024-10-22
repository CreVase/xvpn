package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzgqi extends zzgtz implements zzgvk {
    private static final zzgqi zzb;
    private String zzd = "";
    private zzgui zze = zzgtz.zzaN();

    static {
        zzgqi zzgqiVar = new zzgqi();
        zzb = zzgqiVar;
        zzgtz.zzaU(zzgqi.class, zzgqiVar);
    }

    private zzgqi() {
    }

    public static zzgqi zzc() {
        return zzb;
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
                    return new zzgqh(null);
                }
                return new zzgqi();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgph.class});
        }
        return (byte) 1;
    }
}
