package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgqo extends zzgtz implements zzgvk {
    private static final zzgqo zzb;
    private int zzd;

    static {
        zzgqo zzgqoVar = new zzgqo();
        zzb = zzgqoVar;
        zzgtz.zzaU(zzgqo.class, zzgqoVar);
    }

    private zzgqo() {
    }

    public static zzgqo zzc() {
        return zzb;
    }

    public static zzgqo zzd(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgqo) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
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
                    return new zzgqn(null);
                }
                return new zzgqo();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
