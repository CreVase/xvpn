package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpx extends zzgtz implements zzgvk {
    private static final zzgpx zzb;
    private String zzd = "";

    static {
        zzgpx zzgpxVar = new zzgpx();
        zzb = zzgpxVar;
        zzgtz.zzaU(zzgpx.class, zzgpxVar);
    }

    private zzgpx() {
    }

    public static zzgpx zzc() {
        return zzb;
    }

    public static zzgpx zzd(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgpx) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgpv zzgpvVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgpw(zzgpvVar);
                }
                return new zzgpx();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final String zze() {
        return this.zzd;
    }
}
