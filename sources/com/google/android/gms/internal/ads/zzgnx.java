package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgnx extends zzgtz implements zzgvk {
    private static final zzgnx zzb;
    private int zzd;
    private int zze;

    static {
        zzgnx zzgnxVar = new zzgnx();
        zzb = zzgnxVar;
        zzgtz.zzaU(zzgnx.class, zzgnxVar);
    }

    private zzgnx() {
    }

    public static zzgnw zzc() {
        return (zzgnw) zzb.zzaA();
    }

    public static zzgnx zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgnx) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
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
                    return new zzgnw(null);
                }
                return new zzgnx();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
