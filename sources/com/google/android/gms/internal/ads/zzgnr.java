package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgnr extends zzgtz implements zzgvk {
    private static final zzgnr zzb;
    private int zzd;

    static {
        zzgnr zzgnrVar = new zzgnr();
        zzb = zzgnrVar;
        zzgtz.zzaU(zzgnr.class, zzgnrVar);
    }

    private zzgnr() {
    }

    public static zzgnq zzc() {
        return (zzgnq) zzb.zzaA();
    }

    public static zzgnr zze() {
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
                    return new zzgnq(null);
                }
                return new zzgnr();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
