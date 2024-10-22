package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgog extends zzgtz implements zzgvk {
    private static final zzgog zzb;
    private int zzd;
    private zzgsr zze = zzgsr.zzb;

    static {
        zzgog zzgogVar = new zzgog();
        zzb = zzgogVar;
        zzgtz.zzaU(zzgog.class, zzgogVar);
    }

    private zzgog() {
    }

    public static zzgof zzc() {
        return (zzgof) zzb.zzaA();
    }

    public static zzgog zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgog) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
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
                    zzgoe zzgoeVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgof(zzgoeVar);
                }
                return new zzgog();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsr zzf() {
        return this.zze;
    }
}
