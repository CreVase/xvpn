package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgoj extends zzgtz implements zzgvk {
    private static final zzgoj zzb;

    static {
        zzgoj zzgojVar = new zzgoj();
        zzb = zzgojVar;
        zzgtz.zzaU(zzgoj.class, zzgojVar);
    }

    private zzgoj() {
    }

    public static zzgoj zzc() {
        return zzb;
    }

    public static zzgoj zzd(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgoj) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
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
                    return new zzgoi(null);
                }
                return new zzgoj();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
