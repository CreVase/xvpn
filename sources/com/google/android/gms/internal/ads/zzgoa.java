package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgoa extends zzgtz implements zzgvk {
    private static final zzgoa zzb;
    private int zzd;
    private zzgsr zze = zzgsr.zzb;

    static {
        zzgoa zzgoaVar = new zzgoa();
        zzb = zzgoaVar;
        zzgtz.zzaU(zzgoa.class, zzgoaVar);
    }

    private zzgoa() {
    }

    public static zzgnz zzc() {
        return (zzgnz) zzb.zzaA();
    }

    public static zzgoa zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgoa) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
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
                    zzgny zzgnyVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnz(zzgnyVar);
                }
                return new zzgoa();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsr zzf() {
        return this.zze;
    }
}
