package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgqd extends zzgtz implements zzgvk {
    private static final zzgqd zzb;
    private int zzd;
    private String zze = "";
    private zzgpe zzf;

    static {
        zzgqd zzgqdVar = new zzgqd();
        zzb = zzgqdVar;
        zzgtz.zzaU(zzgqd.class, zzgqdVar);
    }

    private zzgqd() {
    }

    public static zzgqd zzd() {
        return zzb;
    }

    public static zzgqd zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgqd) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public final zzgpe zza() {
        zzgpe zzgpeVar = this.zzf;
        if (zzgpeVar == null) {
            return zzgpe.zzd();
        }
        return zzgpeVar;
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
                    return new zzgqc(null);
                }
                return new zzgqd();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzd & 1) != 0;
    }
}
