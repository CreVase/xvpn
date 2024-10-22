package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgod extends zzgtz implements zzgvk {
    private static final zzgod zzb;
    private int zzd;
    private int zze;

    static {
        zzgod zzgodVar = new zzgod();
        zzb = zzgodVar;
        zzgtz.zzaU(zzgod.class, zzgodVar);
    }

    private zzgod() {
    }

    public static zzgoc zzc() {
        return (zzgoc) zzb.zzaA();
    }

    public static zzgod zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgod) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
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
                    return new zzgoc(null);
                }
                return new zzgod();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }
}
