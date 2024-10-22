package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgnu extends zzgtz implements zzgvk {
    private static final zzgnu zzb;
    private int zzd;
    private zzgsr zze = zzgsr.zzb;

    static {
        zzgnu zzgnuVar = new zzgnu();
        zzb = zzgnuVar;
        zzgtz.zzaU(zzgnu.class, zzgnuVar);
    }

    private zzgnu() {
    }

    public static zzgnt zzc() {
        return (zzgnt) zzb.zzaA();
    }

    public static zzgnu zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgnu) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
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
                    zzgns zzgnsVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnt(zzgnsVar);
                }
                return new zzgnu();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsr zzf() {
        return this.zze;
    }
}
